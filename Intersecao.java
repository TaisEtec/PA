import java.util.*;
package exerc;

public class Intersecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner (System.in);

	      int [] vetorA = new int [10];
	      int [] vetorB = new int [10];
	      int [] vetorC = intersecao(vetorA, vetorB);

	      for (int i=0; i<vetorA.length; i++){

	          System.out.println("Digite o valor de A-"+i);
	          vetorA[i] = ler.nextInt();
	        }
	      for (int j=0; j<vetorB.length; j++){

	          System.out.println("Digite o valor de B-"+j);
	          vetorB[j] = ler.nextInt();
	        }
	      private static int[] intersecao(int[] vetorA, int[] vetorB){
	            int []aux = new int [vetorA.length+vetorB.length];
	            int k=0;

	            for (int i=0;i<vetorA.length;i++)
	               for (int j=0; j<vetorB.length;j++){
	                if(vetorA[i]==vetorB[j])
	                   aux[k++]= vetorA[i];
	         }
	            int []vetorC = new int[k];
	 
	            for (int i=0;i<k;i++) {
	              vetorC[i] = aux[i];
	          return vetorC;
	        }
	       System.out.println(Arrays.toString(vetorC));
	       }
	}

