package ques_1;

import java.util.*;

public class sort_by_name implements Comparator {
    public int compare(Object obj1, Object obj2){
        student s1 = (student) obj1;
        student s2 = (student) obj2;
        return s1.name.compareTo(s2.name);
    }
}
