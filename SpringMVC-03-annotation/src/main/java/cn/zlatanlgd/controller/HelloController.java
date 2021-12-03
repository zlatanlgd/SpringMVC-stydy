package cn.zlatanlgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    // localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello,SpringMVCAnnotation");

        return "hello"; //会被视图解析器处理
    }
}
