package com.abin.lee.expand.achieve.factory.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by abin on 2018/9/24.
 */
public class MarchNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("service", new MarchBeanDefinitionParser());
    }

}

