import java.util.*;
public class MainContoExt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("---Quanto è il saldo?---");
		double saldo = input.nextDouble();
		ContoExt utente = new ContoExt(saldo);
		System.out.println("---Questo programma tiene conto della quota di scoperto---");
		System.out.println("---La quota di scoperto è pari 50€---");
		System.out.println("---Quanto vuoi prelevare?---");
		double prele = input.nextDouble();
		utente.setPrele(prele);
		if(utente.prelievo())
					System.out.println("---Prelievo Accettato---");
				else
					System.out.println("---Prelievo Rifiutato---");
	}
}