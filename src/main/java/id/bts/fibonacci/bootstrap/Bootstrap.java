package id.bts.fibonacci.bootstrap;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import id.bts.fibonacci.services.SequenceService;

@Component
public class Bootstrap implements CommandLineRunner {

	SequenceService sequenceService;
	
	public Bootstrap(SequenceService sequenceService) {
		super();
		this.sequenceService = sequenceService;
	}


	@Override
	public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukan jumlah deret yang diinginkan: ");
		int jumlahDeret = scanner.nextInt();

		sequenceService.generateSequence(jumlahDeret);
		
		scanner.close();
	}
}
