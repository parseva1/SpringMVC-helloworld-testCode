package loveandpeace.exception;

//自定义异常类
public class wowException extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public wowException(String message) {
        this.message = message;
    }
}
