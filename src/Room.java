public class Room {
    private String roomDescription;
    private boolean isRoomLocked;

    public Room(){
        this.roomDescription = "A normal room";
        this.isRoomLocked = false;
    }

    public Room(String roomDescription){
        this.roomDescription = roomDescription;
        this.isRoomLocked = false;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public boolean isRoomLocked() {
        return isRoomLocked;
    }

    public void lockRoom(){
        isRoomLocked = true;
    }

    public void unlockRoom(){
        isRoomLocked = false;
    }
}
