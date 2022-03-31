package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeComponent {
    @Autowired
    private Object singletonBean;

    public Object getSingletonBean() {
        return singletonBean;
    }
}
