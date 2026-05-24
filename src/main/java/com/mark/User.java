package com.mark;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String email;
    private transient String password;

    public User(String name, int age, String email, String password) {
        this.name     = name;
        this.age      = age;
        this.email    = email;
        this.password = password;
    }

    public User() {}

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPassword() {return password;}

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "name : " + name + "\nage : " + age + "\nemail : " + email + "\npassword : " + password;
    }
}
