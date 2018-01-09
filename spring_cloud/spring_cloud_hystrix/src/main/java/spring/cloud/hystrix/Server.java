package spring.cloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @title : 熔断器
 * @describle :
 *    @EnableFeignClients： 启用feign进行远程调用，feign自带断路器
 *    @EnableHystrix： 表示启动断路器，断路器依赖于服务注册和发现
 *    @EnableHystrixDashboard 启用hystrix 看板监控
 * Create By yinhaiquan
 * @date 2018/1/2 16:50 星期二
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@RefreshScope
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
