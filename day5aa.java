package test;

public class day5aa {
	public int finalValueAfterOperations(String[] operations) {
        int X = 0 ;
        for(int i=0; i<operations.length ; i++) {
        if(operations[i].equals("++x") || operations[i].equals("x++")){
            X += 1;
        }else if(operations[i].equals("--x") || operations[i].equals("x--")){
            X -= 1;
        }
        }
return X;

    }

}
