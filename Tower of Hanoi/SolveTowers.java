import java.util.Scanner;

public class SolveTowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int disk;
		System.out.println("How many disks are there?");
		disk = scan.nextInt();
		
		TowersOfHanoi towers = new TowersOfHanoi(disk);
		towers.solve();

	}

}
