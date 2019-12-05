package com.fsl.sso.service;

import com.fsl.manager.pojo.Userinfo;

import java.util.List;

public interface UserService {
    public boolean checkData(String data,int type);
    int register(Userinfo user);
    List<Userinfo> login(String username, String password);
    List<Userinfo> queryAllUser();
    boolean getUserByToken(String token);
}
