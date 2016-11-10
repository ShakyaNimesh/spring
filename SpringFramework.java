

package springframework;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringFramework {


    public static void main(String[] args) {
AnnotationConfigApplicationContext cont= new AnnotationConfigApplicationContext();
try{
    cont.register(config.class);
    cont.refresh();
    System.out.println(cont.getBean("config"));
}finally{
    cont.close();
}
    }
    
}
