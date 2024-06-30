package smu.FittingPair.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;
//에러코드를 한곳에 모은 Enum

@Getter
public enum ErrorCode {
    /* success code */
    SUCCESS(HttpStatus.OK,200,"요청에 성공했습니다."),

    /* error code */

    /* 400 */
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, 400, "요청 형식이 잘못되었습니다."),
    /*401 */
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED,401,"인증되지 않은 사용자입니다."),
    TOKEN_EXPIRED_ERROR(HttpStatus.UNAUTHORIZED,40102,"토큰이 만료되었습니다."),
    ALREADY_LOGGED_OUT_ERROR(HttpStatus.UNAUTHORIZED,40103,"이미 로그아웃한 사용자입니다."),
    /* 403 */
    FORBIDDEN(HttpStatus.FORBIDDEN,403,"회원 정보가 없습니다."),
    /* 404 */
    NOT_FOUND(HttpStatus.NOT_FOUND, 404, "존재하지 않는 엔티티입니다."),
    /* 405 */
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, 405, "잘못된 HTTP 메서드를 호출했습니다."),
    /* 409 */
    DUPLICATE_KEY_ERROR(HttpStatus.CONFLICT,409,"중복된 전화번호가 존재합니다."),
    /* 415 */
    UNSUPPORTED_MEDIA_TYPE_ERROR(HttpStatus.UNSUPPORTED_MEDIA_TYPE,415,"올바른 요청 형식으로 사진 파일을 전송해주세요."),
    /* 500 */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 500, "서버 에러가 발생했습니다.");
    private final String message;
    private final int code;
    private final HttpStatus status;
    ErrorCode(final HttpStatus status,final int code,final String message){
        this.status = status;
        this.code =code;
        this.message = message;
    }

}
