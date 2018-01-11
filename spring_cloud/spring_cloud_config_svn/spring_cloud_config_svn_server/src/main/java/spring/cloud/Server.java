package spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2018/1/11 10:37 星期四
 */
@SpringBootApplication
@EnableConfigServer
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
