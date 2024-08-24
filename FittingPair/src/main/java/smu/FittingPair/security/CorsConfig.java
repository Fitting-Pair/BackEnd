package smu.FittingPair.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class CorsConfig {
    @Bean
    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOrigins(Arrays.asList("https://fitting-pair.vercel.app","https://localhost:5173"));
        corsConfiguration.setAllowedMethods(Collections.singletonList("*")); //모든 요청 메서드를 허용
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedHeaders(Arrays.asList("Authorization","Refresh","Content-Type"));
        corsConfiguration.setMaxAge(3600L);
        corsConfiguration.setExposedHeaders(Arrays.asList("Authorization","Refresh"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);
        return source;
    }

}
