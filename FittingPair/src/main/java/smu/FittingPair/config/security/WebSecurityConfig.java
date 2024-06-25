package smu.FittingPair.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import smu.FittingPair.Service.UserDetailService;

//실제 인증 처리
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
    private final UserDetailService userDetailService;
    // static 하위 경로 메소드에 대해서 스프링 시큐리티 기능 비활성화
    @Bean
    public WebSecurityCustomizer configure(){
        return(web) -> web.ignoring()
                .requestMatchers(new AntPathRequestMatcher("/**")

                );
    }
    //todo: 나머지 완성



}
