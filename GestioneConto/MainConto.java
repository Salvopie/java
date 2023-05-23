import java.util.*;
public class MainConto{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Quanto è il saldo? ");
		double saldo = input.nextDouble();
		ContoCC utente = new ContoCC(saldo);
		System.out.println("---1-Prelievo---");
		System.out.println("---2-Versamento---");
		System.out.println("---3-Saldo---");
		System.out.println("---4-Esci---");
		int i;
		do{
		i = input.nextInt();
		switch(i){
			case 1:
				System.out.println("---Quanto prelevi?---");
				double prele = input.nextDouble();
				if (prele < 0)
					System.out.println("Operazione Errata");
				utente.setPrele(prele);
				if(utente.prelievo())
					System.out.println("---Prelievo Accettato---");
				else
					System.out.println("---Prelievo Rifiutato---");
				break;
			case 2:
				System.out.println("---Quanto versi?---");
				double versa = input.nextDouble();
				if(versa < 0)
					System.out.println("Operazione Errata");
				utente.setVersa(versa);
				utente.versamento();
				break;
			case 3:
				System.out.println("---Saldo:--- " + utente.getSaldo());
				break;
			case 4:
				break;
		}
		}while(i != 4);
	}
}