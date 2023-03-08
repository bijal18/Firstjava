public class Calculator {
    static int a = 10;
    static int b = 5;
    static int answer;

    public static void main(String[] args) {
        addition();
        subtraction();
        multipiction();
        division();


    }

    static void addition() {
        answer = a + b;
        System.out.println(answer);
    }

    static void subtraction() {
        answer = a - b;
        System.out.println(answer);
    }

    static void multipiction() {
        answer = a * b;
        System.out.println(answer);
    }

    static void division() {
        answer = a / b;
        System.out.println(answer);
    }
}

