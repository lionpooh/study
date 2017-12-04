package org.lionpooh.labatory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Component
public class AnnotaionKafkaListener {

    @KafkaListener(topics = "test1")
    public void listener(String data)  {
        log.info(data);
    }
}
