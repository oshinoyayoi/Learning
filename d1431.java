package test;

import java.util.ArrayList;
import java.util.List;

//返回值要求为List

public class d1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		//返回值要求为List
        List<Boolean> list = new ArrayList<>();
        int max=candies[0];
        //找出最大值
        for(int i=1;i<candies.length;i++){
          max = max>candies[i]?max:candies[i];
        }
        //比较加了额外的糖果是否超过最大值
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;


	}


}
