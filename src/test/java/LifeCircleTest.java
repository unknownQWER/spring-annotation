import com.wanggang.config.MyConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class LifeCircleTest {

    @Test
    public void hh() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfLifeCircle.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        ConfigurableEnvironment environment = context.getEnvironment();
        String name = environment.getProperty("name");
        System.out.println("name="+name);
        System.out.println("容器创建完成");
        Object car = context.getBean("person");
        System.out.println(car);

    }
}
