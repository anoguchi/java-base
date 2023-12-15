package OOP.interfaces.practices.practice01;

/*
 * Um locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a duração
 * da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor da locação,
 * é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20% para valores
 * até 100.00, ou 15% para valores acima de 100.00 . Fazer um programa que lê os dados da locação (modelo do carro,
 * instante inicial e final da locação), bem como o valor por hora e o valor diário de locação. O programa deve
 * então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento) e
 * informar os dados na tela.
 */

import OOP.interfaces.practices.practice01.model.entities.CarRental;
import OOP.interfaces.practices.practice01.model.entities.Vehicle;
import OOP.interfaces.practices.practice01.model.services.BrazilTaxService;
import OOP.interfaces.practices.practice01.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String scannerVehicleModel = scanner.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime scannerLocalDateTimeStart = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime scannerLocalDateTimeFinish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(scannerLocalDateTimeStart, scannerLocalDateTimeFinish,
                new Vehicle(scannerVehicleModel));

        System.out.print("Entre com o preço por hora: ");
        double scannerPricePerHour = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double scannerPricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(scannerPricePerHour, scannerPricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        scanner.close();

    }

}
