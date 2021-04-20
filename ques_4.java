 final class employee {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String company;
    private final int experience;

    public employee(String firstName,String lastName,int age,String company,int experience){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
        this.company = company;
        this.experience = experience;

    }

     public String getFirstName(){ return firstName; }
     public String getLastName(){ return lastName; }
     public int getAge(){ return age; }
     public String getCompany(){ return company; }
     public int getExperience(){return experience; }

}
public class ques_4{
    public static void main(String[] args) {
        employee e1 = new employee("Ashish","Mohanty",24,"WIPRO",0);
        employee e2 = new employee("Jane","Doe",27,"FUJITSU",5);
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+" "+e1.getAge()+" "+e1.getCompany()+" "+e1.getExperience());
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+" "+e2.getAge()+" "+e2.getCompany()+" "+e2.getExperience());
    }
}

