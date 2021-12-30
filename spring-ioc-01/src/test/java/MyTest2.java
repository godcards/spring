import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tttttest.heart;

public class MyTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        heart he = (heart) context.getBean("heart");
        he.run();
    }
}
