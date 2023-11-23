import java.util.*;

public class test {
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Square sq = new Square();
            System.out.println("\n Area: " + sq.Area());
            System.out.println("\n Perimeter: " + sq.Perimeter());
            resizableSquare resq = new resizableSquare();
            System.out.println("\n Enter new a: ");
            resq.setNew_a(sc.nextDouble());
            resq.resizable();
            System.out.println("\n New area: " + resq.Area());
            System.out.println("\n new perimeter: " + resq.Perimeter());
	}
}
