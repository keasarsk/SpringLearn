package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.User;

import java.applet.AppletContext;
public class TestSpring5 {

    @Test
    public void test(){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("src/main/java/bean1.xml");
        //获取配置创建的对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

}
