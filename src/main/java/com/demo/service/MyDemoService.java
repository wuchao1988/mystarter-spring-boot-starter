package com.demo.service;
import com.demo.properties.MyDemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
public class MyDemoService {
    public String name;
    public String email;
    public MyDemoService(){
    }
    public MyDemoService(String name, String email){
        this.name = name;
        this.email=email;
    }
    public String test(){
        String str = "name:" + name + ",email:" + email;
        System.out.println(str);
        return str;
    }
}
