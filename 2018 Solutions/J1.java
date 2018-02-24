import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		one = s.nextInt();
		two = s.nextInt();
		three = s.nextInt();
		four = s.nextInt();
		
		if ((one == 8 || one == 9) && two == three && (four == 8 || four == 9)) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
	}

}
