package spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title : config 服务端
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/29 14:47 星期五
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableConfigServer
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
