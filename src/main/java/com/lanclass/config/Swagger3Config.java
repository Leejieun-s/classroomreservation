package com.lanclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/12/25/21:34
 */

@Configuration
public class Swagger3Config {


    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).groupName("������v1.0");
    }


    private ApiInfo apiInfo(){
        Contact contact=  new Contact("��ͬѧ","https://baidu.com", "1527715476@qq.com");
        return new ApiInfo("С��ͬѧ��api�ĵ�",
                "���ڱ�ҵ�����Ʒ�ӿ��ĵ��Ĺ���",
                "V1.0",
                "https://lans.cc",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }
}
