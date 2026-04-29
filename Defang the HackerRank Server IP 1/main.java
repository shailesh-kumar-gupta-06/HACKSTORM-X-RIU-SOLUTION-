import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.next();

        StringBuilder result = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}