package den.yin.springboot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YinlongWang <wangyinlong@meituan.com>
 * @version 1.0
 * @description
 * @created 15/7/17
 */
@RestController
public class HomeController {
    @Value("${den.yin.test}")
    String test;
    @RequestMapping("/")
    public String home() {
        return test;
    }
}
