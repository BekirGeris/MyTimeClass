

public class TimeTest {
	public static void main(String[] args) {
		
		Time time = new Time();
		System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
		
		Time time2 = new Time(System.currentTimeMillis());
		System.out.println(time2.getHour() + " " + time2.getMinute() + " " + time2.getSecond());
		
		time2.setTime(555550000);
		System.out.println(time2.getHour() + " " + time2.getMinute() + " " + time2.getSecond());
		
	}
}
