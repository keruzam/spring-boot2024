package pl.keruzam.spring_boot2024.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.keruzam.spring_boot2024.TestBean;

@Configuration
@ConfigurationProperties(prefix = "dev")
public class DevConfig {

	String text;

	@Bean
	public TestBean testBean() {
		return new TestBean(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
