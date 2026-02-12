package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import module.entities.Contract;
import module.entities.Installment;
import module.services.ContractService;
import module.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		Contract contract = new Contract(number, date, contractValue);
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("PARCELAS:");
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
