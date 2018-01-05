package spring.cloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2018/1/2 16:52 星期二
 */
@RestController
public class HystrixController {

    @Value("${foo}")
    String foo;

    @Autowired
    CallDependcyService callDependcyService;

    @RequestMapping("/random")
    public String hi(){
        return callDependcyService.getRandomNumber()+"---"+foo;
    }

}
