package Tasks_forLoopyeni1;

import java.util.Scanner;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("satir gir : ");
        int st = input.nextInt();
        for (int i = 1; i <=st ; i++) {
            for (int j = st; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==1||j==i|| i==st){
                    System.out.print("* ");
                }else {
                    System.out.print("! ");
                }

            }
            System.out.println(" ");
        }

    }

}
































