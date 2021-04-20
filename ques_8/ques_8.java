package ques_8;


import java.util.SortedSet;
import java.util.TreeSet;

public class ques_8 {
    public static void main(String[] args) {
        SortedSet<player> set = new TreeSet<>();
        set.add(new player("Messi",35,"Football"));
        set.add(new player("Virat",29,"Cricket"));
        set.add(new player("Rohit",32,"Cricket"));
        set.add(new player("Ronaldo",33,"Football"));
        System.out.println(set);

    }
}
class player implements Comparable<player> {
    String name;
    int age;
    String game;
    player(String name, int age, String game){
       this.name=name;
       this.age=age;
       this.game=game;
    }
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public int getAge(){return age;}
    public void setAge(){this.age=age;}
    public String getGame(){return game;}
    public void setGame(){this.game=game;}


    @Override
    public int compareTo(player p) {
         if(this.getGame().compareToIgnoreCase(p.getGame())==0){
             return this.getAge() - p.getAge();
         }
         return this.getGame().compareToIgnoreCase(p.getGame());
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", game='" + game + '\'' +
                '}';
    }
}
