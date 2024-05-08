import java.util.ArrayList;
public class PatientData extends Person{
    private int BloodPressure;
    private int HeartRate;
    private int BloodSugarLevel;
    private double Fever;
    //aggregation
    patientRoom r;
    //composition
    HospitalFees f;
    static ArrayList<String> N=new ArrayList<>();
   public PatientData(){
       BloodPressure =0 ;
       HeartRate = 0 ;
       BloodSugarLevel = 0;
       Fever = 37 ;
   }
   //overloding
    public PatientData(String name,int ID,int phoneNumber,int age,String address,int counter,String Gender,int BP , int H ,int BS , int F ){
        super(name,ID,phoneNumber,age,address,Gender);
        BloodPressure = BP ;
        HeartRate = H ;
        BloodSugarLevel = BS ;
        Fever = F ;
        N.add(name);
    }

    public HospitalFees getF() {
        return f;
    }

    public void setF(HospitalFees f) {
        this.f = f;
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getBloodSugarLevel() {
        return BloodSugarLevel;
    }

    public void setBloodSugarLevel(int BloodSugarLevel) {
        this.BloodSugarLevel = BloodSugarLevel;
    }

    public double getFever() {
        return Fever;
    }

    public void setFever(double Fever) {
        this.Fever = Fever;
    }

   


    public patientRoom getR() {
        return r;
    }

    public void setR(patientRoom r) {
        this.r = r;
    }

  
     
    
    public  String toString() {
         return super.toString() + "BloodPressure = " + this.getBloodPressure() + ", HeartRate = " + this.getHeartRate() + ", BloodSugarLevel = " + this.getBloodSugarLevel() + ", Fever = " + this.getFever()+this.getR()+this.getF();
         
    }
  
  
}
