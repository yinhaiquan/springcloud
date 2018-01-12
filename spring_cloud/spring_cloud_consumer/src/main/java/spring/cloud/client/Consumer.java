package spring.cloud.client;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

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

    @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet){
      ServletRegistrationBean registrationBean =
              new ServletRegistrationBean(dispatcherServlet);
      dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
      return registrationBean;
    }

    /**
     * 配置RandomRule随机策略，默认是轮询策略RoundRobinRule，不用配置此bean
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
