package com.fsl.sso.service;

import com.fsl.manager.pojo.Userinfo;

import java.util.List;

public interface UserService {
    public boolean checkData(String data,int type);
    String register(Userinfo user);
    List<Userinfo> login(String username, String password);
    boolean getUserByToken(String token);
}
