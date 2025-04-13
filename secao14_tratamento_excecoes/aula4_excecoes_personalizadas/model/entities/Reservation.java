package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {		
		
		if(!checkOut.after(checkIn)){
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); //diferença em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte milisgundos para dias						
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException{
		//lança a exceção para ser tratada na classe main
		
		Date now = new Date(); //cria uma data de agora
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
			
		}
		if(!checkOut.after(checkIn)){
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}				
		this.checkIn = checkIn;
		this.checkOut = checkOut;		
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-In: "
				+ sdf.format(checkIn)
				+", check-Out: "
				+ sdf.format(checkOut)
				+", "
				+ duration()
				+" nights";
	}
	
	
	
}
