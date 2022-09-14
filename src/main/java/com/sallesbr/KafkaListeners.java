package com.sallesbr;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "sallesbr",
            groupId = "groupId"
    )
    public void listener(String data){
        System.out.println("Listner received: " + data + " :()");

    }

}
