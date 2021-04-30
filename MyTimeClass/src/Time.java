

public class Time {

	private long hour;
	private long minute;
	private long second;

	public Time() {
		hour = ((System.currentTimeMillis() / (1000 * 60 * 60)) % 24);
		minute = ((System.currentTimeMillis() / (1000 * 60)) % 60);
		second = ((System.currentTimeMillis() / 1000) % 60);
	}

	public Time(long toplamMilis) {
		this((toplamMilis / (1000 * 60 * 60)) % 24, (toplamMilis / (1000 * 60)) % 60, (toplamMilis / 1000) % 60);
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(long gecenZamanMilis) {
		hour = (gecenZamanMilis / (1000 * 60 * 60)) % 24;
		minute = (gecenZamanMilis / (1000 * 60)) % 60;
		second = (gecenZamanMilis / 1000) % 60;
	}
	
	
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second; 
	}
	
}



