package com.yinyao.eurekaclient2.config;

import com.yinyao.eurekaclient2.annotation.ExcudeFeignConfig;
import com.yinyao.eurekaclient2.annotation.ExcudeRibbonConfig;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@ExcudeRibbonConfig
public class FeignConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("root", "123");
    }
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;

    }

}
