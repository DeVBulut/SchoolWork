
public class DanaLewisDataPoint {

	public String _time; 
	public int _heartRate; 
	public int _insulinLevel;

	public DanaLewisDataPoint(String time, int heartRate, int insulinLevel) {
		//TODO finish this constructor
		_time = time;
		_insulinLevel = insulinLevel; 
		_heartRate = heartRate;
	}

	public String getTime() {
		
		return _time;
	}

	public void setTime(String time) {
		 _time = time;
	}

	public int getHeartRate() {
		return _heartRate;
	}

	public void setHeartRate(int heartRate) {
		_heartRate = heartRate;
	}

	public int getInsulinLevel() {
		return _insulinLevel;
	}

	public void setInsulinLevel(int insulinLeveli) {
		_insulinLevel = insulinLeveli;
	}

	@Override
	public String toString() {
		//TODO Finish this method.  It should return the information in the following format
		//"Time 20:25, HR 103, IL 116"
		return "Time " + _time + ", HR " + _heartRate + ", IL " + _insulinLevel;
	}

}
