package org.example;

public interface AuthService {
    void makeAccount(String id,String password);
    void validateAccount(String id,String password);

}
