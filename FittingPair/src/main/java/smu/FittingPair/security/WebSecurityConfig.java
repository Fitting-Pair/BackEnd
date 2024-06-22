package smu.FittingPair.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import smu.FittingPair.Service.UserDetailService;

//실제 인증 처리
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
    private final UserDetailService userDetailService;
    @Bean
    public WebSecurityCustomizer configure(){  // static 하위 경로 메소드에 대해서 스프링 시큐리티 기능 비활성화
        return(web) -> web.ignoring()
                .requestMatchers(new AntPathRequestMatcher("/static/**"));
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable);
        http
                .authorizeHttpRequests(
                        (auth) -> auth
                                .requestMatchers("/users/login","/","/users/logout","/users/signup").permitAll()
                                .anyRequest().authenticated() //외에 다른 요청은 인증된 사용자만 가능
                );
        http
                .sessionManagement((session) -> session //세션 비활성화
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();

    }


}
