ublic class MedicalHistory {
    String name ;
      private boolean Diabetes;
    private String BloodType;
    private String Symptoms;
    private String BloodPressureDisease;
    private String HeartDisease;
    private boolean Virus_C;
    private boolean RenalFailure;
    private boolean RespiratoryDiseases;
    
    public MedicalHistory(){
    name="null";
    Diabetes = false;
    BloodType = "null";
    Symptoms = "null";
    BloodPressureDisease  = "null";
    HeartDisease = "null";
    Virus_C = false;
    RenalFailure = false;
    RespiratoryDiseases = false;
    }
    
     public MedicalHistory(String name ,boolean D,String BT ,String S  ,String BPD ,String HD , boolean VC, boolean RF ,boolean RD ){
    Diabetes = D ;
    BloodType = BT;
    Symptoms = S;
    this.name=name;
    BloodPressureDisease  = BPD;
    HeartDisease = HD;
    Virus_C = VC;
    RenalFailure = RF;
    RespiratoryDiseases = RD;
    }

    @Override
    public String toString() {
        return "name = "+ name+" MedicalHistory{" + "Diabetes=" + Diabetes + ", BloodType=" + BloodType + ", Symptoms=" + Symptoms + ", BloodPressureDisease=" + BloodPressureDisease + ", HeartDisease=" + HeartDisease + ", Virus_C=" + Virus_C + ", RenalFailure=" + RenalFailure + ", RespiratoryDiseases=" + RespiratoryDiseases + '}';
    }
     
}
