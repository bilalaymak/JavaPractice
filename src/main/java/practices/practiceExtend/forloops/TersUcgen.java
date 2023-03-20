package practices.practiceExtend.forloops;

public class TersUcgen {
    public static void main(String[] args) {

        /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */


        for(int i = 1; i<=6; i++){//satir controlu ==> 6 tane satir var, 6 defa calisacak
            for(int bosluk =1; bosluk<i; bosluk++ ){
                System.out.print(" ");
            }
            for(int j = i; j <= 6;j++){//sutun kontrolu
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        output
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
         */





    }
}








