package az.bdc.course.coursemanagement.exception.utils;

public enum BusinessExceptionCodes implements ExceptionKeyAndMessage {

    WORK_PLACE_TYPE_UNSUITABLE_FOR_LOAN(2001, HttpResponseConstants.INFO, "Work place type is not suitable."),
    NOT_FOUND_DATA_FOR_PRODUCT_ID(2002, HttpResponseConstants.INFO, "Data not found for productId"),
    ERROR_DATA_FOR_PRODUCT_ID(2003, HttpResponseConstants.ERROR,
            "Getting error when call service for productId"),
    LANGUAGE_NOT_RIGHT(2004, HttpResponseConstants.INFO, "Language is not right."),
    SEND_OTP_IN_ACTIVE(2005, HttpResponseConstants.ERROR, "Your sending of otp has been blocked for {} minutes."),
    VERIFY_OTP_IN_CORRECT(2006, HttpResponseConstants.ERROR, "Included otp is not correct."),
    VERIFY_OTP_IN_ACTIVE(2007, HttpResponseConstants.ERROR, "Included otp is not active."),
    VERIFY_OTP_BLOCK(2008, HttpResponseConstants.ERROR, "Included otp is blocked which it is not correct."),
    VERIFY_OTP_NOT_FOUND(2009, HttpResponseConstants.ERROR, "Included otp is not found."),
    STATUS_STEP_NOT_CORRECT(2010, HttpResponseConstants.ERROR, "Loan status is not correct."),
    PHONE_NUMBER_INACTIVE(2011,
            HttpResponseConstants.ERROR, "Phone number is not active or suitable for sessionKey and deviceId."),
    CHANNEL_NOT_CORRECT(2012, HttpResponseConstants.INFO, "Channel is not correct");


    private final int code;
    private final String title;
    private final String message;

    BusinessExceptionCodes(int code, String title, String message) {
        this.code = code;
        this.title = title;
        this.message = message;
    }


    @Override
    public int getExceptionCode() {
        return code;
    }

    @Override
    public String getExceptionTitle() {
        return title;
    }

    @Override
    public String getExceptionMessage() {
        return message;
    }
}
