*/
public class Doctors extends Staff {
    private int Salary;
    private String specialty;

    public Doctors() {
    }

    public Doctors( String name, int ID, int phoneNumber, int age, String address, String Gender, String certification, String languages, String gualification,String specialty,int salary) {
        super( name, ID, phoneNumber, age, address, Gender,certification, languages, gualification);
        this.Salary = salary;
        this.specialty = specialty;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public double Salary(double deduct ,double bonus ){
        
        return Salary+bonus-deduct;
    }

    @Override
    public String toString() {
        return "Doctors{" +super.toString()+ "Salary=" + Salary + ", specialty=" + specialty + '}';
    }
    
    
        }
