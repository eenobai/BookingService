package com.bookingapp;

import com.bookingapp.Unused.LogicModule;
import com.mongodb.*;
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


        //TODO V MongoDB first attempt
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("Reservations");
        DBCollection collection = database.getCollection("Reservations");
        DBCursor cursor = collection.find();

        while(cursor.hasNext()){
            //int i = 1;
            System.out.println(cursor.next());
           // i++;
        }

        System.out.println();
    }
}
