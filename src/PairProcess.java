import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
  int sum;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
       sum= num1+num1;
        if((sum)>200){
            System.out.println("The is Sum "+ sum+" *");
        }
        else if(sum <1000){
            System.out.println("The sum is "+ sum+ " ~");
        }
    }

}
