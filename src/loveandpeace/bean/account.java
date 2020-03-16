package loveandpeace.bean;

import java.util.List;
import java.util.Map;

public class account {
    private String user_name;
    private int password;
    private user user;

    private List<user> list;
    private Map<String,user> map;

    public String getUser_name() {
        return user_name;
    }

    public List<user> getList() {
        return list;
    }

    public void setList(List<user> list) {
        this.list = list;
    }

    public Map<String, user> getMap() {
        return map;
    }

    public void setMap(Map<String, user> map) {
        this.map = map;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "account{" +
                "user_name='" + user_name + '\'' +
                ", password=" + password +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
