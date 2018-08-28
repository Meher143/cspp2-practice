import java.util.Scanner;

class factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorialnumbers(n));

	}
	public static int factorialnumbers(int n){
	if (n == 1){
		return 1;
	}
	else {
			return(n * factorialnumbers(n-1));
	}
	}
} 