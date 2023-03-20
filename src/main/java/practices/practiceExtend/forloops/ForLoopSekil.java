package practices.practiceExtend.forloops;

public class ForLoopSekil {
    public static void main(String[] args) {

        /*
		Şekli Yazdırınız:
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        */

        char ch = 'A';
        for(int i =0; i<6; i++){
            for(int k = 0; k<=i; k++ ){
                System.out.print((char)(ch + i) + " ");
            }
            System.out.println();
        }







    }
}












