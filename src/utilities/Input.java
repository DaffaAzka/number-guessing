package utilities;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    public static Integer inputData(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + " : ");
        Integer temp = 0;
            try {
                temp = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("DATA INVALID!");
            }
            return temp;
        }
    }
