import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      int num1, num2, result;
	      System.out.print("Enter num1: ");
	      num1 = scan.nextInt();
	      System.out.print("Enter num2: ");
	      num2 = scan.nextInt();
	      try{
	          result = num1/num2;
	          System.out.println("The result is " +result);
	      } 
	      catch (ArithmeticException div) {
	         System.out.println ("Exception Thrown: " + div);
	      }
	}

}
gcloud container clusters create security-demo-cluster833 \
   --zone us-central1-c \
   --machine-type n1-standard-4 \
   --num-nodes 2 \
   --enable-network-policy
