import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;

		
		two = s.nextInt();
		three = s.nextInt();
		four = s.nextInt();
		five = s.nextInt();
		
		int onetwo = one + two;
		int onethree = onetwo + three;
		int onefour = onethree + four;
		int onefive = onefour + five;
		
		System.out.println(one + " " + onetwo + " " + onethree + " " + onefour + " " + onefive);
		
		int onetwo2 = Math.abs(one - two);
		int onethree2 = one + three;
		int onefour2 = onethree2 + four;
		int onefive2 = onefour2 + five;
		
		System.out.println(onetwo2 + " " + one + " " + onethree2 + " " + onefour2 + " " + onefive2);
		
		int onetwo3 = Math.abs(one - two - three);
		int onethree3 = Math.abs(one - three);
		int onefour3 = one + four;
		int onefive3 = onefour3 + five;
		
		System.out.println(onetwo3 + " " + onethree3 + " " + one + " " + onefour3 + " " + onefive3);
		
		int onetwo4 = Math.abs(one - two - three - four);
		int onethree4 = Math.abs(one - three - four);
		int onefour4 = Math.abs(one - four);
		
		System.out.println(onetwo4 + " " + onethree4 + " " + onefour4 + " " + one + " " + five);
		
		int onetwo5 = Math.abs(one - two - three - four - five);
		int onethree5 = Math.abs(one - three - four - five);
		int onefour5 = Math.abs(one - four - five);
		int onefive5 = Math.abs(one - five);
		
		System.out.println(onetwo5 + " " + onethree5 + " " + onefour5 + " " + onefive5 + " " + one);
		
		
	}

}
