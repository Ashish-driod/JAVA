package ques_1;

import java.util.Comparator;

public class sort_by_age implements Comparator {
    public int compare(Object obj1, Object obj2){
        student s1 = (student)obj1;
        student s2 = (student)obj2;
        if(s1.age>s2.age)
            return 1;
        else if (s1.age <s2.age)
            return -1;
        else
            return 0;
    }
}
