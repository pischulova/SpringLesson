package SpringLesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Алена on 15.03.14.
 */
public class Starter {
    public static void main(String[] args) {
        //переменная, через котор обращаемся к спрингу, которая вернет тот бин, который прописан в конфиге
        AbstractApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
                new FileSystemXmlApplicationContext("src\\main\\java\\spring-config.xml");
        AppConfig app = context.getBean(AppConfig.class);
        app.start();
        context.registerShutdownHook();
    }
}
