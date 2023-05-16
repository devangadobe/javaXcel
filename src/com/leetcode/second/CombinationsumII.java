package com.leetcode.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationsumII {
		

	public static void main(String[] args) {

		//int[] candidates = {10,1,2,7,6,1,5};
		int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(new CombinationsumII().combinationSum2(candidates, 30));

	}

	public List<List<Integer>> combinationSum2(int[] arr, int target) {

		List<List<Integer>> dlist = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
		//return combinationSums2(arr, target, dlist, list, 0);
        return helper(0,arr,target,list,dlist);

	}

	/*public List<List<Integer>> combinationSums2(int[] arr, int target, List<List<Integer>> dlist, List<Integer> list,
			int pos) {

		if (target <= 0) {
			if (target == 0) {			
				List<Integer> temp = new ArrayList<Integer>();
				Boolean flag = true;
				temp.addAll(list);
				Collections.sort(temp);
				for(int i=0; i<dlist.size(); i++) {
					if(equalists(dlist.get(i), temp)){
						flag = false;
						break;
					}
				}
				if(flag) {
					dlist.add(temp);
				}
			}
			return dlist;
		}

		if (pos < arr.length) {			
			for (int i = pos; i < arr.length; i++) {
				list.add(arr[i]);
				combinationSums2(arr, target - arr[i], dlist, list, i + 1);
				list.remove(list.size() - 1);
			}
		}

		return dlist;

	}*/
	
	  public List<List<Integer>> helper(int index, int[] arr, int target, List<Integer> list, List<List<Integer>> finalList){
	        
          if(target == 0){
              finalList.add(new ArrayList<>(list));
              return finalList;
          }
          
      
      for(int i = index;i<arr.length;i++){
          if(i != index && arr[i] == arr[i-1]){
              continue;
          }
          if(arr[i] > target){break;}
          list.add(arr[i]);
          helper(i+1,arr,target-arr[i],list,finalList);
          list.remove(list.size()-1);
      }
      
      return finalList;
  }
	
	public boolean equalists(List<Integer> a, List<Integer> b) {
		if(a.size() == b.size()) {
			int i=0;
			int y = a.size();
			while(i<y) {
				if(a.get(i)!=b.get(i)) {
					return false;
				}
				i++;
			}
			return true;
		}
			return false;
	}

}
