import com.wanggang.aop.MathCaculator;
import com.wanggang.config.MyConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    @Test
    public void aopTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfAop.class);
        MathCaculator caculator = context.getBean(MathCaculator.class);
        int div = caculator.div(10, 2);
    }
}
