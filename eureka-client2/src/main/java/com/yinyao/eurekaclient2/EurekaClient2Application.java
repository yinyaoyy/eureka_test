package com.yinyao.eurekaclient2;

import com.yinyao.eurekaclient2.annotation.ExcudeFeignConfig;
import com.yinyao.eurekaclient2.annotation.ExcudeRibbonConfig;
import com.yinyao.eurekaclient2.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(
        basePackages = {"com.yinyao"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,value= ExcudeRibbonConfig.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION,value= ExcudeFeignConfig.class)
        }
)
//@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
//只会将eureka-client1这个服务进行自定义策略
@RibbonClient(name = "eureka-client1",configuration = RibbonConfiguration.class)
@EnableFeignClients
public class EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
