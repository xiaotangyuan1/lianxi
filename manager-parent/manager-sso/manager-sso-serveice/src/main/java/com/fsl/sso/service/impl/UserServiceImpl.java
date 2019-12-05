package com.fsl.sso.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.fsl.manager.dao.UserinfoMapper;
import com.fsl.manager.pojo.Userinfo;
import com.fsl.manager.pojo.UserinfoExample;
import com.fsl.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public boolean checkData(String data, int type) {
        return false;
    }

    @Override
    public int register(Userinfo user) {
        int result = 0;
        if(StringUtils.isBlank(user.getUsername())){

        }else{
            user.setRegistertime(new Date());
            result = userinfoMapper.insert(user);
        }
        return result;
    }

    @Override
    public List<Userinfo> login(String username, String password) {
        System.out.println("service层的名字额密码："+username);
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPwdEqualTo(password);
        System.out.println("userinfoMapper的值:"+userinfoMapper.toString());
        List<Userinfo> result = userinfoMapper.selectByExample(example);
        return result;
    }

    @Override
    public List<Userinfo> queryAllUser() {
        UserinfoExample example = new UserinfoExample();
        List<Userinfo> result = userinfoMapper.selectByExample(example);
        return result;
    }

    @Override
    public boolean getUserByToken(String token) {
        return false;
    }
}
