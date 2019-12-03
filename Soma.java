import java.util.*;
package exerc;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

	      int [] vetorA = new int [10];
	      int [] vetorB = new int [vetorA.length];
	      int aux;
	      for (int i=0; i<vetorA.length; i++){

	          System.out.println("Digite o valor de A-"+i);
	          vetorA[i] = ler.nextInt();
	        }
	      for (int i=0; i<vetorA.length; i++){
	         aux=0;
	        for (int j=1; j<=vetorA[i]; j++){
	            aux = aux+vetorA[j];
	        }
	            vetorB[i]=aux;
	        }
	       System.out.println(Arrays.toString(vetorB));
	}

}
