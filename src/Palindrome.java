import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 số: ");
        int chuoi = sc.nextInt();

        if (isPalindrome(chuoi)) {
            System.out.println(chuoi + " is a Palindrome");
        } else {
            System.out.println(chuoi + " is not a Palindrome");
        }
    }
    public static boolean isPalindrome(int chuoi) {
        String chuoi1 = String.valueOf(chuoi);
        for (int i = 0; i < chuoi1.length(); i++) {
            if (chuoi1.charAt(i) != chuoi1.charAt(chuoi1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}