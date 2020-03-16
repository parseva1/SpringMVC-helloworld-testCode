package loveandpeace.bean;

import java.util.Date;

public class user {
    private String uname;
    private String psw;
    private String date;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "user{" +
                "uname='" + uname + '\'' +
                ", psw='" + psw + '\'' +
                ", date=" + date +
                '}';
    }
}
