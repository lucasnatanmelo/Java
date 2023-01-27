package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	// static Date method
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		
		// .after() -> SimpleDateFormat function verifier
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return this.checkIn;
	}

	public Date getCheckOut() {
		return this.checkOut;
	}

	// method to return duration difference by checkIn and checkOut
	public long duration() {
		long diff = this.checkOut.getTime() - this.checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// method to update dates
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		// .before() -> SimpleDateFormat function verifier
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		// .after() -> SimpleDateFormat function verifier
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ this.roomNumber
			+ ", check-in: "
			+ sdf.format(this.checkIn)
			+ ", check-out: "
			+ sdf.format(this.checkOut)
			+ ", "
			+ this.duration()
			+ " nights";
	}
}
