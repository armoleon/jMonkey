package org.jmonkey.module.error;

import org.jmonkey.module.error.model.enumerated.ErrorCode;

public class SurveyMonkeyServiceException extends RuntimeException {
    private final ErrorCode errorCode;
    private final Integer httpStatusCode;

    public SurveyMonkeyServiceException(String message, ErrorCode errorCode, Integer httpStatusCode) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatusCode = httpStatusCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SurveyMonkeyServiceException{");
        sb.append("errorCode=").append(errorCode);
        sb.append(", httpStatusCode=").append(httpStatusCode);
        sb.append('}');
        return sb.toString();
    }
}
