import java.util.Scanner;
class SumOfNumbers {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = 0;
		for(int i = 0; i<=n; i++){
			num = num+i;

		}System.out.println(num);
	}
}