package id.bts.fibonacci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FibonacciApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibonacciApplication.class, args);

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Masukan jumlah deret yang diinginkan: ");
//		int jumlahDeret = scanner.nextInt();
//
//		sequenceService.generateSequence(jumlahDeret);
		
//		int n1 = 1;
//		int n2 = 1;
//
//		System.out.print(n1 + " " + n2);
//
//		for (int i = 2; i < jumlahDeret; i++) {
//
//			int n3 = n2 + n1;
//
//			n1 = n2;
//
//			n2 = n3;
//
//			System.out.print(" " + n3);
//		}
//
//		System.out.println(" <- Pake for loop");
//
//		// End of for Loop method, down to while Loop
//
//		n1 = 1;
//		n2 = 1;
//
//		System.out.print(n1 + " " + n2);
//
//		int i = 2;
//
//		while (i < jumlahDeret) {
//
//			int n3 = n2 + n1;
//
//			n1 = n2;
//
//			n2 = n3;
//
//			System.out.print(" " + n3);
//			i++;
//		}
//
//		System.out.println(" <- Pake while loop");
//
//		// Done, go to do - while loop now
//
//		n1 = 1;
//		n2 = 1;
//
//		System.out.print(n1 + " " + n2);
//
//		i = 2; // reuse previous iteration variable
//
//		if (2 < jumlahDeret)
//			do {
//				int n3 = n2 + n1;
//
//				n1 = n2;
//
//				n2 = n3;
//
//				System.out.print(" " + n3);
//				i++;
//			} while (i < jumlahDeret);
//
//		System.out.println(" <- Pake do-while loop");
//		scanner.close();
	}

}
