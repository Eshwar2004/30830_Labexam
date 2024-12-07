package Labexam.com.klef.exam;

/**
 * Hello world!
 *
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Fetch Employee bean
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Fetch Course bean
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
