import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//   Regex API  means Regular Expression 
//   its used for String pattern and Match

public class RegexAPI_Example {

	public static void main(String[] args)
	{

//  first way :- pattern.matches() take two string parameters one is Regex and second one is input string 		
//		boolean a=Pattern.matches(".*Arun.*","Arun is Employee of CG");
//		boolean a=Pattern.matches("abcd","Arun is Employee of CG");

// Second Way:-
//		Pattern pattern=Pattern.compile(".*Arun.*");
//		Matcher mac=pattern.matcher("my friend name is Arun");
//		boolean a=mac.matches();		
		
// Third Way:-
		boolean a=Pattern.compile(".*Arun.*").matcher("my friend name is Arun").matches();
		

		if(a)
		{
			System.out.println("Matched...");
		}
		else {
			System.out.println("Not Matched....");
		}
	
		
		
/*	Regex Character classes:-
 
	No.		Character Class		Description
	1		[abc]				a, b, or c (simple class)
	2		[^abc]				Any character except a, b, or c (negation)
	3		[a-zA-Z]			a through z or A through Z, inclusive (range)
	4		[a-d[m-p]]			a through d, or m through p: [a-dm-p] (union)
	5		[a-z&&[def]]		d, e, or f (intersection)
	6		[a-z&&[^bc]]		a through z, except for b and c: [ad-z] (subtraction)
	7		[a-z&&[^m-p]]		a through z, and not m through p: [a-lq-z](subtraction)
 
 */
		
		
		
/*	Regex Quantifiers:-
	The quantifiers specify the number of occurrences of a character.

	Regex		Description
	X?			X occurs once or not at all
	X+			X occurs once or more times
	X*			X occurs zero or more times
	X{n}		X occurs n times only
	X{n,}		X occurs n or more times
	X{y,z}		X occurs at least y times but less than z times
*/	
		
		

		
/*	Regex Metacharacters:-
	The regular expression metacharacters work as shortcodes.

	Regex		Description
	.			Any character (may or may not match terminator)
	\d			Any digits, short of [0-9]
	\D			Any non-digit, short for [^0-9]
	\s			Any whitespace character, short for [\t\n\x0B\f\r]
	\S			Any non-whitespace character, short for [^\s]
	\w			Any word character, short for [a-zA-Z_0-9]
	\W			Any non-word character, short for [^\w]
	\b			A word boundary
	\B			A non word boundary

 */		
		
		
		
		
		
		
		
	}
}