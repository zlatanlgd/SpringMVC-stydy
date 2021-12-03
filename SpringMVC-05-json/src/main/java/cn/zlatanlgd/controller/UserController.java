package cn.zlatanlgd.controller;


import cn.zlatanlgd.pojo.User;
import cn.zlatanlgd.utils.JsonUtils;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController //不走视图解析器
public class UserController {

    @RequestMapping(value = "/j1", produces = "application/json;charset=utf-8")
    // @ResponseBody //增加了 @ResponseBody 就不会走视图解释器，会直接返回一个字符串。
    public String json1() throws JsonProcessingException {

        //jackson  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();


        //创建一个对象
        User user = new User("lrc1", 12, "man");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        //jackson  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user1 = new User("lrc1", 12, "man");
        User user2 = new User("lrc2", 12, "man");
        User user3 = new User("lrc3", 12, "man");
        User user4 = new User("lrc4", 12, "man");
        User user5 = new User("lrc5", 12, "man");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        return JsonUtils.getJson(userList);
    }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date = new Date();

        return JsonUtils.getJson(date);
    }
    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("lrc1", 12, "man");
        User user2 = new User("lrc2", 12, "man");
        User user3 = new User("lrc3", 12, "man");
        User user4 = new User("lrc4", 12, "man");
        User user5 = new User("lrc5", 12, "man");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        String s = JSON.toJSONString(userList);
        return s;
    }
}