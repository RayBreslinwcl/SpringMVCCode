package ustc.wzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardAndRedirect {

    @RequestMapping("/far/t1")
    public String test1(Model model){
        model.addAttribute("msg","SpringMVCForward");
        //转发
        return "test";
    }

    @RequestMapping("/far/t2")
    public String test2(Model model){

        model.addAttribute("msg","SpringMVCRedirect");
        //重定向
        return "redirect:/index.jsp";
        //return "redirect:hello.do"; //hello.do为另一个请求/
    }
}
