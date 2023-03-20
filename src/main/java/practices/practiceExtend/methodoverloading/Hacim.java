package practices.practiceExtend.methodoverloading;

public class Hacim {
    public static void main(String[] args) {

             //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir code yaziniz.
             //(Method overloading kullanınız)

        HacimMethods obj = new HacimMethods();
        int kupunHacmi = obj.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);

        int karePrizmaninHacmi = obj.hacimHesapla(5,4);
        System.out.println("karePrizmaninHacmi = " + karePrizmaninHacmi);

        int dikdortgenPrizmaninHacmi = obj.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaninHacmi = " + dikdortgenPrizmaninHacmi);

        int kupunHacmi2 = obj.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);



    }







}









