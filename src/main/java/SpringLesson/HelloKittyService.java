package SpringLesson;

import org.springframework.stereotype.Component;

/**
 * Created by Алена on 15.03.14.
 */
@Component("helloKitty")
public class HelloKittyService implements GreetingService {

    @Override
    public void sendGreetings() {
        System.out.println("Hello, Kitty!");
    }
}

