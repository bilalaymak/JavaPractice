package projects.oopwithlayeredapp.core.logging;

public class DatabaseLogger implements Logger {


    @Override
    public void log(String data) {
        System.out.println("veritabanina loglandi : " + data);
    }
}
