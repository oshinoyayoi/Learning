package test;

public class day5cc {	
	public int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i = 0 ; i < sentences.length ; i++ ) {
         String [] temp = sentences[i].split(" ");
         max = Math.max(max, temp.length);
        }
return max;
    }

}
