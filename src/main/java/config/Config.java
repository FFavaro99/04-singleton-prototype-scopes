package config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"components"})
public class Config {

    @Bean("singletonBean")
    public Object singleton() {
        return new Object();
    }

    @Bean("prototypeBean")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Object prototype() {
        return new Object();
    }
}
