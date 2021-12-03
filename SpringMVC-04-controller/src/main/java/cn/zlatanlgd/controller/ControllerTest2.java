package cn.zlatanlgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表这个类被spring接管，该类中所有方法，如果返回值是string，并且有具体页面可以跳转，那么就会被视图解析器解析。
public class ControllerTest2 {

    //映射访问路径
    @RequestMapping("t1")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test"; //       /WEB-INF/jsp/test.jsp
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("msg","test3");
        return "test"; //       /WEB-INF/jsp/test.jsp
    }
}
