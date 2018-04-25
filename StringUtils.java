import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringUtils {
	public static void main(String[] args){
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);

			while(sc.hasNext()) {
				String nextLine = sc.nextLine();
				pauses(nextLine);
				System.out.println("\n\n");
			}

			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void pauses(String text){
		for (int i = 0; i < text.length(); i++){
			char curr = text.charAt(i);
			if (good(curr))
				System.out.print(" " + curr + " ");
		}
	}
	public static Boolean good(char curr){
		int c = (int) curr;
		return ((c > 1424 && c < 1442) || (c == 1475));
	}
}