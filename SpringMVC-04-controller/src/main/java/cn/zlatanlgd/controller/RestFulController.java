package cn.zlatanlgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    //原来的方式:http://localhost:8080/add?a=1&b=2
    //restful风格：http://localhost:8080/add/a/b
    //restful参数：安全（隐藏了参数名）、简介、高效

    //    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    //http://localhost:8080/add/
    @PostMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "结果1为" + res);
        return "test";
    }

    //http://localhost:8080/add/1/2
    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "结果2为" + res);
        return "test";
    }
}
