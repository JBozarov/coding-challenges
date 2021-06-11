package io.javabrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);

        linkedList.stream().filter(v -> v.equals(12)).forEach(System.out::println);

        Collection collection = new ArrayList();
    }
}
