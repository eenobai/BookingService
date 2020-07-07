package com.bookingapp;

import com.bookingapp.Service.Compare;
import com.bookingapp.Service.LogicModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan
public class BookingApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(BookingApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        LogicModule reservation = applicationContext.getBean(LogicModule.class);

        //LogicModule reservation = new LogicModule();

        reservation.test();

    }
}
