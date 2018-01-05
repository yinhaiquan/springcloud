package spring.test.controller;

import annotation.Validation;
import aop.TestFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @title :
 * @describle :
 * <p>
 * Create By yinhaiquan
 * @date 2017/12/28 14:48 星期四
 */
@RestController("test2")
@RequestMapping("/test2")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public String remoteHello(@RequestBody TestFrom form){
        System.out.println(form);
        return "test";
    }
}
