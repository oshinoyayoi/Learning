package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a1436 {
	/*
	 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示
	 * 其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。
	 * 请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
     * 题目数据保证线路图会形成一条不存在循环的线路，因此恰有一个旅行终点站。
	 */
	 public String destCity(List<List<String>> paths) {
		 //只出现过一次的cityBi就是终点站
		 Set<String> cityA=new HashSet<>();
		 for (List<String> a:paths) {
			cityA.add(a.get(0));
		}
		 for (List<String> a : paths) {
			if (a.contains(a.get(1))) {
				return a.get(1);
			}
		}
		return null;

	    }
	 public static void main(String[] args) {
		 List<String> ={["London","New York"],["New York","Lima"],["Lima","Sao Paulo"];
	 }

	
	}


