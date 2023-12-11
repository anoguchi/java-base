package Exceptions.practices.practice02.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
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

    public String updateDates(Date checkIn, Date checkOut) {

        Date dateNow = new Date();
        if (checkIn.before(dateNow) || checkOut.before(dateNow)) {
            return "Error in reservation: Reservation dates for update must be future dates.";
        }
        if (!checkOut.after(checkIn)) {
           return "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
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
