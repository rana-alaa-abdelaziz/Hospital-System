public class Nurses extends Staff{
  private double hourWorked;
  private double hourlyRates;

    public Nurses() {
    }

   
    
    public Nurses(double hourWorked, double hourlyRates, String certification, String languages, String gualification, String name, int ID, int phoneNumber, int age, String address,  String Gender) {
        super( name, ID, phoneNumber, age, address,  Gender, certification, languages, gualification);
        this.hourWorked = hourWorked;
        this.hourlyRates = hourlyRates;
    }

    public double getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(double hourWorked) {
        this.hourWorked = hourWorked;
    }

    public double getHourlyRates() {
        return hourlyRates;
    }

    public void setHourlyRates(double hourlyRates) {
        this.hourlyRates = hourlyRates;
    }
  
  @Override
  public double Salary (double n,double m)  {
      
      return n*m;
      
  }

    @Override
    public String toString() {
        return "Nurses{" +super.toString()+ "hourWorked=" + hourWorked + ", hourlyRates=" + hourlyRates + '}';
    }
  
  
}
