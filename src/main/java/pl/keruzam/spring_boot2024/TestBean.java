package pl.keruzam.spring_boot2024;

public class TestBean {

	String text;

	public TestBean(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
