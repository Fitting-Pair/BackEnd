package smu.FittingPair.error.exception;


import smu.FittingPair.error.ErrorCode;


public class TokenExpiredException extends BusinessBaseException{
    public TokenExpiredException(ErrorCode errorCode) {
        super(errorCode);
    }
}
