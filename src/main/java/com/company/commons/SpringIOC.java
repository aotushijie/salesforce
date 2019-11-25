package com.company.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {
    public static ApplicationContext getctx() {
      return new ClassPathXmlApplicationContext("applicationcontext.xml");
    }
}
