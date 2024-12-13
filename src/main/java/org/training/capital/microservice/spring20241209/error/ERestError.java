package org.training.capital.microservice.spring20241209.error;

public enum ERestError {
    FIELD_VALIDATION_ERROR("field de oluşan validasyon problemi",
                           1024),
    INTERNAL_ERROR("internal error",
                   5001);


    private final String desc;
    private final int    errorCode;

    ERestError(final String sParam,
               final int iParam) {

        desc      = sParam;
        errorCode = iParam;
    }

    public String getDesc() {
        return desc;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
