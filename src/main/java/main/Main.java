package main;

import components.PrototypeComponent;
import components.SingletonComponent;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("SINGLETON BEAN");
        System.out.println(context.getBean("singletonBean", Object.class));
        System.out.println(context.getBean("singletonBean", Object.class));

        System.out.println("SINGLETON COMPONENT");
        System.out.println(context.getBean(SingletonComponent.class));
        System.out.println(context.getBean(SingletonComponent.class));

        System.out.println("PROTOTYPE BEAN");
        System.out.println(context.getBean("prototypeBean", Object.class));
        System.out.println(context.getBean("prototypeBean", Object.class));

        System.out.println("PROTOTYPE COMPONENT");
        System.out.println(context.getBean(PrototypeComponent.class));
        System.out.println(context.getBean(PrototypeComponent.class));

        System.out.println("SINGLETON INJECTED INTO PROTOTYPE");
        var prototypeComponent = context.getBean(PrototypeComponent.class);
        System.out.println(prototypeComponent + " ," + prototypeComponent.getSingletonBean());
        prototypeComponent = context.getBean(PrototypeComponent.class);
        System.out.println(prototypeComponent + " ," + prototypeComponent.getSingletonBean());

        System.out.println("PROTOTYPE INJECTED INTO SINGLETON");
        var singletonComponent = context.getBean(SingletonComponent.class);
        System.out.println(singletonComponent + " ," + singletonComponent.getPrototypeBean());
        singletonComponent = context.getBean(SingletonComponent.class);
        System.out.println(singletonComponent + " ," + singletonComponent.getPrototypeBean());

    }
}
