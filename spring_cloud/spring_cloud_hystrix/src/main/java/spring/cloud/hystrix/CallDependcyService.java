package spring.cloud.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2018/1/2 16:53 星期二
 */
@Service
public class CallDependcyService {
    private Random random = new Random();

    /**
     * 模拟调用远程服务
     * @return
     */
    @HystrixCommand(fallbackMethod = "callback")
    public String getRandomNumber(){
        int randomInt = random.nextInt(10);
        System.out.println(randomInt);
        //模拟调用失败情况
        if (randomInt<3){
            throw new RuntimeException("调用服务失败");
        } else {
            return "调用服务成功！随机数是:" + randomInt;
        }
    }

    public String callback(){
        return "随机数小小于8，表示将要熔断！这是熔断器的降级方法。";
    }
}
