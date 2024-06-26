package smu.FittingPair.error.exception;

import smu.FittingPair.error.ErrorCode;

public class UnauthorizedException extends BusinessBaseException{
    public UnauthorizedException(ErrorCode errorCode){
        super(errorCode);
    }
}
