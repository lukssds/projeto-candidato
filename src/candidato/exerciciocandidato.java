package candidato;

import java.util.Locale;
import java.util.Scanner;

public class exerciciocandidato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc= new Scanner(System.in);
		
		int opcoes,pontoes,pontoex,experiencia,pontototal;
		char viagem;
		char habilitacao;
		
		//leitura do escolaridade
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		opcoes= sc.nextInt();

		
		
		
		if (opcoes==1) {
			
			pontoes=10;
			
		}
		else if (opcoes==2) {
			pontoes=20;
		}
		else if (opcoes==3) {
			pontoes=30;
			
		}
		else {
			pontoes=40;
		}
		
		System.out.println("");
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		experiencia=sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		viagem=sc.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao=sc.next().charAt(0);
		
		if (experiencia==0) {
			pontoex=0;
			System.out.println("Sem experi�ncia");
		}
		
		else if (experiencia<=2) {
			pontoex=10;
			
		}
		else if (experiencia<=5) {
			pontoex=20;
			
		}
		else   {
			pontoex=40;
			
		}
		
		
	}
	
	

}
