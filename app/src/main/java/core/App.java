package core;

import android.app.Application;
import android.content.Context;

/**
 * Created by gokhan on 6/28/15.
 */
public class App extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return App.context;
    }
}
