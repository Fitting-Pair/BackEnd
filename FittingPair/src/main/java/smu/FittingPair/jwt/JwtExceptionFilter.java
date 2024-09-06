package smu.FittingPair.jwt;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.util.JsonMapper;
import smu.FittingPair.util.response.BaseResponse;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//클라이언트 요청 시 JWT가 유효한지 검사
@RequiredArgsConstructor
@Slf4j
@Component
public class JwtExceptionFilter extends OncePerRequestFilter {
    private final JWTProvider jwtProvider;
    private final ObjectMapper objectMapper;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response); //JwtAuthenticationFilter로 이동
        } catch (JwtException ex) {
            //JwtAuthenticationFilter에 에외 발생하면 예외처리
            ErrorCode errorCode = ErrorCode.UNAUTHORIZED;
            setErrorResponse(response, errorCode);
        }
    }
    public void setErrorResponse(HttpServletResponse response, ErrorCode errorCode) throws IOException{
        BaseResponse<Object> baseResponse = BaseResponse.fail(errorCode);
        response.setStatus(errorCode.getCode());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(errorCode.getCode());
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(baseResponse));
    }

}
