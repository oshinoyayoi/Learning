package test;

public class a2000 {
	 public String reversePrefix(String word, char ch) {
		 char[] arr=word.toCharArray();
		 for (int i = 0,j=word.indexOf(ch); i < j; i++,j--) {
					char a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
			}
		
		 return new String(arr);
	    }
		 
	 public static void main(String[] args) {
			String word="abcdefd";
			char ch='d';
			char[] arr=word.toCharArray();
			 for (int i = 0,j=word.indexOf(ch); i < j; i++,j--) {
						char a = arr[i];
						arr[i] = arr[j];
						arr[j] = a;
			
			}
			System.out.println(arr);
}
}
