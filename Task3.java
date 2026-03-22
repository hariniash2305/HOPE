import java.util.*;

class Task3 {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(countOdds(low,high));

    }
}