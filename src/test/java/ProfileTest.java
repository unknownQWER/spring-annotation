import com.wanggang.bean.Red;
import com.wanggang.config.MyConfig;
import com.wanggang.config.MyconfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

    @Test
    public void hh() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyconfigOfProfile.class);
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(new Class<?>[]{MyconfigOfProfile.class});
        context.refresh();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
