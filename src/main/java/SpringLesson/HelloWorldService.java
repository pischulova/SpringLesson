package SpringLesson;

/**
 * Created by Алена on 15.03.14.
 */
public class HelloWorldService implements GreetingService {

    @Override
    public void sendGreetings() {
        System.out.println("Hello, World!");
    }
}
