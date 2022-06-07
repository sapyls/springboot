import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.javaconfig.MySpringConfig;
import study.javaconfig.vo.Cat;
import study.javaconfig.vo.Student;
import study.javaconfig.vo.Tiger;

public class SpringConfigTest {
    @Test
    public void testSpringBean1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Student s1 = (Student) context.getBean("createStu");
        System.out.println(s1);
    }

    @Test
    public void testSpringBean2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Student s1 = (Student) context.getBean("jisoo");
        System.out.println(s1);
    }

    @Test
    public void testSpringImport3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Cat s1 = (Cat) context.getBean("myCat");
        System.out.println(s1);
    }

    @Test
    public void testSpringPropertyResource4(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Tiger s1 = (Tiger) context.getBean("tiger");
        System.out.println(s1);
    }
}
