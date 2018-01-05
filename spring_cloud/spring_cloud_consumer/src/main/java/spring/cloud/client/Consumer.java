package spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @title :
 * @describle :
 * <p>
 *     @EnableCircuitBreaker和@EnableFeignClients启用负载均衡和hystrix服务降级功能
 *     其实不添加@EnableCircuitBreaker注解默认也是有负载功能
 * Create By yinhaiquan
 * @date 2017/12/28 14:46 星期四
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoConfiguration
@ComponentScan(value = {"spring","aop"})
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}
