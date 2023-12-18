public class DirectionTest {

    public static void main(String[] args) {
        Direction currentDirection = Direction.NORTH;

        System.out.println("Current direction: " + currentDirection.getName());
        System.out.println("Turn left: " + currentDirection.left().getName());
        System.out.println("Turn right: " + currentDirection.right().getName());

        // You can test with other directions as well
        currentDirection = Direction.WEST;
        System.out.println("\nCurrent direction: " + currentDirection.getName());
        System.out.println("Turn left: " + currentDirection.left().getName());
        System.out.println("Turn right: " + currentDirection.right().getName());
    }
}
