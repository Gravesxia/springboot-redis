package com.example.springbootredis.controller;

import com.example.springbootredis.model.UserModel;
import com.example.springbootredis.service.IUserService;
import com.example.springbootredis.util.RedisUtil;
import com.example.springbootredis.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class DemoController {

    @Autowired
    IUserService userService;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/setUser",method = RequestMethod.POST)
    @ResponseBody
    public String setUser(@RequestParam(value = "id",required = false) Long id){
        String uuid = UuidUtil.getUUID();
        UserModel userModel = userService.getUser(id);
        redisUtil.set(uuid,userModel);
        return "success";
    }

    @RequestMapping(value="/getUser",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getUser(@RequestParam(value = "uuid",required = false) String uuid){
        UserModel user = (UserModel)redisUtil.get(uuid);
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        return map;
    }
}
