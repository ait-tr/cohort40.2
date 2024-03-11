package cons_11.example01;

public class Main {
    public static void main(String[] args) {
        Position p = new Position(4, 5);
        System.out.println(p);
        Directions d = Directions.UP;
        
        p.move(6, Directions.valueOf("LEFT"));
        System.out.println(p);
    }
}
