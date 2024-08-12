import java.util.Scanner;

public class advgrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > 33 && y > 33 && z > 33) {
            if ((((x + y + z) * 100) / 300) > 40) {
                System.out.println("Pass Overall");
            } else {
                System.out.println("Fail in overall");
            }
        } else {
            System.out.println("Fail in individual Subject");
        }
    sc.close();

    }
}
