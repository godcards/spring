import com.yu.demo2.MyBodyImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//configLocation不要忘记
        MyBodyImpl myBody = (MyBodyImpl) context.getBean("MyBodyImpl");//s里写的是bean里面的id不是property里的name
        myBody.see();
    }
}
