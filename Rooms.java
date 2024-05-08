public class Rooms {
 
  private  int rooms;
  private  int floor;
  private  int nomberOfRooms=0;
    public Rooms(){
    int rooms=0;
    int floor=0;
    
    
    }
     public Rooms(int room,int floor){
        this.floor=floor;
        this.rooms=room;}
    public Rooms(int room,int floor,int nomberOfRooms){
        this.floor=floor;
        this.rooms=room;
        this.nomberOfRooms=nomberOfRooms;
        nomberOfRooms++;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNomberOfRooms() {
        return nomberOfRooms;
    }

    public void setNomberOfRooms(int nomberOfRooms) {
        this.nomberOfRooms = nomberOfRooms;
    }
    
}
