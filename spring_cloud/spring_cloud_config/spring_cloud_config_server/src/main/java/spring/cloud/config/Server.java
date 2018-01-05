package spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @title : config 服务端
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/29 14:47 星期五
 */
@SpringBootApplication
@EnableConfigServer
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
