
import java.net.*;
import java.util.*;
import java.io.*;

/*determine to best Scrabble word from a LIST OF LETTERS
 *
 * 
 * 
 * For each of the 7 letters in your hand, only look at words from API
 * that start with two of those letters. 
 * 
 * 
 *  Compare each of the 7 letters i your hand and scan through list of 
 * words. If list contains letters that are not in your hand, remove
 * those words from the list.
 * 
 * 
 * 
 */
public class Scrabble 
{
	private char letter;
	private int pointValue;
	private ArrayList<String> list;
	private String listWord;
	private static char [] hand;
	
	public Scrabble()
	{
		letter = this.letter;
		pointValue = 0;
		list = null;
		listWord = "";
		hand = null;
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
	
	public void setHand(int numLetters)
	{
		hand = new char[numLetters];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();										
		for(int i = 0; i < hand.length; i++)
		{
			hand [i] = alphabet.charAt(rand.nextInt(alphabet.length()));			
		}
	}
	
	public char[] getHand()
	{
		return hand;
	}
	
	public void refineList(ArrayList<String> list, char [] hand)
	{
		
		
		listWord = "";
		ArrayList<String> newList = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++)				
		{
			for(int j = 0; j < hand.length; j++)
			{
				listWord = list.get(i);
				if(listWord.charAt(0) == hand[j])
					newList.add(listWord);
			}
		}	
		list = newList;											//want to refine words until there are only two left in list
																//keep comparing to hand until only 2 are left
	}
	
	public static void main(String [] args) throws IOException
	{
		Scrabble scr = new Scrabble();
		Scanner s = new Scanner(System.in);
		System.out.println("How many random letters would you like in your hand?");
		int numLetters = s.nextInt();
		scr.setHand(numLetters);
		System.out.println("Your letters are: " + Arrays.toString(scr.getHand()));
		s.close();
		
		URL url = new URL("http://www.ign.com/code-foo/2016/words.txt");
		InputStream input = url.openStream();
		Scanner scan = new Scanner(input);
		
//		char [] hand = new char [7];//some words in list are longer than 7 letters
		
//		Random rand = new Random();										
//		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//		int length = alphabet.length();								//gives 7 random letters to hand
//		for(int i = 0; i < hand.length; i++)
//		{
//			hand [i] = alphabet.charAt(rand.nextInt(length));			
//		}
		
		ArrayList<String> list = new ArrayList<String>();		
		String listWord = "";
		while (scan.hasNext())
		{
			listWord = scan.nextLine();
			list.add(listWord);						//prints list of words from URL in an ArrayList			
		}
		System.out.println(list);
		
		ArrayList <String> refinedList = new ArrayList<String>();
		ArrayList <String> refinedList2 = new ArrayList<String>();
	
		listWord = "";
		ArrayList<String> newList = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++)				//need to find a way to change only list,
																	//and not have to use newList
		{
			for(int j = 0; j < hand.length; j++)
			{
				listWord = list.get(i);
				if(listWord.charAt(0) == hand[j])
					refinedList.add(listWord);
			}
		}	
											//refines words until there are only two left in list
							
		for(int i = 0; i < refinedList.size(); i++)
		{
			for(int j = 0; j < hand.length; j++)
			{
				listWord = refinedList.get(i);
				if(listWord.charAt(1) == hand[j])
					refinedList2.add(listWord);
			}
		}
		System.out.println(refinedList);	
		System.out.println(refinedList2);	
			
			

	//	System.out.println(list);
		
//		ArrayList<String> refinedList = null;		
//		char handLetter;
//		for(int i = 0; i < hand.length; i++)
//		{
//			handLetter = hand [i];
//			if(handLetter == listWord.charAt(0))
//				refinedList.add(listWord);
//		}
//		System.out.println(refinedList);
		


//		scan.close();
//		scr.getHand();
//		System.out.println("Your letters are: " + Arrays.toString(hand));
//		scr.refineList(list, hand);
//		System.out.println(list);
//		

	}
	
}
