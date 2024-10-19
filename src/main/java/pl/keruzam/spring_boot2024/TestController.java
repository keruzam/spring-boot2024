package pl.keruzam.spring_boot2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	TestBean testBean;

	public TestController(TestBean testBean) {
		this.testBean = testBean;
	}


	@GetMapping(path = "/test")
	public String test() {
		return "Its working " + testBean.getText();
	}

}
