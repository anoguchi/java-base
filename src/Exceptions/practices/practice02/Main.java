package Exceptions.practices.practice02;

/*
 *  Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída)
 * e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída,
 * atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados
 * inválidos para a reserva, conforme as seguintes regras:
 * - Alterações de reserva só podem ocorrer para datas futuras.
 * - A data de saída deve ser maior que a data de entrada.
 */

import Exceptions.practices.practice02.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {


        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int getRoomNumber = scanner.nextInt();
        System.out.print("Check-in date (dd/mm/yyyy): ");
        Date getDateCheckIn = simpleDateFormat.parse(scanner.next());
        System.out.print("Check-out date (dd/mm/yyyy): ");
        Date getDateCheckOut = simpleDateFormat.parse(scanner.next());

        if (!getDateCheckOut.after(getDateCheckIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
            return;
        }

        Reservation reservation = new Reservation(getRoomNumber, getDateCheckIn, getDateCheckOut);
        System.out.println("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation: ");
        System.out.print("New check-in date (dd/mm/yyyy): ");
        Date getNewDateCheckIn = simpleDateFormat.parse(scanner.next());
        System.out.print("New check-out date (dd/mm/yyyy): ");
        Date getNewDateCheckOut = simpleDateFormat.parse(scanner.next());

        String error = reservation.updateDates(getNewDateCheckIn, getNewDateCheckOut);
        if(error != null) {
            System.out.println("Error in reservation: " + error);
            return;
        }

        System.out.println("Reservation: " + reservation);

        scanner.close();

    }
}
