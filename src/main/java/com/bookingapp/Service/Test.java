package com.bookingapp.Service;

import com.mongodb.*;
import org.springframework.stereotype.Component;

import java.net.UnknownHostException;

@Component
public class Test {

    public void test() throws UnknownHostException {
        //TODO V MongoDB first attempt
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("Reservations");
        DBCollection collection = database.getCollection("Reservations");
        DBCursor cursor = collection.find();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }

}
