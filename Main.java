import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int total = 0;
		
		System.out.println("Digite a quantidade de notas a serem lidas: ");
		 int n = sc.nextInt();
		 
		do { System.out.println("Digite a nota " +contador+ ":");
		int nota = sc.nextInt();
		total = total+nota;
		contador = contador+ 1;
		
		}while (contador <= n);
	
		    sc.close();
		    int media = total/n;
		     System.out.println("Media das notas: " +media);
	}

	  }
