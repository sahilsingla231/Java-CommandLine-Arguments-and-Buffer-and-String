import java.util.Scanner;

class QString{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter here your string");

        String a;

        a = input.nextLine();
    

        for (int i = 0;i < a.length(); i++ ) {
            System.out.println(a.charAt(i));
        }
    }
}