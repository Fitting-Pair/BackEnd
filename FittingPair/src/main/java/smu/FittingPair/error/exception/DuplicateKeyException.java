package smu.FittingPair.error.exception;

import smu.FittingPair.error.ErrorCode;

public class DuplicateKeyException extends BusinessBaseException{
    public DuplicateKeyException(ErrorCode errorCode) {
        super(errorCode);
    }
}
