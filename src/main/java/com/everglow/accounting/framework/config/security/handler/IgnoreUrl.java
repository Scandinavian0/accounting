package com.everglow.accounting.framework.config.security.handler;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IgnoreUrl
 * @Decripiton  忽略的URL
 * @Author Everglow
 * @Date 2020/10/26 17:21
 * @Version 1.0
 **/
@Data
@Component
@ConfigurationProperties(value = "global.ignored")
public class IgnoreUrl {
    private List<String> urls = new ArrayList<>();
}
