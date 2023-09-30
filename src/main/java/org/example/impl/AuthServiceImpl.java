package org.example.impl;

import org.example.AuthService;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private Map<String,String>accountDetails=new HashMap<>();
    @Override
    public void makeAccount(String id, String password) {
        accountDetails.put(id,password);
    }

    @Override
    public void validateAccount(String id, String password) {
        if(accountDetails.containsKey(id)){
            if(accountDetails.get(id)==password){
                System.out.println("SUCCESSFUL");
            }
        }

    }
}
