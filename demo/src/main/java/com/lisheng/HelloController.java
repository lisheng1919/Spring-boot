package com.lisheng;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lishe on 2018/1/30.
 * first class
 */
@RestController
public class HelloController {


        @RequestMapping(value = "/hello")
        public String hello() {
            test();
            return "hello,Spring Boot";
    }

public static void test(){


}

    public static void main(String[] args) {




    }

}
