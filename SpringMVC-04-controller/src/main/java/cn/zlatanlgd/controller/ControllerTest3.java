package cn.zlatanlgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/admin")
public class ControllerTest3 {

    @RequestMapping("/admin/t1")
    public String test1(Model model) {
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }
}
