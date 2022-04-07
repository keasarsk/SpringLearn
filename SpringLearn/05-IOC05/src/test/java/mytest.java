import com.sk.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        People people = applicationContext.getBean("people",People.class);

        people.getDog().bark();
        people.getCat().bark();
    }
}
