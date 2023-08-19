package org.example;

import java.util.HashMap;
import java.util.Map;

public class User {
    String name;
    String email;
    String password;

    static Map<String,String> userInformation=new HashMap<>();

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        userInformation.put(email,password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static boolean validateAccount(String email,String password){
        if(userInformation.get(email).equals(password))
        {
            return true;
        }
        else{
            return  false;
        }
    }
}
