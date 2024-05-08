*/
public abstract class Staff extends Person {
    private String certification;
    private String languages;
    private String gualification;

    public Staff() {
    }

    
    public Staff( String name, int ID, int phoneNumber, int age, String address, String Gender,String certification, String languages, String gualification) {
        super(name, ID, phoneNumber, age, address, Gender);
        this.certification = certification;
        this.languages = languages;
        this.gualification = gualification;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getGualification() {
        return gualification;
    }

    public void setGualification(String gualification) {
        this.gualification = gualification;
    }
    
   public abstract double Salary(double x , double y);
    
}
