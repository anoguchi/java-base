package OOP.interfaces.practices.practice03;

/*
 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar
 * as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.
 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento
 * online tipicamente cobram um juros mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela
 * empresa é do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
 * Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato).
 * Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas
 * a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela
 * dois meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
 */

import OOP.interfaces.practices.practice03.model.entities.Contract;
import OOP.interfaces.practices.practice03.model.entities.Installment;
import OOP.interfaces.practices.practice03.model.services.ContractService;
import OOP.interfaces.practices.practice03.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Inserir os dados do contrato:");
        System.out.print("Número: ");
        int scannerGetContractNumber = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate scannerGetContractDate = LocalDate.parse(scanner.next(), dateTimeFormatter);
        System.out.print("Valor do contrato: ");
        double scannerGetContractTotalValue = scanner.nextDouble();

        Contract contract = new Contract(scannerGetContractNumber, scannerGetContractDate, scannerGetContractTotalValue);

        System.out.print("Entre com o número de parcelas: ");
        int scannerGetNumberOfInstallments = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, scannerGetNumberOfInstallments);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallmentList()) {
            System.out.println(installment);
        }



        scanner.close();

    }
}
