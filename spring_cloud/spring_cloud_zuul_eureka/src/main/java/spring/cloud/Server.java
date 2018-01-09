package spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2018/1/9 16:41 星期二
 */
@SpringBootApplication
@EnableZuulProxy
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
