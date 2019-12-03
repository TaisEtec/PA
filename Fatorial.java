import java.util.*;
package exerc;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner (System.in);

	      int [] vetorA = new int [15];
	      int [] vetorB = new int [vetorA.length];

	      for (int i=0; i<vetorA.length; i++){

	          System.out.println("Digite o "+i+" numero para saber o seu fatorial:");
	          vetorA[i] = ler.nextInt();
	        }
	      for (int i=0; i<vetorA.length; i++){
	         vetorB[i]=1;
	        for (int j=1; j<=vetorA[i]; j++){
	            vetorB[i] *= j;
	        }
	       }
	         System.out.print("Vetor A =");
	       for (int i=0; i<vetorA.length; i++){
	              System.out.print(vetorA[i] +" ");
	        }
	         System.out.print("Vetor B =");
	       for (int i=0; i<vetorA.length; i++){
	              System.out.print(vetorB[i] +" ");
	        }
	         System.out.println();
	}


	}

