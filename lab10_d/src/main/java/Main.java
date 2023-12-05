import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        //ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
        Motocicleta m = (Motocicleta) factory.getBean("moto");
        System.out.println(m);
    }
}
