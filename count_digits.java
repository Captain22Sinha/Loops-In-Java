import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n= sc.nextInt();

        int count = 0;
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.print(count);
    }
}
