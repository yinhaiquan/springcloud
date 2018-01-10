package spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/29 18:29 星期五
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@RefreshScope
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @Value("${foo}")
    String foo;
    @Value("${hello}")
    String hello;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo+"----->"+hello;
//        return "sdf";
    }
}
