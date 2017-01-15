import javax.swing.JOptionPane;

public class J20_BaseTime {
	
	private int hour;
	private int min;
	private int sec;
	
	public J20_BaseTime() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	public J20_BaseTime(int theHour, int theMin, int theSec) {
		if (checkHour(theHour)) this.hour = theHour;
		if (checkMin(theMin))this.min = theMin;
		if (checkSec(theSec))this.sec = theSec;
	}
	
	public void setHour(int newHour) {
		if (checkHour(newHour)) this.hour = newHour;
	}
	
	public void setMin(int newMin) {
		if (checkMin(newMin)) this.min = newMin;
	}
	
	public void setSec(int newSec) {
		if (checkSec(newSec)) this.min = newSec;
	}
	
	public int getHour() { return this.hour; }
	public int getMin() { return this.min; }
	public int getSec() { return this.sec; }
	
	private boolean checkHour(int theHour) {
		if (theHour>=0 && theHour<=24) return true;
		else {
			JOptionPane.showMessageDialog(null, "Invalid hour");
			return false;
		}
	}
	
	private boolean checkMin(int theMin) {
		if (theMin>=0 && theMin<=60) return true;
		else {
			JOptionPane.showMessageDialog(null, "Invalid minite");
			return false;
		}
	}
	
	private boolean checkSec(int theSec) {
		if (theSec>=0 && theSec<=60) return true;
		else {
			JOptionPane.showMessageDialog(null, "Invalid second");
			return false;
		}
	}
	
	public boolean compareTo(J20_BaseTime object) {
		
		return true;
	}
	
	public String toString() {
		return this.hour + " : " + this.min + " : " + this.sec;
	}

}
