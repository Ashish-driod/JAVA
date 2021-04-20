
import java.io.*;
import java.util.*;

public class ques_9 {
    public static void main(String[] args) {
        order o1 = new order(101,"pringles","Ashish");
        order o2 = new order(102,"Cornflakes","Saurav");
        order o3 = new order(100,"Cadbury","Abhishek");
        System.out.print("SERIALIZATION  ");
        try{
            FileOutputStream f = new FileOutputStream("ashish.txt");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(o1);
            out.writeObject(o2);
            out.writeObject(o3);
            out.flush();
            out.close();
            System.out.println("SUCCESS");
        }catch(Exception e){
            System.out.println("EXCEPTION : "+e);
        }
        System.out.println("DESERIALIZATION");
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("ashish.txt"));
            List<order> al = new ArrayList<>();
            al.add((order)in.readObject());
            al.add((order)in.readObject());
            al.add((order)in.readObject());
            Collections.sort(al);
            Iterator itr = al.iterator();
            while(itr.hasNext()){
                order o = (order)itr.next();
                System.out.println(o);
            }
        }catch (Exception e){
            System.out.println("EXCEPTION : "+e);
        }
    }
}
class order implements Serializable , Comparable {
    private int orderId;
    private String productName;
    private transient String customerName;
    order(int orderId, String productName,String customerName){
        this.orderId = orderId;
        this.productName = productName;
        this.customerName = customerName;
    }
    public int getOrderId(){ return orderId;}
    public String getProductName(){ return productName;}
    public String getCustomerName(){ return customerName;}

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        order o1 = (order)o;
        return this.orderId - o1.orderId;
    }
}
