package ustc.wzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    //登陆提交
    @PostMapping("/login")
    public String login(HttpSession session, String username, String pwd) {
        // 向session记录用户身份信息
        System.out.println("接收前端===" + username);

        session.setAttribute("username", username);

        return "redirect:main";
    }

    //跳转到登陆页面
    @RequestMapping("/jumpLogin")
    public String jumpLogin() {
        return "login";
    }

    //跳转到成功页面
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    //退出登陆
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        // session 过期
        session.invalidate();
        return "login";
    }
}
