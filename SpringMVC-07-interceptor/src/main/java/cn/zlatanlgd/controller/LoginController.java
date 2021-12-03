package cn.zlatanlgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String gologin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(Model model, HttpSession session, String username, String password) {
        //把用户信息存在session中。
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("usernmae", username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
