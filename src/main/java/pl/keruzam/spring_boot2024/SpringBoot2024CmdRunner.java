package pl.keruzam.spring_boot2024;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2024CmdRunner implements CommandLineRunner {

	TestBean testBean;

	public SpringBoot2024CmdRunner(TestBean testBean) {
		this.testBean = testBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2024CmdRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test konsoli " + testBean.getText());
	}
}
