
package org.tw.gradleTest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class OddEven {
    @RequestMapping("/")
    public String checkIfOddOrEven() {
        int number = 5;
        if(number%2==0)
            return "Even";
        else
            return "OdderPodder"+new Date().toString();
    }

//    public static void main(String[] args) {
//        OddEven oddEven = new OddEven();
//        SpringApplication.run(OddEven.class, args);
//    }

}
