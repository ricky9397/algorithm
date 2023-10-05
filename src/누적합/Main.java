package 누적합;

import java.util.Scanner;

public class Main {

    // 1 3 => 1 + 2 + 3 = 6

    // 탈출조건
    public static int calAccSum(int start, int end) {

        if(start == end) return start;

        return start + calAccSum(start + 1, end);
    }

    // 1, 3 => return 1 + calAccSum(2, 3);
    //                      2 + calAccSum(3, 3);
    //                              3
    // 결과 6
    public static void main(String[] args) {

        int start;
        int end;
        Scanner scanner = new Scanner(System.in);

        start = scanner.nextInt();
        end = scanner.nextInt();

        int ans = 0;

        ans = calAccSum(start, end);

        System.out.println("acc sum = " + ans);

    }
}