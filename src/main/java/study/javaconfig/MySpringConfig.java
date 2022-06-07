package study.javaconfig;

import org.springframework.context.annotation.*;
import study.javaconfig.vo.Student;

/**
 *1. @Configuration表示当前类作为配置文件使用
 * MySpringConfig这个类就相当于 xml文件使用
 *
 *2.@ImportResource  导入其他的xml配置文件
 *
 * 3.@PropertySource 读取config中的配置信息key-value格式
 * 使用${}方式获取value
 *  例如 Tiger类中@Value("${tiger.age}")
 *     private int age;
 */
@Configuration
@ImportResource(value="classpath:beans.xml")
@PropertySource(value = "classpath:config.properties")
@ComponentScan(value = "study.javaconfig.vo")
public class MySpringConfig {

    /**
     * @Bean 方法返回的对象即被注入容器中
     * 若不指定对象的名称，默认id是方法名
     *
     * 测试类：
     * ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
     * Student s1 = (Student) context.getBean("createStu");
     * @return
     */
    @Bean
    public Student createStu(){
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("lisa");
        return s1;
    }
    /**
     * @Bean 方法返回的对象即被注入容器中
     * name属性为id
     *
     *  测试类：
     * ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
     * Student s1 = (Student) context.getBean("jisoo");
     * @return
     */
    @Bean(name="jisoo")
    public Student createStu2(){
        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("jisoo");
        return s1;
    }
}
