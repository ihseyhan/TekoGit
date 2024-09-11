package Day20_MethodOverLoadAbdWrapperClass;

import java.util.ArrayList;

public class Topic6_Ts_ChangeElement {
    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>();

        RandomWords.add("pile");
        RandomWords.add("Rice");
        RandomWords.add("elastic");
        RandomWords.add("Florida");
        System.out.println(RandomWords);

        RandomWords.set(3,"Denver");
        System.out.println("New RandomWords = " + RandomWords);

        RandomWords.set(1,"Bulgur");
        System.out.println("2 RandomWords = " + RandomWords);

        int IndexOfElastic = RandomWords.indexOf("elastic");
        System.out.println("IndexOfElastic = " + IndexOfElastic);

        int IndexOfTeko = RandomWords.indexOf("Teko");
        System.out.println("IndexOfTeko = " + IndexOfTeko); //Basta verilen listenin icinde bu kelime olmadigi icin -1 yazdirdi.

        for (int i = 0; i < RandomWords.size() ; i++) {
            if (i < RandomWords.size() -1) {
                System.out.print(RandomWords.get(i) + ", ");
            }else{
                System.out.println(RandomWords.get(i));
            }
        }
        
        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("Bulgur");
        System.out.println("DoWeHaveBulgurInArrayList = " + DoWeHaveBulgurInArrayList);

        System.out.println(RandomWords.contains("Chocolate"));

        RandomWords.set(RandomWords.indexOf("elastic"), "Chocolate");
        System.out.println("RandomWords = " + RandomWords);
        System.out.println(RandomWords.contains("Chocolate"));

    }
}
