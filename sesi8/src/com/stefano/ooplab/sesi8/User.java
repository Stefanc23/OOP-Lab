package com.stefano.ooplab.sesi8;

public class User {
    private int user_id;
    private String password;
    private boolean login_status;

    User(int user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }

    public boolean verify_login(String password) {
        login_status = this.password.equals(password);
        return login_status;
    }

    public int user_id() {
        return user_id;
    }
}
