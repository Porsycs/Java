import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class U2174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> pokemonNomes = new LinkedHashSet<>();
        int numPokemons = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numPokemons; i++)
            pokemonNomes.add(sc.nextLine());    
        System.out.printf("Falta(m) %d pokemon(s).\n",(151 - pokemonNomes.size()));
    }
}