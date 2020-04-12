package ustc.wzh.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ustc.wzh.pojo.User;
import ustc.wzh.utils.JsonUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody       //设置后就不会去寻找视图页面，而是直接输出字符串
    public String json1() throws JsonProcessingException {

        //jackson
        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1,"小王",24);

        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        List<User> list = new ArrayList<>();
        list.add(new User(1,"小王1",24));
        list.add(new User(2,"小王2",24));
        list.add(new User(3,"小王3",24));
        list.add(new User(4,"小王4",24));

        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(list);

        return str;
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date = new Date();
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(date);
        return str;
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(sdf);

        Date date = new Date();
        String str = mapper.writeValueAsString(date);

        return str;
    }

    @RequestMapping("/j5")
    @ResponseBody
    public String json5(){
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }


}
