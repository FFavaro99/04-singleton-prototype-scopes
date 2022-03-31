package components;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonComponent {

    @Lookup("prototypeBean")
    public Object getPrototypeBean() {
        return null;
    }
}
