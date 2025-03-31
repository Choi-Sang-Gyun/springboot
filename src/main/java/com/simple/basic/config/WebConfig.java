package com.simple.basic.config;


import com.simple.basic.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration// 이 클ㄹ래스를 스프링의 자바설정파일로 /쓴다

@PropertySource("classpath:/application-production.properties")//classpath:/설정파일이름
public class WebConfig implements WebMvcConfigurer {

    @Value("${server.port}")
    private String port; //application.properties 참조

    @Value("${my.example.port}")
    private String myport; //application-production.properties 참조


    @Autowired
    private ApplicationContext applicationContext; //Ioc컨테이너로 동작하는 객체




    @Bean //스프링이 이 메서드를 호출시켜서 반환되는 값을 bean으로 등록시킴
    public void myTest() {
        System.out.println("설정파일 동작함");

        System.out.println("빈의 개수:" + applicationContext.getBeanDefinitionCount());
        HomeController controller = applicationContext.getBean(HomeController.class); //이 타입 bean 객체를 찾아줘
        System.out.println("ioc컨테이너 안에 컨트롤러 객체:" + controller);

        System.out.println("프로퍼티파일의 port값:" + port);
        System.out.println("프로적션-프로퍼티파일의 port값:" + myport);

    }

//    @Bean
//    public TestServiceImpl testServiceImpl() {
//        return new TestServiceImpl();
//    }

}

