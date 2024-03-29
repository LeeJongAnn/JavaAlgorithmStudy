package com.company.Programmers.Level0.Day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열회전시키기 {
    public static void main(String[] args) {
        int[] array = {4, 455, 6, 4, -1, 45, 6};
        solution(array, "right");
    }

    public static int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println(list);
        if(direction.equals("right")){
            list.add(0,list.get(list.size() - 1));
            list.remove(list.size()-1);
        } else {
            list.add(list.size(),list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

