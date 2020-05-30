import com.wanggang.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HH {

    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    @Test
    public void printAllName() {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void single() {
        Object bean = context.getBean("&factoryBean");
        System.out.println(bean.getClass());
    }
}
