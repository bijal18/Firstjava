public class MyDetails {
    static int age = 35;
    static String name = "Bijal";
    static String address = "123abc";
    static int roll = 40;
    static int phone = 1234567890;
    static double grade = 59;
    static boolean eligibilty;


    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(roll);
        System.out.println(phone);
        System.out.println(grade);

        if (grade>60){
            eligibilty = true;
        }
        System.out.println(eligibilty);
    }


}
