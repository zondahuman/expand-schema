package com.abin.lee.expand.achieve.factory.xml;

import com.abin.lee.expand.achieve.factory.util.MarchConfig;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * Created by abin on 2018/9/24.
 */


public class MarchBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class getBeanClass(Element element) {
        return MarchConfig.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String name = element.getAttribute("interfaceClass");
        bean.addPropertyValue("interfaceClass", name);

        String ref = element.getAttribute("ref");
        bean.addPropertyValue("ref", ref);

        String version = element.getAttribute("version");
        bean.addPropertyValue("version", version);
    }
}

