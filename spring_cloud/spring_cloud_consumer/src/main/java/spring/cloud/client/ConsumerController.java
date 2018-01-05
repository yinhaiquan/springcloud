package spring.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/28 14:48 星期四
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/fuck")
    public String remoteHello(){
        return helloRemote.hello();
    }

    @RequestMapping("/fuck2")
    public String remoteHello2(){
        return helloRemote.hello2();
    }
}
