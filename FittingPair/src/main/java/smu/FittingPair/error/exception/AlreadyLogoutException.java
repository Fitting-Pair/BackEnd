package smu.FittingPair.error.exception;


import smu.FittingPair.error.ErrorCode;


public class AlreadyLogoutException extends BusinessBaseException{
    public AlreadyLogoutException(ErrorCode errorCode) {
        super(errorCode);
    }
}
