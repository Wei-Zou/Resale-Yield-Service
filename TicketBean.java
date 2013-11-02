
/**
 * Bean class representing the Ticket object.
 * Passed to Data Team's method for price estimation.
 */
public final class TicketBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Properties of the Bean class.
	 */
	/** team name */
	private String teamName;
	/** seat number */
	private String seatNo;
	/** name of the venue */
	private String venue;
	/** time in hours before the event starts */
	private int timeToEvent;
	/** the face value on the ticket */
	private float faceValue;
	
	
	public TicketBean () {
		this.teamName = null;
		this.seatNo = null;
		this.venue = null;
		this.timeToEvent = 0;
		this.faceValue = 0;
	}
	
	public TicketBean(String teamName, String seatNo, String venue,
			int timeToEvent, float faceValue) {
		this.teamName = teamName;
		this.seatNo = seatNo;
		this.venue = venue;
		this.timeToEvent = timeToEvent;
		this.faceValue = faceValue;
	}
	
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	/**
	 * @return the seatNo
	 */
	public String getSeatNo() {
		return seatNo;
	}
	
	/**
	 * @param seatNo the seatNo to set
	 */
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	
	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}
	
	/**
	 * @param venue the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	/**
	 * @return the timeToEvent
	 */
	public int getTimeToEvent() {
		return timeToEvent;
	}
	
	/**
	 * @param timeToEvent the timeToEvent to set
	 */
	public void setTimeToEvent(int timeToEvent) {
		this.timeToEvent = timeToEvent;
	}
	
	/**
	 * @return the faceValue
	 */
	public float getFaceValue() {
		return faceValue;
	}
	
	/**
	 * @param faceValue the faceValue to set
	 */
	public void setFaceValue(float faceValue) {
		this.faceValue = faceValue;
	}
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
