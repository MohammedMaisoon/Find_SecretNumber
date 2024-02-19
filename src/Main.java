import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write a Number From 1 to 100 to Find Secret Number.");
        System.out.println("Enter a Number: ");
                int num=2;
                Scanner scan=new Scanner(System.in);
                num=scan.nextInt();

                switch(num){
                    case 22:
                        System.out.println("You Are Near The Number");
                        break;
                    case 23:
                        System.out.println("Correct You Have Finded The Secret Number");
                        break;
                    default:
                        System.out.println("No The Secret Number is Incorrect");
                }


            }
        }






