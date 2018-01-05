package spring.cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title : 远程服务接口，方法名参数注解必须跟服务提供者一毛一样
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/28 14:49 星期四
 */
@FeignClient(name = "eureka-client",fallback = HelloRemoteFallback.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello();

    @RequestMapping("/hello2")
    public String hello2();
}
