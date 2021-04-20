package ques_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort {
    public static void main(String [] args){
        ArrayList<student> al = new ArrayList<>();
        al.add(new student("Ashish",24,20168099));
        al.add(new student("Saurav",21,20156899));
        al.add(new student("Abhishek",26,20169000));
        al.add(new student("Kajol",27,20137099));

        System.out.println("Sorting in terms of age");
        Collections.sort(al,new sort_by_age());
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            student s = (student)itr.next();
            System.out.println(s.age+"  "+s.name+"  "+s.id);
        }
        System.out.println();
        System.out.println("Sorting in terms of name");
        Collections.sort(al,new sort_by_name());
        itr = al.iterator();
        while(itr.hasNext()){
            student s = (student)itr.next();
            System.out.println(s.age+"  "+s.name+"  "+s.id);
        }
        System.out.println();
        System.out.println("Sorting in terms of id");
        Collections.sort(al,new sort_by_id());
        itr = al.iterator();
        while(itr.hasNext()){
            student s = (student)itr.next();
            System.out.println(s.age+"  "+s.name+"  "+s.id);
        }
    }
}
