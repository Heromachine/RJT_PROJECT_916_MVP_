import android.app.Application;

public class SingleTon extends Application {

    private static SingleTon INSTANCE = null;

    public static SingleTon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTon();
        }
        return(INSTANCE);
    }





}
