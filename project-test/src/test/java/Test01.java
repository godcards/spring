import com.yu.demo2.ServiceImpl;
import com.yu.demo2.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
        ServiceImpl my = (ServiceImpl) context.getBean("my");
        my.getPerson();
    }
}
