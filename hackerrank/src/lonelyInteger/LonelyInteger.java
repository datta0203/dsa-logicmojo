package lonelyInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {

    static int lonelyInteger(List<Integer> a) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(sc.nextInt());

        System.out.println(lonelyInteger(list));
    }
}
