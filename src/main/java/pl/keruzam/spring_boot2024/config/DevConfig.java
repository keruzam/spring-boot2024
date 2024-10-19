package pl.keruzam.spring_boot2024.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.keruzam.spring_boot2024.TestBean;

@Configuration
public class DevConfig {

	@Bean
	public TestBean testBean() {
		return new TestBean("new text2");
	}
}
