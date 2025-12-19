package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumApp {
    public static void main(String[] args) {

        int target = 6;
        int [] needToFind = {7,2,1,3,6,4,0,9,8};
        System.out.println((twoSum(needToFind,target)));
        HashMap<String,Integer> map = new HashMap<>();

    }


    public  static ArrayList<Integer> twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer>list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i]) ) {

                list.add(map.get(target - nums[i]));
                list.add(i);

            }

            map.put(nums[i], i);
        }
        return list;
    }
}
