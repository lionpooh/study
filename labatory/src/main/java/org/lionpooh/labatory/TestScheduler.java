package org.lionpooh.labatory;

import java.text.ParseException;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Profile("hello")
public class TestScheduler {

    @PostConstruct
    public void init()  {
        System.out.println("hello fucking spring");
    }
	/*@Scheduled(fixedRate = 3000)
	public void test() throws ParseException	{
		
	}*/
}
