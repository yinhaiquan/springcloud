package spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/28 10:08 星期四
 */
@EnableEurekaServer
@SpringBootApplication
public class Server {
    public static void main(String[] args) {
        System.out.println("启动eureka服务注册中心2...");
        SpringApplication.run(Server.class,args);
        System.out.println("eureka注册中心启动完成...");
    }
}
