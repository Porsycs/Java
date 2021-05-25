import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class U1244 {

	public static void main(String[] args) {
		Scanner tecl = new Scanner(System.in);
		int n = Integer.parseInt(tecl.nextLine());

		for(int x = 0; x < n; x++){
			String linha = tecl.nextLine();
			String[] pals = linha.split(" ");
			List<String> palavras = new ArrayList<>();

			for(int i = 0; i < pals.length; i++)
				palavras.add(pals[i]);
			palavras.sort(new Comp());
			Iterator<String> it = palavras.iterator();
			System.out.println(it.next());
		}
	}
}