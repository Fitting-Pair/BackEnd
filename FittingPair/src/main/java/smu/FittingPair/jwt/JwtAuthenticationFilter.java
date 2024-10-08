package smu.FittingPair.jwt;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.error.exception.TokenExpiredException;
import smu.FittingPair.error.exception.UnauthorizedException;

import java.io.IOException;

//클라이언트 요청 시 JWT가 유효한지 검사
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends GenericFilterBean {
    private final JWTProvider jwtProvider;
    //todo: tokenException 처리
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        String token = resolveToken((HttpServletRequest) request);
        if (token != null && !jwtProvider.isExpired(token) && !jwtProvider.isInBlackList(token)) {
            // 토큰이 유효할 경우 토큰에서 Authentication 객체를 가지고 와서 SecurityContext 에 저장
            Authentication authentication = jwtProvider.getAuthentication(token);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request,response);

    }
    private String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
