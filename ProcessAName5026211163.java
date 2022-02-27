import java.util.Scanner;

public class ProcessAName5026211163 {
    public static void main(String[] args) {
        Scanner Sefry = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = Sefry.nextLine();

        int spcIndex = name.indexOf(" ");
        String FirstName = name.substring(0, spcIndex);
        String LastName = name.substring((spcIndex+1));

        String FullName = "Your name is: " + LastName + ", " + FirstName.charAt(0);
        System.out.println(FullName);
    }

}
