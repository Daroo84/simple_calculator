import java.util.Scanner;

import static com.sun.activation.registries.LogSupport.log;

public class Main {
    public static void main(String[] args) {
        int a, b, answer;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\"Please enter a maths equation using +, -, * or /:\" ex.  format  10 + 10");


        a = scanner.nextInt();
        operator = scanner.next();
        b = scanner.nextInt();
        if(operator.contains("+")){
            answer = a + b;
            System.out.println(""+answer);
        }
        if(operator.contains("-")){
            answer = a - b;
            System.out.println(""+answer);
        }
        if(operator.contains("*")){
            answer = a * b;
            System.out.println(""+answer);
        }
        if(operator.contains("/")){
            answer = a / b;
            System.out.println(""+answer);
        }
    }
}
