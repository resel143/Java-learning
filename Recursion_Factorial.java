*******************************************************************************/
import java.util.Scanner;
public class Main
{   
    static int fac(int n){
        if(n==0) return 1;
        else return n*fac(n-1);
    }
	public static void main(String[] args) {
		System.out.println("Factorial of :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int answer =fac(number);
		System.out.println(answer);
	}
}
