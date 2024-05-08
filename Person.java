*/
public class Person {
     //Data members
    private String name ;
    private int ID;
    private int phoneNumber;
    private int age;
    private String address ;
    private String Gender ;
    //no argument constracture
    public Person(){
        name="null";
        ID=0000;
        phoneNumber=00000000000;
        age=0;
        address="null";
        
    }
    //argument constracture
    //overloading
    public Person(String name,int ID,int phoneNumber,int age,String address,String Gender){
        this.Gender=Gender;
        this.ID=ID;
        this.address=address;
        this.age=age;
    
        this.name=name;
        this.phoneNumber=phoneNumber;
     
       
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;                   
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return   "name=" + name + ", ID=" + ID + ", phoneNumber=" + phoneNumber + ", age=" + age + ", address=" + address  + ", Gender=" + Gender ;
    }
    
    
}
