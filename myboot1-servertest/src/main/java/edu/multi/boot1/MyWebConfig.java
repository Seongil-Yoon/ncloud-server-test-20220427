package edu.multi.boot1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

//	<resources mapping="/resources/**" location="/resources/" />
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
			.addResourceHandler("/upload/**")
			.addResourceLocations("file:///c:/upload/");
		
		
//		http://localhost:9080/upload/a.png
	}

}
