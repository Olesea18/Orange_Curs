package Lesson8;

import java.util.HashMap;

public class Values {
    public static void main(String[] args) {
        HashMap<Integer,String> job=new HashMap<>();
        job.put(1,"MAIB");
        job.put(2,"Allied Testing");
        job.put(3,"EST Computer");
        job.put(4,"Orange");
        System.out.println(job);
        // Print keys
        for (Integer i : job.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : job.values()) {
            System.out.println(i);
        }
    }
}

