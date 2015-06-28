package oauth.Client;

import oauth.Constants.ApiConstants;
import oauth.Service.ICurrentUser;
import retrofit.RestAdapter;

/**
 * Created by gokhan on 6/28/15.
 */
public class CurrentUserClient {

    private ICurrentUser _currentUser;


    public ICurrentUser getCurrentUser() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ApiConstants.BASE_URL)
                .setRequestInterceptor(new RequestInterceptorClient().requestInterceptor)
                .build();
        _currentUser = restAdapter.create(ICurrentUser.class);


        return _currentUser;
    }
}
