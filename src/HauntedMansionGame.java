import java.util.Scanner;

public class HauntedMansionGame {
    private Room[][][] hauntedMansionMap; // 3D-array to represent the map
    private int playerMovementX = 0; // Players current X-position
    private int playerMovementY = 0; // Players current Y-position
    private int playerFloor = 0;

    Scanner sc = new Scanner(System.in);

    public HauntedMansionGame() {
        initializeMap();
    }

    private void initializeMap() {
        hauntedMansionMap = new Room[3][][]; // Initiate the map as a "jagged" 3D-array so the inside dimension can be of different sizes.

        hauntedMansionMap[0] = new Room[3][3]; // Represents the basement in a 3x3 grid.
        hauntedMansionMap[1] = new Room[3][3]; // Represents the main floor in a 3x3 grid.
        hauntedMansionMap[2] = new Room[2][1]; // Represents the top floor with 2 rows and 1 column.

        // Initializing the layout for my map fills each position with an actual Room object
        for (int floor = 0; floor < hauntedMansionMap.length; floor++) { // Initiate every floor and creates the total floors for the map
            for (int row = 0; row < hauntedMansionMap[floor].length; row++) { // For each given floor we give the fixed amount of rows for that floor, specified by the first loop
                for (int col = 0; col < hauntedMansionMap[floor][row].length; col++) { // For each row (specified by the 2nd loop) on a specific floor (specified by the 1st floor) we give columns (or rooms)
                    hauntedMansionMap[floor][row][col] = new Room(); // For each specific floor, row and column we create a new Room object and place it in the position in our 3D-array

                }
            }
        }
        // Locking the basement and top floor after creating all rooms
        hauntedMansionMap[0][0][0].lockRoom();
        hauntedMansionMap[2][0][0].lockRoom();
    }

    public void start(){
        System.out.println("You have teleported inside the book Haunted Mansion! ....");
    }

    public void setupRooms() {

    }
}
