package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");
		Foo foo = context.getBean(Foo.class);
		System.out.println(foo.toString());

	}

}
