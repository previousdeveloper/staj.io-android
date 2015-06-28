package oauth.Client;

import android.preference.PreferenceManager;

import core.App;
import retrofit.RequestInterceptor;

/**
 * Created by gokhan on 6/28/15.
 */
public class RequestInterceptorClient {

    String data = PreferenceManager
            .getDefaultSharedPreferences(App.getAppContext())
            .getString("accessToken", "");

    RequestInterceptor requestInterceptor = new RequestInterceptor() {
        @Override
        public void intercept(RequestInterceptor.RequestFacade request) {

            String token = "Bearer" + " " + data;

            request.addHeader("Authorization", token);
            request.addHeader("User-Agent", "Android");
        }


    };
}
