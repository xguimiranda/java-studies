package interfaceExercise2.application;

import interfaceExercise2.model.entities.Contract;
import interfaceExercise2.model.entities.Installment;
import interfaceExercise2.model.service.ContractService;
import interfaceExercise2.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();
        Contract contract = new Contract(numero, date, contractValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getList()){
            System.out.println(installment);
        }

        sc.close();
    }
}
