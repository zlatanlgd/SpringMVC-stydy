package cn.zlatanlgd.controller;

import cn.zlatanlgd.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    private String msg;

    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param-->" + name);
        if ("lrc".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        ArrayList<User> userArrayList = new ArrayList<>();
        //添加数据
        userArrayList.add(new User("lrc", 12, "man"));
        userArrayList.add(new User("lgd", 22, "man"));
        userArrayList.add(new User("zlatanlgd", 25, "man"));
        return userArrayList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "ok";
            } else {
                msg = "用户名有误!";
            }
        }

        if (pwd != null) {
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "密码有误!";
            }
        }
        return msg;
    }
}
