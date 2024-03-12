package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //ApplicationContext a = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1:"+obj1);

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2:"+obj2);

        TestBean2 obj3 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj3:"+obj3);

        ctx.close();

    }
}