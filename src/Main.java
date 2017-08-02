/**
 * Created by cmitchell on 8/2/17.
 */
//Creating a class named Main to print out Fibonacci (a sequence of numbers that adds the
// current number and previous number to produce a new number)
public class Main {

//creating a method for the main class

    public static void main(String a[]){
//creating the integer to count 20 instances of adding the previous number and the current number.

        int febCount= 20;

        int[] feb = new int[febCount];
        feb[0]=0;
        feb[1]=1;
        for (int i=2; i<febCount; i++){
            feb[i] = feb[i-1]+ feb[i-2];

        }
    for (int i=0; i<febCount; i++){
        System.out.print(feb[i]);
    }




    }
}
