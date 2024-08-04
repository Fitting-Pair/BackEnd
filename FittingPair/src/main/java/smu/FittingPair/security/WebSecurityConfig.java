package smu.FittingPair.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import smu.FittingPair.service.CustomUserDetailService;
import smu.FittingPair.jwt.JWTProvider;
import smu.FittingPair.jwt.JwtAuthenticationFilter;

//실제 인증 처리
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
    private final CustomUserDetailService userDetailService;
    private final AuthenticationConfiguration authenticationConfiguration;
    private final JWTProvider jwtProvider;

    @Bean
    public WebSecurityCustomizer configure(){  // static 하위 경로 메소드에 대해서 스프링 시큐리티 기능 비활성화
        return(web) -> web.ignoring()
                .requestMatchers(new AntPathRequestMatcher("/static/**"));
    }
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable);
        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/auth/login","/auth/signup","/","/get/json","/auth/reissue-token").permitAll()
//                        .requestMatchers("/**").permitAll()
                        .anyRequest().authenticated() //외에 다른 요청은 로그인한 사용자만 가능
                );
        http
                .sessionManagement((session) -> session //세션을 항상 stateless 상태: 비활성화
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http
                .addFilterBefore(new JwtAuthenticationFilter(jwtProvider), UsernamePasswordAuthenticationFilter.class);
        return http.build();

    }


}
