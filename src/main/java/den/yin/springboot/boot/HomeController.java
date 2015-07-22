package den.yin.springboot.boot;

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
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
