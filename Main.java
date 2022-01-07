import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int number,total=0;
    Scanner inp=new Scanner(System.in);
    System.out.print("Number Enter : ");
    number=inp.nextInt();

    for (int i=1;i<number;i++){
        if (number % i==0) {
            total += i;
        }
    }
        if (total==number){
            System.out.print("Excellent number :"+number);
        }else{
            System.out.print("Not A Excellent Number :"+number);
        }
    }
}
