package test;

public class c1309 {
	public String freqAlphabets(String s) {
	    String[] table = new String[17];
	    for(int i=0;i<table.length;i++) 
	        table[i] = i+10+"#";
	    for(int j=0;j<table.length;j++)
	        s=s.replace(table[j],String.valueOf((char)(j+'a'+9)));
	    for(int i=1;i<=9;i++)
	        s=s.replace(i+"", String.valueOf((char)(i+'a'-1)));
	    return s;
	}    

}
