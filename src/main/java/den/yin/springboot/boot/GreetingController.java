package den.yin.springboot.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YinlongWang <wangyinlong@meituan.com>
 * @version 1.0
 * @description
 * @created 15/7/17
 */
@Controller
public class GreetingController {
    @RequestMapping("greeting")
    public String greeting(@RequestParam(defaultValue = "Stranger") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
