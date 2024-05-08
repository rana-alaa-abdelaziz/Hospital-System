*/
    public static void main(String[] args) {
        
        
        patientRoom r1=new patientRoom(4,4);
        PatientData p1=new PatientData("mark",12,010223,19,"22 fleming",1,"male",160,45,56,38);
        System.out.println(p1.toString());
        p1.toString();
        p1.setR(r1);
        HospitalFees h1=new HospitalFees(0,0,500,350,1500,150);
        System.out.println(h1.TotalPayment());
        MedicalHistory m1=new MedicalHistory("mark",false,"o-","no symptoms","high blood pressure","no heart disease",false,false,false);
        System.out.println(m1.toString());
        System.out.println();
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Is this room taken:"+r1.R.contains(45));
       
        patientRoom r2=new patientRoom(67,4);
        PatientData p2=new PatientData("magy",12,010223,19,"sedi beshr",1,"female",160,45,56,38);
        
        System.out.println(p2.toString());
        p2.toString();
        p2.setR(r2);
        HospitalFees h2=new HospitalFees(0,0,0,700,1500,150);
        System.out.println(h2.TotalPayment());
        MedicalHistory m2=new MedicalHistory("magy",true,"AB","fever and cheviring","regular blood pressure","no heart disease",true,false,true);
        System.out.println(m2.toString());
        System.out.println();
        
        System.out.println("------------------------------------------------");
        
        
       
        System.out.println(patientRoom.R);   
        System.out.println(PatientData.N);
        System.out.println("list of patients that entered the hospital");
        System.out.println(Data(PatientData.N,patientRoom.R));
      
         System.out.println();
        
        System.out.println("------------------------------------------------");
        
 
    Doctors d1=new Doctors("Dr.Soha",123,01054341654,29,"22 smoha","female","bacaloria of dentistry","english , french","soft and hard skills","dentestry",3000);
       System.out.println(d1.toString());
        System.out.println("total salary is :"+d1.Salary(150,225.45));
        
         System.out.println();
        
        System.out.println("------------------------------------------------");
        
        
    Nurses N1=new Nurses(12, 150, "faculty of Nursing", "English", "5 years of experience", "samia", 5648, 035133577, 27,"gleem ", "female");
       System.out.println(N1.toString());
        System.out.println("total salary is :"+N1.Salary(8,150));
    
    
    }
    
  
    
    
   public static ArrayList Data(ArrayList R,ArrayList N){
          
      int length = R.size();
if (length != N.size()) { // Too many names, or too many numbers
    // Fail
}
        ArrayList Data=new ArrayList();
     // Loop through every name/ room number combo  
for (int i = 0; i < length; i++)
{ 
    // Concat the two, and add it
    Data.add(R.get(i)+ "  " + N.get(i)); 
   
}
     return Data;   

   }
}
