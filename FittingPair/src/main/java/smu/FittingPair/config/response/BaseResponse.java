package smu.FittingPair.config.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import smu.FittingPair.error.ErrorCode;
@Builder(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class BaseResponse<T> {
    int code;
    String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    T data;
    /**
     * 정보 요청에 성공한 경우
     * @param data
     */
   public static <T> BaseResponse<T> ok(T data){
       return BaseResponse.<T>builder()  //빌더 객체 생성
               .code(ErrorCode.SUCCESS.getCode())
               .message(ErrorCode.SUCCESS.getMessage())
               .data(data)
               .build();
   }

    public static <T> BaseResponse<T> ok() {
        return BaseResponse.<T>builder()  //빌더 객체 생성
                .code(ErrorCode.SUCCESS.getCode())
                .message(ErrorCode.SUCCESS.getMessage())
                .build();
    }

    public static <T> BaseResponse<T> fail(ErrorCode errorCode) {
        return BaseResponse.<T>builder()  //빌더 객체 생성
                .code(errorCode.getCode())
                .message(errorCode.getMessage())
                .build();
    }

}
