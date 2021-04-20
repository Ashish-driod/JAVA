import java.util.Locale;
import java.util.Scanner;

public class ques_2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase(Locale.ROOT);
        if(a.equals("circle"))
            circle.display();
        else if (a.equals("rectangle"))
            rectangle.display();
        else if(a.equals("square"))
            square.display();
    }
}

class circle{
   static void display(){
        System.out.println("Shape is circle.");
    }
}
class rectangle{
    static void display(){
        System.out.println("Shape is Rectangle.");
    }
}
class square{
    static void display(){
        System.out.println("Shape is square.");
    }
}