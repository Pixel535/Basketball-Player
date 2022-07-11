import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int wysokoscKosz = scanner.nextInt();
		int wysokoscWymagana = scanner.nextInt();
		int wartoscPowiekszaniaGuza = scanner.nextInt();
		int Counter = 0;
		
		if(wysokoscKosz < 1 || wysokoscKosz > 200 || wysokoscWymagana < 1 || wysokoscWymagana > 1000000000 || wartoscPowiekszaniaGuza < 1 || wartoscPowiekszaniaGuza > 1000000000)
		{
			System.out.println("Wysokosc koszykarza musi byc >= 1 oraz <= 200, a pozostale parametry >= 1 oraz <= 1 000 000 000");
		}
		else
		{
			while(wysokoscKosz < wysokoscWymagana)
			{
				wysokoscKosz = wysokoscKosz + wartoscPowiekszaniaGuza;
				Counter++;
			}
			System.out.println(Counter);
		}
			
	}

}
