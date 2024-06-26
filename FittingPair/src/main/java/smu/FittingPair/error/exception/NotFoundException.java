package smu.FittingPair.error.exception;

import smu.FittingPair.error.ErrorCode;

public class NotFoundException extends BusinessBaseException{
    public NotFoundException(ErrorCode errorCode){
        super(errorCode);
    }
}
