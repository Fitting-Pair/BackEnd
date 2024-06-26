package smu.FittingPair.error.exception;


import smu.FittingPair.error.ErrorCode;


//비즈니스 로직에서 발생하는 예외를 모아두는 최상위 클래스
public class BusinessBaseException extends RuntimeException{
    public ErrorCode errorCode;

    public BusinessBaseException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
