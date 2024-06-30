package smu.FittingPair.error.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.*;
import smu.FittingPair.config.response.BaseResponse;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    //1. 중복된 키 일 때
    @ExceptionHandler(DuplicateKeyException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    protected BaseResponse<?>handle(DuplicateKeyException e){
        return BaseResponse.fail(e.getErrorCode());
    }
    //2. 권한이 없는 경우
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    protected BaseResponse<?>handle(UnauthorizedException e){
        return BaseResponse.fail(e.getErrorCode());
    }
    //3. 키가 존재하지 않을 경우
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    protected BaseResponse<?>handle(NotFoundException e){
        return BaseResponse.fail(e.getErrorCode());
    }
    //4. 토큰이 만료된 경우
    @ExceptionHandler(TokenExpiredException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    protected BaseResponse<?>handle(TokenExpiredException e){
        return BaseResponse.fail(e.getErrorCode());
    }
    @ExceptionHandler(AlreadyLogoutException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    protected BaseResponse<?>handle(AlreadyLogoutException e){
        return BaseResponse.fail(e.getErrorCode());
    }


}
