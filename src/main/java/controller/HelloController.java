package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基于SSM框架的第一个控制器
 * 1.添加@Controller
 * @author Administrator
 * @since jdk8
 */
@Controller
public class HelloController {
    @RequestMapping("/hi")
    @ResponseBody
    public String hello(){
        return "hello nuc-a";
    }
}
