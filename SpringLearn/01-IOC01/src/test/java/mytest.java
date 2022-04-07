import com.sk.dao.UserDaoImpl;
import com.sk.dao.UserDaoOracleImpl;
import com.sk.service.UserService;
import com.sk.service.UserServiceImpl;

public class mytest {
    public static void main(String[] args) {
        //旧方法
        // UserService userService = new UserServiceImpl();

        //IOC原理
        UserServiceImpl userService = new UserServiceImpl();
        //动态传入不同dao对象
        userService.setUserDao(new UserDaoImpl());
        userService.add();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.add();
    }
}
