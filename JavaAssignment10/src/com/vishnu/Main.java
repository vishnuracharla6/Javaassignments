package com.vishnu;

public class Main {

    public static void main(String[] args) {

        SList<Integer> list=new SList<>();
        SListIterator<Integer> listIterator = list.iterator();

        listIterator.add(1);
        listIterator.add(2);
        listIterator.add(3);
        listIterator.add(4);
        listIterator.add(5);
        System.out.println(list);

        listIterator=list.iterator();
        listIterator.remove(2);
        listIterator.remove((4));
        System.out.println(list);
    }
}
