
import java.net.*;
import java.util.*;
import java.io.*;

public class Scrabble 
{
	private char letter;
	private int pointValue;
	private ArrayList<String> list;
	private String listWord;
	private static char [] hand;
	
	public Scrabble(ArrayList<String> theList, char [] theHand)
	{
		list = theList;
		hand = theHand;
	}
	
	public int scoreWord(String word)
	{
		int sumPoints = 0;
		
		for (int i = 0; i <= word.length(); i++)
		{
			pointValue = 0;	
			letter = word.charAt(i);
		
			switch(letter)
			{		
				case 'A': case 'E': case 'I': case 'O': case 'U':
					pointValue = 1;
					break;
				case 'D': case 'G':
					pointValue = 2;
					break;
				case 'B': case 'C': case 'M': case 'P':
					pointValue = 3;
					break;
				case 'F': case 'H': case 'V': case 'W': case 'Y':
					pointValue = 4;
					break;
				case 'K': 
					pointValue = 5;
					break;
				case 'J': case 'X': 
					pointValue = 8;
					break;
				case 'Q': case 'Z': 
					pointValue = 10;
					break;
			}
			sumPoints += pointValue;
		}
		return sumPoints;
	}
	
	public static void setHand(int numLetters)
	{
		hand = new char[numLetters];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();										
		for(int i = 0; i < hand.length; i++)
		{
			hand [i] = alphabet.charAt(rand.nextInt(alphabet.length()));			
		}
	}
	
	public static char[] getHand()
	{
		return hand;
	}
	
	public void refineList(ArrayList<String> inputList)
	{
		ArrayList<String> newList = new ArrayList<String>();
		listWord = "";
		int c = 0;
		int k = 0;
		
		while(inputList.size() > 10)
		{
			for(int i = 0; i < inputList.size(); i++)
			{
				listWord = inputList.get(i);
				
				for(int j = 0; j < hand.length; j++)
				{
					if(listWord.length() > hand.length)
						inputList.remove(listWord);
	
					if(c + 1 <= listWord.length())
					{
						if(listWord.charAt(c) == hand[j] && !newList.contains(listWord))
							newList.add(listWord);
					}
				}
			
//				while(k + 1 < listWord.length())
//				{
//					for(int n = 0; n < hand.length; n++)
//					{				
//						if(newList.contains(listWord) && listWord.charAt(k) != hand[n])
//						{
//							listWord.toCharArray();
//							if(listWord.)
//								hand.toString();
//						}					
//						
//					}
//					k++;
//				}
				

				
			}
			ArrayList<String> temp = newList;
			newList = inputList;
			inputList = temp;
			newList.clear();
			c++;			
			
		}
		
		System.out.println(inputList);
		 
	}
	
	public static void main(String [] args) throws IOException
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many random letters would you like in your hand?");
		int numLetters = s.nextInt();
		setHand(numLetters);
		getHand();
		System.out.println("Your letters are: " + Arrays.toString(hand));
		s.close();		
	
		URL url = new URL("http://www.ign.com/code-foo/2016/words.txt");
		InputStream input = url.openStream();
		
		Scanner scan = new Scanner(input);		
		ArrayList<String> list = new ArrayList<String>();		
		String listWord = "";
		while (scan.hasNext())
		{
			listWord = scan.nextLine();
			list.add(listWord);								
		}
		
		Scrabble scr = new Scrabble(list, hand);		
		scan.close();
		System.out.println(list);
		
		scr.refineList(list);
		
	}
	
}
