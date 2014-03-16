package SpringLesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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

    public void setMessage(String message) {
        this.message = message;
    }
}
