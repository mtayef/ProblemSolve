package algorithmLearn;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private String ampm;
	
	public void setTime(int h, int m, String t) {
		hour = ((h >= 0 && h <= 24) ? h : 0);
		minute = ((m >= 0 && m <= 60) ? m : 0);
		second = ((m >= 0 && m <= 60) ? m : 0);
		ampm = t;
	}
	public String to24h() {
		if (ampm == "PM") {
			hour += 12;
		}
		return String.format("%02d:%02d:02d", hour, minute, second);
	}	
}
