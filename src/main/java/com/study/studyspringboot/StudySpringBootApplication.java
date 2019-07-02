package com.study.studyspringboot;

import com.study.studyspringboot.Interceptor.MyFilter;
import com.study.studyspringboot.Interceptor.MyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@EnableScheduling
@ServletComponentScan
public class StudySpringBootApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBootApplication.class, args);
	}

	@Override
	//注册拦截器
	public void addInterceptors(InterceptorRegistry registry) {
		// 可添加多个
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
}
