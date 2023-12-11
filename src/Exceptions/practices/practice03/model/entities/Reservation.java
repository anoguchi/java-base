package Exceptions.practices.practice03.model.entities;

import Exceptions.practices.practice03.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class  Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw  new DomainException("Error in reservation: Check-out date must be after check-in date");
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
        long dataDiff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dataDiff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {

        Date dateNow = new Date();
        if (checkIn.before(dateNow) || checkOut.before(dateNow)) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates.");
        }
        if (!checkOut.after(checkIn)) {
           throw  new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room: "
                + roomNumber
                + ", check-in: "
                + simpleDateFormat.format(checkIn)
                + ", check-out: "
                + simpleDateFormat.format(checkOut)
                + ", "
                + duration()
                + " nights.";
    }

}
