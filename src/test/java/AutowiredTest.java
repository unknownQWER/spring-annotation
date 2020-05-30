import com.wanggang.bean.Red;
import com.wanggang.config.MyConfig;
import com.wanggang.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {

    @Test
    public void autowired() {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Red bean = context.getBean(Red.class);

    }
}
