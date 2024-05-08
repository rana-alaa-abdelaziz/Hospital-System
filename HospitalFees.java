public class HospitalFees {private double OperatingRoomCost = 10000 ;
    private double ICU_RoomCOST = 3000 ;
    private double PatientRoomCost = 500 ;
    private double MedicalSuppliesCost;
    private double  MedicalTestsCost;  
    private double ClinicExaminationCost = 150 ;

    
    public  HospitalFees(){
     
    }
    
     public  HospitalFees(double op , double I ,double p , double MS , double MT , double C){
         
         OperatingRoomCost = op ;
     ICU_RoomCOST = I ;
     PatientRoomCost = p ;
      MedicalSuppliesCost = MS;
     MedicalTestsCost = MT;  
     ClinicExaminationCost = C ;
          
        
    }

    public double getOperatingRoomCost() {
        return OperatingRoomCost;
    }

    public void setOperatingRoomCost(double OperatingRoomCost) {
        this.OperatingRoomCost = OperatingRoomCost;
    }

    public double getICU_RoomCOST() {
        return ICU_RoomCOST;
    }

    public void setICU_RoomCOST(double ICU_RoomCOST) {
        this.ICU_RoomCOST = ICU_RoomCOST;
    }

    public double getPatientRoomCost() {
        return PatientRoomCost;
    }

    public void setPatientRoomCost(double PatientRoomCost) {
        this.PatientRoomCost = PatientRoomCost;
    }

    public double getMedicalSuppliesCost() {
        return MedicalSuppliesCost;
    }

    public void setMedicalSuppliesCost(double MedicalSuppliesCost) {
        this.MedicalSuppliesCost = MedicalSuppliesCost;
    }

    public double getMedicalTestsCost() {
        return MedicalTestsCost;
    }

    public void setMedicalTestsCost(double MedicalTestsCost) {
        this.MedicalTestsCost = MedicalTestsCost;
    }

    public double getClinicExaminationCost() {
        return ClinicExaminationCost;
    }

    public void setClinicExaminationCost(double ClinicExaminationCost) {
        this.ClinicExaminationCost = ClinicExaminationCost;
    }
    
     public double ToItal_ICU_Cost( double getICU_RoomCOST , double n){
         return getICU_RoomCOST * n ;
     }
     
     public double ToItal_PatientRoomCost(double getPatientRoomCost , double n){
         return getPatientRoomCost * n ;
     }
     
     public double TotalPayment(){
         
     System.out.println("HospitalFees{" + "OperatingRoomCost = " + OperatingRoomCost + ", ICU_RoomCOST = " + ICU_RoomCOST + ", PatientRoomCost = " + PatientRoomCost + ", MedicalSuppliesCost = "   + MedicalSuppliesCost + ", MedicalTestsCost = " + MedicalTestsCost + ", ClinicExaminationCost = " + ClinicExaminationCost + '}');
         System.out.println("TotalPayment = ");
         return     OperatingRoomCost +  ICU_RoomCOST +  PatientRoomCost + MedicalSuppliesCost + MedicalTestsCost + ClinicExaminationCost ;
     
     }

  
     
    
}
