public class TestClass5026211163 {

    public static void main(String[] args) {

        ComputeMethods5026211163 cm = new ComputeMethods5026211163();

        double celcius = cm.fToC(100);
        System.out.printf("Temp in celcius is %f\n", celcius);

        double hypotenuse = cm.hypotenuse(6,8);
        System.out.println("Hypotenuse is " + hypotenuse);

        int rollDice = cm.roll();
        System.out.println("The sum of the dice values is " + rollDice);
    }
}
