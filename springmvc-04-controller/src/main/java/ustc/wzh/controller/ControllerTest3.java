package ustc.wzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller注解的类会自动添加到Spring上下文中
@Controller
@RequestMapping("/Test3")
public class ControllerTest3{

    //映射访问路径:RestFul风格
    @RequestMapping("/commit/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){

        int result = p1+p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果："+result);
        //返回视图位置
        return "test";

    }

    //映射访问路径,必须是Get请求:RestFul风格
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg", "hello!");
        return "test";
    }

    @GetMapping("/getMapping/hello")
    public String index3(Model model){
        model.addAttribute("msg","getMapping");
        return "test";
    }

}