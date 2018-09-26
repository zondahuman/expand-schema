package com.abin.lee.expand.achieve.factory.util;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by abin on 2018/9/24.
 */
@Data
public class MarchConfig {

    /**
     * 接口
     */
    private String interfaceClass;

    /**
     * 引用
     */
    private String ref;

    /**
     * 版本
     */
    private String version;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("interfaceClass", interfaceClass)
                .append("ref", ref)
                .append("version", version)
                .toString();
    }
}
