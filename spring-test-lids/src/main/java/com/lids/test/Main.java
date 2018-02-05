package com.lids.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/test.xml");
        Foo foo = context.getBean(Foo.class);

        System.out.println(foo);
        System.out.println(context);
    }

}
