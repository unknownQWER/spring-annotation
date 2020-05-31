import com.wanggang.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtTest {

    @Test
    public void extTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);
        context.publishEvent(new ApplicationEvent(new String("我发布了 一个事件")) {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();
    }
}
