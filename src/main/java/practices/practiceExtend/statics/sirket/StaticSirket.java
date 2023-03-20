package practices.practiceExtend.statics.sirket;

public class StaticSirket {


    //basit bir sirket butcesi kodu yaziniz
    public static void main(String[] args) {

        Sirket dep1 = new Sirket();
        dep1.kasadanButceyeParaAl(500);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        dep1.kasadanParaHarca(2500);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.kasa = " + dep1.kasa);

        dep1.departmanHarcamasi(1000);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        Sirket dep2 = new Sirket();
        dep2.kasadanButceyeParaAl(1000);
        dep2.kasadanButceyeParaAl(100);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);//?

    }



}
