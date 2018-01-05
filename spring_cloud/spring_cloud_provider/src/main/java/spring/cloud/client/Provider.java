package spring.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title : 服务提供方
 * @describle :
 *
 * @EnableDiscoveryClient : 启用服务注册与发现
 * @EnableFeignClients： 启用feign进行远程调用
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/28 11:56 星期四
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@EnableAutoConfiguration
public class Provider {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "hello,我是端口"+port+"为您服务";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2,我是端口"+port+"为您服务";
    }

    public static void main(String[] args) {
        System.out.println("注册服务至注册中心...");
        SpringApplication.run(Provider.class,args);
        System.out.println("注册完成...");
    }
}
