package spring.cloud.client;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title : 
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2018/1/10 11:39 星期三
 */
@Controller
public class MainErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @RequestMapping(value=ERROR_PATH)
    @ResponseBody
    public String handleError(){
        return "not found";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
