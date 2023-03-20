package practices.practiceExtend.objectmethodcreation.objectmethodcreation;

public class School {
    String okulIsmi="Techpro koleji";

    boolean isActive=true;

    int yil=2022;

    public static void okulIsmiYazdir(String okulIsmi){
        System.out.println(okulIsmi);
    }

    public static void YilYazdir(int yil){
        System.out.println(yil);
    }

    public boolean isActive(boolean isActive) {
        return isActive;
    }
}