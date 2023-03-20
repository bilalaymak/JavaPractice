package practices.practiceExtend.objectmethodcreation.objectmethodcreation;

public class Runner {
    public static void main(String[] args) {

        //object ile method arasindaki iliski static olup olmamasina gore belli oluyor

        School obj=new School();
        System.out.println(obj.okulIsmi);
        System.out.println(obj.yil);
        System.out.println(obj.isActive);


        School.okulIsmiYazdir("Yildiz Koleji");
        School.YilYazdir(2023);

        System.out.println(obj.isActive(false));

        Calculator.cikarma(7,2);
        Calculator.cikarma(9,14);


        MethodCreation01.hosgeldiniz();
        MethodCreation01.IsimVeSoyIsim("ömer","faruk");
        MethodCreation01.kapanmaMesaji();
        MethodCreation01.StringYazdir();

        Calculator.bolme(90,45);
        System.out.println("***********************************************************");
        MethodCreation02.kutuhaneIsmi();
        System.out.println("***********************************************************");
        Calculator.carpma(5,7);
        Calculator.toplama(8,9);
        System.out.println("***********************************************************");
        MethodCreation02.javaYazma(10);

    }


    }

