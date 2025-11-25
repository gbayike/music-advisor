import java.util.*;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, lst1 and lst2
        int occLst1 = Collections.frequency(list1, elem);
        int occLst2 = Collections.frequency(list2, elem);

        return occLst1 == occLst2;
    }
}