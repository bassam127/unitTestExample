package com.bassam.junit.example;

public class StringHelper {
	
	
	public String truncateInFirst2Position(String str)
	{
		if(str.length() <=2)
			return str.replaceAll("A", "");
		String firstChars=str.substring(0, 2);
		String stringMinusFirst2Chars=str.substring(2);
		return firstChars.replaceAll("A", "") +stringMinusFirst2Chars;
	}
	
	
	public boolean areFirstAndTowCharactersTheSame(String str)
	{
		if(str.length()<=1)
			return false;
					if(str.length()==2)
						return true;
					String first2Char=str.substring(0, 2);
					String last2Char=str.substring(str.length()-2);
					return first2Char.equals(last2Char); 
					
	}
	
	

}
