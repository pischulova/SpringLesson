package SpringLesson;

/**
 * Hello world!
 *
 */
public class Application {
    private GreetingService greetingService;
    private int greetingCount;

    public void start(){
        for(int i=0; i<greetingCount; i++) {
            greetingService.sendGreetings();
        }
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public int getGreetingCount() {
        return greetingCount;
    }

    public void setGreetingCount(int greetingCount) {
        this.greetingCount = greetingCount;
    }
}
