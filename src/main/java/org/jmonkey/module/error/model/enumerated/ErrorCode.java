package org.jmonkey.module.error.model.enumerated;

public enum ErrorCode {
    ERR_0(0, "UnMapped exception occurred.Please refer to the developer.surveymonkey.com."), ERR_1000(1000, "Unable to process the request with the" +
            " provided input."), ERR_1001(1001, "The body provided was not a proper JSON string."), ERR_1002(1002, "Invalid schema in the body " +
            "provided."), ERR_1003(1003, "Invalid URL parameters."), ERR_1004(1004, "Invalid request headers."), ERR_1010(1010, "The authorization " +
            "token was not provided."), ERR_1011(1011, "The authorization token provided was invalid."), ERR_1012(1012, "The authorization token " +
            "provided has expired."), ERR_1013(1013, "Client revoked access to the authorization token provided."), ERR_1014(1014, "Permission has " +
            "not been granted by the user to make this request."), ERR_1015(1015, "The user does not have the required plan to make this request.")
    , ERR_1016(1016, "The user does not have permission to access the resource."), ERR_1017(1017, "The user has hit a quota limit on this resource" +
            "."), ERR_1020(1020, "There was an error retrieving the requested resource."), ERR_1025(1025, "Unable to complete the request due to a " +
            "conflict. Check the settings for the resource."), ERR_1026(1026, "The requested resource already exists."), ERR_1030(1030, "The " +
            "requested entity is too large, it can not be returned."), ERR_1040(1040, "Too many requests were made, try again later."), ERR_1050
            (1050, "Oh bananas! We couldn’t process your request."), ERR_1051(1051, "Service unreachable. Please try again later."), ERR_1052(1052,
            "The user you are making this request for has been soft deleted."), ERR_1053(1053, "The user you are making this request for has been " +
            "deleted."),;

    private Integer code;
    private String message;

    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorCode toErrorCode(Integer code) {
        if (code == null) {
            return ERR_0;
        }
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.code.equals(code)) {
                return errorCode;
            }
        }
        return ERR_0;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorCode{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
