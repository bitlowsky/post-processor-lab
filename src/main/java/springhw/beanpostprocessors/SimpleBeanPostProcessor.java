package springhw.beanpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In Before bean Initialization method. Bean name is " + beanName);
        if (bean instanceof ManRepository) {
            ((ManRepository) bean).setRecords(ManFactory.getMans(10));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In After bean Initialization method. Bean name is " + beanName);
        System.out.println(bean);
        return bean;
    }
}
