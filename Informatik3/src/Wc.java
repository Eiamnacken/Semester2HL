import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Wc {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		AllWords words = new AllWords();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			words.add(scanner.next());
		}
		
		System.out.println(words.toString());//Liefert alle woerter mit Anzahl
		System.out.println(words.distinctWords());//Liefert Anzahl der verschiedenen Woerter 
		System.out.println(words.totalWords());//Liefert Anzahl aller Woerter
		System.out.println(words.mostUsed());//Liefert das meist genutzte Wort 
	}
}
