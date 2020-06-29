import com.bookingapp.Service.DataBaseReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookingApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataBaseReader main = applicationContext.getBean(DataBaseReader.class);

        main.dbReader();

    }

}
