package com.jk.model;

import java.io.Serializable;

/**
 * Created by summer on 2016/11/29.
 */
public class User implements Serializable{

    private static final long serialVersionUID = -8617515062008661292L;

    private String name;

    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }


}
