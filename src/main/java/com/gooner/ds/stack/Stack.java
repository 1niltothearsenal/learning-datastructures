package main.java.com.gooner.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private int top;
    private int member;
    private int maxLength;
    private int topIndex;


    private List<Integer> arrayList = new ArrayList<>();
    List<Integer> stackedList = new ArrayList<>();

    public List<Integer> createList(int maxLength){
        this.maxLength=maxLength;
        for (int i=1; i<=maxLength; i++){
            member = i;
            arrayList.add(member);
           // System.out.println(member);
        }

        return arrayList;
    }

    public void printOriginalList(){
        System.out.println(arrayList);
    }

    public List<Integer> stackList(){


        topIndex = maxLength-1;

        for (int i = topIndex; i>=0;i--){
            top = arrayList.get(i);
            stackedList.add(top);

        }

        return stackedList;

    }
    public void printStackedList(){
        System.out.println(stackedList);
    }

}
