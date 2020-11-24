import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext
                .getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext
                .getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Две ссылочные переменные типа Hello world равны? " +
                (bean1 == bean2));
        System.out.println("Две ссылочные переменные типа Cat равны? " +
                (catBean == catBean1));
    }
}