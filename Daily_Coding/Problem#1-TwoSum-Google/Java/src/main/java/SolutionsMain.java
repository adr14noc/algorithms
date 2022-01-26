package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionsMain {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 3, 7);
        int k = 17;

        System.out.println(firstAttemptWorst(list, k));
        System.out.println(hashmapSolution(list, k));

    }

    public static String firstAttemptWorst(List<Integer> list, int k) {

        for (Integer num : list) {

            for (int index = 0; index < list.size(); index++) {
                if (list.get(index) + num == k)
                    return "true " + num + " + " + list.get(index) + " = " + k;
            }

        }
        return "false";
    }

    private static Boolean hashmapSolution(List<Integer> list, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int complement = k - list.get(i);

            if (map.containsKey(complement)) {
                return true;
            } else {

                map.put(list.get(i), i);

            }

        }

        return false;
    }


}
