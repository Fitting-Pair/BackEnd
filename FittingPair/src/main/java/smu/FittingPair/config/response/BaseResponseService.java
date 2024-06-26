package smu.FittingPair.config.response;

import smu.FittingPair.error.ErrorCode;

public interface BaseResponseService {
    /**
     * 성공 응답 메서드 - 전달 데이터 있음
     * @param data
     * @param <T> -> generic
     * @Return BaseResponse
     */
    <T> BaseResponse<T> ok(T data);
    /**
     * 성공 응답 메서드- 전달 데이터 없음.
     * void
     * @param <T> -> generic
     * @Return BaseResponse
     */
    <T> BaseResponse <T> ok();

    /**
     * 실패 응답 메서드
     * void
     * @param <T> -> generic
     * @Return BaseResponse
     */
    <T> BaseResponse <T> fail (ErrorCode errorCode);

}
