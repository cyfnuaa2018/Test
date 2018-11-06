import java.util.Scanner;

public class Main_Lang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the year:\n");
		Date dd = new Date();
		Scanner sc = new Scanner(System.in);
		dd.getchary(sc.nextLine());
		System.out.println("Please input the month:\n");
		dd.getcharm(sc.nextLine());
		System.out.println("Please input the date:\n");
		dd.getchard(sc.nextLine());
		sc.close();
		if(dd.Convert()) {
			if(dd.IsLegalMonth() && dd.IsLegalDate())
				dd.gettrue();
			else
				dd.getfalse();
		}
	}
}
