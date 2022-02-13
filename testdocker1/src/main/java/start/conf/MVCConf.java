package start.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;





@Configuration
public class MVCConf implements WebMvcConfigurer   {
	
	/**
	 * cau hinh 1 controller de handler cac reqquest kieu
	 * http://localhost:9999/user/css/styles.css
	 * http://localhost:9999/user/css/script.css
	 * static files nhu : css ,js , img
	 */

	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		
		return bean;
	}
}
