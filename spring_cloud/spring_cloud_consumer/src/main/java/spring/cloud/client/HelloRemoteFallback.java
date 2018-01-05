package spring.cloud.client;

import org.springframework.stereotype.Component;

/**
 * @title : 实现HelloRemote中异常hystrix降级回调方法
 * @describle :
 * <p>
 *     若服务提供者执行异常，消费方会调用此方法
 * Create By yinhaiquan
 * @date 2018/1/5 9:29 星期五
 */
@Component
public class HelloRemoteFallback implements HelloRemote {
    @Override
    public String hello() {
        return "hello fallback!";
    }

    @Override
    public String hello2() {
        return "hello2 fallback!";
    }
}
