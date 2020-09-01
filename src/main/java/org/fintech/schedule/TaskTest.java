package org.fintech.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class TaskTest {
	
	@Scheduled(cron="0 15 * * * *")
	public void testTask() throws Exception{
		log.warn("핀테크 task 실행");
	}
	
}
