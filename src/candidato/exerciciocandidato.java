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
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
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
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia=sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		viagem=sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao=sc.next().charAt(0);
		
		if (experiencia==0) {
			pontoex=0;
			System.out.println("Sem experiência");
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
		System.out.println("");	
		System.out.println("Pontos por escolaridade: " + pontoes);
		System.out.println("Pontos por experiência: "+ pontoex);
		System.out.println("");

		if (pontoes>=20 && habilitacao=='s' ) {
			
			System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("ASSISTENTE");
		}
		
		else if (pontoex<=5 && pontoes>=30) {
			System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("GERENTE");
			
		}
		else if (pontoex > 5 && viagem == 's' && pontoes >=30) {
			
			System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("ANALISTA");
			System.out.println("GERENTE");
			
		}
		else {
			System.out.println("Infelizmente seu perfil não atende a empresa");
		}
		
	}
	
	

}
