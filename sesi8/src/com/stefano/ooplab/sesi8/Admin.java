package com.stefano.ooplab.sesi8;

public class Admin extends User {
    private String admin_name, email;

    Admin(int user_id, String password, String admin_name, String email) {
        super(user_id, password);
        this.admin_name = admin_name;
        this.email = email;
    }

    public void update_catalog() {
        //error 404: catalog not found
    }

    public String email() {
        return email;
    }
}
