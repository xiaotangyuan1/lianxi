package com.fsl.sso.controller;
import com.fsl.manager.commons.ManagerResult;
import com.fsl.manager.pojo.Userinfo;
import com.fsl.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
@RequestMapping(value = "/login",method = RequestMethod.GET)
@ResponseBody
public Map<String,Object> login(HttpServletRequest request){

    String username = request.getParameter("username");
    String password = request.getParameter("pwd");
    System.out.println("名字的值username:"+username+"密码的值password:"+password);
    if(username == null){
        return ManagerResult.fail("未接收到参数",500);
    }
    List<Userinfo> result =userService.login(username,password);
    if(result == null || result.size()<=0){
        return ManagerResult.fail("未找到该用户",404);
    }else{
        System.out.println("登录成功");
    }
    return ManagerResult.success(result.get(0));
    }

}