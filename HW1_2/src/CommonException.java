public class CommonException extends RuntimeException{
    private int errorCode;
    private String extraInfo;
    public CommonException(int errorCode, String extraInfo) {
        this.errorCode = errorCode;
        this.extraInfo = extraInfo;
    }
    public int getErrorCode() {
        return errorCode;
    }

    public String getExtraInfo() {
        return extraInfo;
    }
}
