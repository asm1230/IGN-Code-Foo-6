mport java.util.Scanner;

public class AZERTYtoQWERTY 
{
	private static char letter;
	
	public static String convert(String azerty)
	{
		String qwerty = "";
		 
		for(int i = 0; i < azerty.length(); i++)
		{	
			
			letter = azerty.charAt(i);	
			
			if(azerty.charAt(i) == '7' && azerty.charAt(i + 1) == '2')
			{
				letter = (char)72;
				i++;
			}
			else if(azerty.charAt(i) == '1' && azerty.charAt(i + 1) == '0' && azerty.charAt(i + 2) == '4')
			{
				letter = (char)104;
				i++;
				i++;
			} 
			
			if(letter == 'a')
				letter = 'q';
			else if(letter == 'q')
				letter = 'a';
			if(letter == 'A')
				letter = 'Q';
			else if(letter == 'Q')
				letter = 'A';
			
			if(letter == 'z')
				letter = 'w';
			else if(letter == 'w')
				letter = 'z';
			if(letter == 'Z')
				letter = 'W';
			else if(letter == 'W')
				letter = 'Z';
			
			if(letter == '^')
				letter = '[';
			
			if(letter == '¨')
				letter = '{';
			
			if(letter == '$')
				letter = ']';
			
			if(letter == '£')
				letter = '}';
			
			if(letter == 'm')
				letter = ';';
			if(letter == 'M')
				letter = ':';
			
			if(letter == '%')
				letter = '"';
			
			if(letter == '*')
				letter = '\\';
			
			if(letter == 'µ')
				letter = '|';
			
			if(letter == ',')
				letter = 'm';
			if(letter == '?')
				letter = 'M';
			
			if(letter == ';')
				letter = ',';
			
			if(letter == '.')
				letter = '<';
			
			if(letter == ':')
				letter = '.';
			
			if(letter == '/')
				letter = '>';
			
			if(letter == '!')
				letter = '/';
			
			if(letter == '§')
				letter = '?';
			
			if(letter == '&')
				letter = '1';
			else if(letter == '1')
				letter = '!';

			if(letter == 'é')
				letter = '2';
			else if(letter == '2')
				letter = '@';
			
			if(letter == '"')
				letter = '3';
			else if(letter == '3')
			letter = '#';
			
			if(letter == '\'')
				letter = '4';
			else if(letter == '4')
				letter = '$';
			
			if(letter == '(')
				letter = '5';
			else if(letter == '5')
				letter = '%';
			
			if(letter == '-')
				letter = '6';
			else if(letter == '6')
				letter = '^';
			
			if(letter == 'è')
				letter = '7';
			else if(letter == '7')
				letter = '&';
			
			if(letter == '_')
				letter = '8';
			else if(letter == '8')
				letter = '*';
			
			if(letter == 'ç')
				letter = '9';
			else if(letter == '9')
				letter = '(';
			
			if(letter == 'à')
				letter = '0';
			else if(letter == '0')
				letter = ')';
			
			if(letter == ')')
				letter = '_';
			
			if(letter == '°')
				letter = '-';
			
			if(letter == '²')
				letter = '`';

			qwerty += letter;	
		}
		return qwerty;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Enter a sentence.");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String qwertySentence = convert(sentence);
		System.out.println(qwertySentence);
		input.close();
	}
}
