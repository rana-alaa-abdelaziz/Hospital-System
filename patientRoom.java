*/
import java.util.ArrayList;
public class patientRoom extends Rooms{
  
  
 private   String typeOfRoom;
 private int nomberofdays ;
 
static ArrayList<Integer> R=new ArrayList<>();


 public patientRoom(int room,int floor){
     super(room,floor);
     R.add(room);
    
 }

    public patientRoom(String typeOfRoom, int nomberofdays) {
        this.typeOfRoom = typeOfRoom;
        this.nomberofdays = nomberofdays;
    }

    public patientRoom(String typeOfRoom, int  nomberOfRooms, int nomberofdays,int room,int floor) {
        super(room,floor, nomberOfRooms);
        this.typeOfRoom = typeOfRoom;
        this.nomberofdays = nomberofdays;
        nomberOfRooms++;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNomberofdays() {
        return nomberofdays;
    }

      @Override
  public String toString(){
      return " , rooms = "+this.getRooms()+" , floor = "+ this.getFloor();
}

   
}
