import java.util.Scanner;
public class lab4A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter string");
		String str=sc.nextLine();
		char ch;
		int vowel=0;
		int consonant=0;

		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowel++;
			}else if(ch==' '){

			}
			else{
				consonant++;
			}
		}
		System.out.println("vowel is"+vowel);
		System.out.println("consonant is"+consonant);
	}
}