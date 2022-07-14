import java.util.Scanner;

public class questao_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		double alt = 0, peso = 0, medAlt = 0, medId = 0, medIdPes = 0,qntAlt = 0;
	     int times = 0, jogadores = 0, qntIdInf = 0, qntId = 0, idade;
	     
	     
	     System.out.print("1- Digite a quantidade de times: ");
	     times = sc.nextInt();        
	     System.out.print("2- Digite a quantidade de jogadores: ");
	     jogadores = sc.nextInt();
	     System.out.println("-------------");
	         
	         for(int i=1; i<=times; i++){
	         for (int j = 1; j<=jogadores; j++){ 
	             System.out.print("3- Digite a idade do jogador " +  j + " do time " + i + ":");
	             idade = sc.nextInt();
	             System.out.print("4- Digite o peso do jogador " + j + " do time " + i + ":");
	             peso = sc.nextDouble();
	             System.out.print("5- Digite a altura do jogador " + j + " do time "+ i + ":");
	             alt = sc.nextDouble();
	             System.out.println("-------------");
	                 
	     
	     if(idade <=18 ){
	    	 qntIdInf++;
	     }
	     
	 
	     qntId = qntId + idade;
	     medId = qntId/jogadores;
	     

	     qntAlt = qntAlt + alt;
	     medAlt = qntAlt/jogadores;
	     
	     }
	         System.out.println("\nA média de jogadores com peso acima de 80: "+ medIdPes);        
	         System.out.println("\nA média de idades dos jogadores: "+ medId);
	         System.out.println("\nA média de alturas dos jogadores: "+ medAlt);        
	         System.out.println("\nA quantidade de jogadores de todos os times com idade inferior a 18 anos é: "+ qntIdInf);
	         
	         sc.close();
	 
	     }
	 }
	     
	     
	     }