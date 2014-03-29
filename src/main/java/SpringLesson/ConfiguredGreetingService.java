package SpringLesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Алена on 15.03.14.
 */
@Component("configuredGS")
public class ConfiguredGreetingService implements GreetingService {

    @Value("#{greetingProperties.message}")
    private String message;
    @Override
    public void sendGreetings() {
        System.out.println(message);
    }
    @PostConstruct
    public void postConstructMethod() {
        System.out.println("post constructor");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("pre destroy");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
