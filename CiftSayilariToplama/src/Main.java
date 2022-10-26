import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number,total=0;
        do{
            System.out.print("Bir sayı giriniz : ");
            number=scan.nextInt();
            if(number%4==0){
                total+=number;
            }
        }while (number%2==0);
        System.out.println(" 4'un katı olan sayıların toplamı :"+total);
    }
}