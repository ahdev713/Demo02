package cn.demo.controller;


import cn.demo.internal.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test")
@Controller
public class DemoController{
    @Autowired
    private Person person;

    @RequestMapping("out")
    @ResponseBody
    public Person out() {
        return person;
    }
}
