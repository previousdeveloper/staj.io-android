package oauth.Client;

import oauth.OauthConstant.OauthConstant;
import oauth.Service.IOauthService;
import retrofit.RestAdapter;

/**
 * Created by gokhan on 6/28/15.
 */
public class OauthClient {

    private IOauthService _oauthService;


    public IOauthService getAccessToken() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(OauthConstant.AUTHENTICATION_SERVER_URL)
                .build();
        _oauthService = restAdapter.create(IOauthService.class);


        return _oauthService;
    }
}
