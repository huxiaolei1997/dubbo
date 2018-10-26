package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: TestDubbo, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年10月26日 下午 3:52 胡晓磊 Exp $
 */
public class TestDubbo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        DemoService demoService = classPathXmlApplicationContext.getBean(DemoService.class);
        System.out.println(demoService.getName("Alex"));
    }
}
