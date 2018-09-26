package com.abin.lee.expand.achieve.factory.test;

import com.abin.lee.expand.achieve.factory.util.MarchConfig;
import com.abin.lee.nearby.common.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by abin on 2018/9/24.
 */
public class ExpandSchemaTest {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        MarchConfig marchRpc1 = (MarchConfig) ctx.getBean("marchRpc1");
        MarchConfig marchRpc3 = (MarchConfig) ctx.getBean("marchRpc3");

        System.out.println("marchRpc1: " + JsonUtil.toJson(marchRpc1));
        System.out.println("marchRpc3: " + JsonUtil.toJson(marchRpc3));
    }


}
