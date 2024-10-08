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
    TOKEN_IS_NULL(HttpStatus.UNAUTHORIZED,40104,"토큰 값이 비어있습니다."),
    TOKEN_ERROR(HttpStatus.UNAUTHORIZED,40105,"잘못된 토큰입니다."),
    /* 403 */
    FORBIDDEN(HttpStatus.FORBIDDEN,403,"권한 정보가 없습니다."),
    /* 404 */
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, 404, "존재하지 않는 회원입니다."),
    USER_IMG_NOT_FOUND(HttpStatus.NOT_FOUND, 40401, "존재하지 않는 이미지입니다."),
    USER_OBJ_NOT_FOUND(HttpStatus.NOT_FOUND,40402,"유저 obj 파일이 존재하지 않습니다."),
    RESULT_NOT_FOUND(HttpStatus.NOT_FOUND,40403,"유저 결과가 존재하지 않습니다."),
    BODYSHAPE_NOT_FOUND(HttpStatus.NOT_FOUND,40404,"유저 체형이 존재하지 않습니다."),
    MYPAGE_NOT_FOUND(HttpStatus.NOT_FOUND,40405,"마이페이지가 존재하지 않습니다."),
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
