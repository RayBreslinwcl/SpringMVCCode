package ustc.wzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ustc.wzh.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(String name, Model model) {

        //1.接收前端传递来的参数
        System.out.println("前端传递来的参数为：" + name);

        //2.返回结果传递给前端，使用Model
        model.addAttribute("msg",name);

        //3.视图跳转
        return "test";
    }

    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model) {

        //1.接收前端传递来的参数
        System.out.println("前端传递来的参数为：" + name);

        //2.返回结果传递给前端，使用Model
        model.addAttribute("msg",name);

        //3.视图跳转
        return "test";
    }

    @GetMapping("/t3")
    public String test3(User user) {

        System.out.println("前端传递来的参数为：" + user);
        return "test";
    }

    @GetMapping("/t4")
    public String test4(@RequestParam("username") String name, ModelMap model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg",name);

        return "test";
    }

    @GetMapping("/t5")
    public String test5(@RequestParam("username") String name, Model model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg",name);

        return "test";
    }
}
