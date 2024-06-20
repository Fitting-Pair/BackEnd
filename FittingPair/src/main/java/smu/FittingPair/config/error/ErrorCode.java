package smu.FittingPair.config.error;

import org.springframework.http.HttpStatus;
//에러코드를 한곳에 모은 Enum
public enum ErrorCode {
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "400", "요청 형식이 잘못되었습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"401","인증되지 않은 사용자입니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN,"403","회원 정보가 없습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "404", "존재하지 않는 엔티티입니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "405", "잘못된 HTTP 메서드를 호출했습니다."),
    USER_CONFLICT(HttpStatus.CONFLICT,"409","중복된 전화번호가 존재합니다."),
    UNSUPPORTED_MEDIA_TYPE_ERROR(HttpStatus.UNSUPPORTED_MEDIA_TYPE,"415","올바른 요청 형식으로 사진 파일을 전송해주세요."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "500", "서버 에러가 발생했습니다.");
    private final String message;
    private final String code;
    private final HttpStatus status;
    ErrorCode(final HttpStatus status,final String code,final String message){
        this.status = status;
        this.code =code;
        this.message = message;
    }

}
