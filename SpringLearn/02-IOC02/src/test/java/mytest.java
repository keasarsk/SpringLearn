import com.sk.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        //加载Spring配置文件 获取Spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //拿到hello
        Hello hello = (Hello) applicationContext.getBean("hello");

        System.out.println(hello.getStr());
        hello.setStr("124");
        System.out.println(hello.getStr());
    }
}

