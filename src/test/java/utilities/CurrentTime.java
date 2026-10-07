package utilities;

import java.time.LocalDateTime;

public class CurrentTime {
	
	public int currentTime()

	{
		LocalDateTime  time = LocalDateTime.now();
		int hour = time.getHour();
		int day =  time.getDayOfMonth();
		int min= time.getMinute();
		int sec = time.getSecond();
		return day+hour+min+sec;
	}
}
