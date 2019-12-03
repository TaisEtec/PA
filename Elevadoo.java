package exerc;

public class Elevadoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] vetorA = new double [11];
		  
	    for (int i=0; i<vetorA.length; i++){

	       vetorA[i] = Math.pow(2, i);
	    }
	    System.out.print("vetor A = ");
	    for (int i=0;i<vetorA.length;i++){
	         System.out.print(vetorA[i] + "");
	    }
	    System.out.println();
	}

}
