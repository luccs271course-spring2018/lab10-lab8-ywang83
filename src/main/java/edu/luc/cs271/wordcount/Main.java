package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    Map<String, Integer> aMap = new HashMap<>();
    WordCounter object = new WordCounter(aMap);

    List<String> list = new ArrayList<String>();
    while (input.hasNext()) {
      String[] array = input.nextLine().split(" ");
      for (int i = 0; i < array.length; i++) {
        list.add(array[i]);
      }
    }
    //    System.out.println(list);
    Iterator in = list.iterator();

    object.countWords(in);

    Set<Map.Entry<String, Integer>> mySet = aMap.entrySet();
    // System.out.println(mySet);

    List<Map.Entry<String, Integer>> myList = new ArrayList<>();
    if (mySet != null) {
      Iterator iterator = mySet.iterator();
      while (iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        myList.add(entry);
      }
    }

    DescendingByCount comp = new DescendingByCount();

    for (int i = 0; i < myList.size(); i++) {
      for (int j = 0; j < myList.size(); j++)
        if (comp.compare(myList.get(i), myList.get(j)) == 1) {
          Collections.swap(myList, i, j);
        }
    }

    if (myList.size() > 10) {
      System.out.println(myList.subList(0, 10));
    } else {
      System.out.println(myList);
    }
  }
}
