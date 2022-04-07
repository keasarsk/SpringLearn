import com.sk.service.UserService;
import com.sk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        //加载Spring的.xml文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得bean标签注册的类
        //注意:动态代理接口
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.add();
    }
}
