package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24808BankApplication {

	public S24808BankApplication(TransferService service) {
		Transfer transfer = service.addNew(
				"1",
				Status.ACCEPTED,
				30,
				new Client("1", "Fiip",2000)
		);

		System.out.println("NEW TRANSFER");
		System.out.println(transfer);
		System.out.println();
		System.out.println("TRANSFER TO");
		System.out.println(service.printTransferById("2"));
		System.out.println();
		System.out.println(service.updateSaldoTransfer( "1", 2000));
		System.out.println();

	}
	public static void main(String[] args) {
		SpringApplication.run(S24808BankApplication.class, args);
	}

}
