import com.bookingapp.Service.TicketWriter;
import com.bookingapp.Service.DataBaseReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class BookingApplication {

    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

       DataBaseReader aaa = applicationContext.getBean(DataBaseReader.class);
       TicketWriter bbb = applicationContext.getBean(TicketWriter.class);

        aaa.dbReader();
        bbb.ticketWriter();

    }

}
