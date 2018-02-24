import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int spaces = 0;
		int ctr = 0;
		String day1;
		String day2;
		
		spaces = s.nextInt();
		
		day1 = s.next();
		day2 = s.next();
		
		for (int a = 0; a < spaces; a++) {
			if ((day1.substring(a, a+1).equals("C")) && day1.substring(a, a+1).equals(day2.substring(a, a+1))) {
				ctr++;
			}
		}
		
		System.out.println(ctr);
		
	}

}
