package springhw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springhw.beanpostprocessors.BeanPostProcessorConfig;

public class AppBeanPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanPostProcessorConfig.class);
        ctx.close();
    }
}
