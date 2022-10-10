import java.util.*;
import java.util.Scanner;


public class algo34{
	
	public static void main(String[] args){
		String si;
		String encodedalog34;
		String decode34;
		String s1;
	
		
		
		 String keyalpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890-;',./?></*-+.=--=";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    int length = 15;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Your Json or string data in String format");
	s1=sc.nextLine();
	System.out.println("original String :--   "+ s1);
    for(int i = 0; i < length; i++) {
      int index = random.nextInt(keyalpha.length());
      char randomChar = keyalpha.charAt(index);
      sb.append(randomChar);
    }
	String randomString = sb.toString();
	System.out.println(randomString);
		encodedalog34=encoding(s1,randomString);
		
		//encrypting
		System.out.println(encodedalog34);
		decode34=decode(encodedalog34,randomString);
		System.out.println(decode34);
	}
	
	private static String encoding(String original,String key){
		String encoded_String;
		String encoded_Stringalgo34;
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		String encodedString = Base64.getEncoder().encodeToString(original.getBytes());
		encoded_Stringalgo34=new String();
		for(int i=0;i<encodedString.length();i++){
			encoded_Stringalgo34=encoded_Stringalgo34+encodedString.charAt(i);
			if(i==rand){
				encoded_Stringalgo34=encoded_Stringalgo34+key;
			}
		}	
		System.out.println(encoded_Stringalgo34);
		String encoded_Stringalgo = Base64.getEncoder().encodeToString(encoded_Stringalgo34.getBytes());
		return encoded_Stringalgo;
			
	}
	
	
	private static String decode(String encoded_stringalgo34,String key){
		String decode34;
		byte[] decodedBytes34 = Base64.getDecoder().decode(encoded_stringalgo34);
		String decodedStringalgo34 = new String(decodedBytes34);
		decode34=new String();
		decode34=decodedStringalgo34.replace(key,"");
		byte[] decodedBytes = Base64.getDecoder().decode(decode34);
		String decodedStringorignal = new String(decodedBytes);
		return decodedStringorignal;
		
	}
	
}
