import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter an integer or a decimal number");
            String inputString = scanner.nextLine();
            System.out.println("Enter an integer power");
            String powerString = scanner.nextLine();
            float input = Float.parseFloat(inputString);
            int power = Integer.parseInt(powerString);
            System.out.println(inputString+"^"+powerString+" = "+processPower(input, power));
        }
    }

    private static float processPower(float input, int power) {
        if(power == 0){return 1;} //Zero power case
		if(power == 1){return input;} //One power case
		float out = input;
        if(power > 1){ //Positive power case
            for (int i = 0; i < power-1; i++) {
                out *= input;
            }
            return out;
        }else{ //Negative power case
            for (int i = 0; i > power+1; i--) {
                out *= input;
            }
            out = 1/out;
            return out;
        }
    }
}