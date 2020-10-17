package trainSchedule;

public class IntermediateStation {

	private String intermediateStation;
	private LeavingTime time;
	
	public IntermediateStation() {
		super();
		this.intermediateStation = " ";
		this.time = new LeavingTime(23, 59);
	}
	
	public IntermediateStation(String intermediateLeavingTime, int hour, int minute) {
		super();
		this.intermediateStation = intermediateLeavingTime;
		this.time = new LeavingTime(hour, minute);
	}

	public String getIntermediateStation() {
		return intermediateStation;
	}

	public void setIntermediateStation(String intermediateStation) {
		this.intermediateStation = intermediateStation;
	}

	public LeavingTime getTime() {
		return time;
	}

	public void setTime(LeavingTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return intermediateStation + " at " + time + " ";
	}
	
	
	

}
