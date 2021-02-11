package com.swagger.zohoTest;

import java.util.stream.Stream;

public class samples {
    //    public static void main (String[] args){
//
//
//
//
//    }
    interface InterF {
        int getRes(int a, int b);
    }

    public static int printRes(int a, int b, InterF interF) {
        return interF.getRes(b, a);
    }

    public static void main(String[] args) {
//        InterF interF=(a,b)->a%b;//30%20= 10 remainder
//        System.out.println(printRes(20,30, interF));
//        compareinStream();
        stringcomp();
//        calculate_locaker();
    }

    public static void stringcomp() {
        String str = "zoho";
        str.toUpperCase();
        str += "onzoho";
        System.out.println(str);
        String string = str.substring(2);
        System.out.println(str.substring(10));
        string = string + str.substring(10);
        System.out.println(string);
    }

    public void anymatch() {
        Stream<String> obj = Stream.of("Apples", "Apples", "apples", "Zebra", "zebra");
        obj.forEach(each -> {
            System.out.println(each);
        });
        //Sorted - will sort the elemnts increasin orders  A,A,Z,a,z
        //map- wil convert everythng to uppercase
        //anymatch()- any one among list if it satifies, it wil stop iteartion
        obj.sorted()
                .map(s -> {
                    return s.toUpperCase();
                }).anyMatch(s -> {
            System.out.println("String Match Condition:" + s);
            return s.startsWith("Z");
//
        });
    }

    public static void compareinStream() {
        Stream.of(1, -2, 3,-2)
                .sorted((s1, s2) -> {
                    System.out.printf("Sort Compare:%s;%s\n", s1, s2);
                    return s1.compareTo(s2);

                })
                .filter(s -> {
                    return s > 0;
                })
                .map(s -> {
                    return s.doubleValue();
                })
                .forEach(s -> System.out.println("Printed Val:" + s));
    }


    public static void calculate_locaker(){
        int No_of_lockers=6456 ;
        int opened=0;
        int close=0;
        int square=1;
        int index=2;
        while(square<=No_of_lockers){
            opened++;
            square=index*index;
            System.out.println(square+" "+index);
            index++;
        }
        System.out.println(opened);
    }
}


