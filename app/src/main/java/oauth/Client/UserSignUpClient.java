package oauth.Client;

import oauth.Constants.ApiConstants;
import oauth.Service.IUserSignUpService;
import retrofit.RestAdapter;

/**
 * Created by gokhan on 4/8/15.
 */
public class UserSignUpClient {

    private IUserSignUpService _signUpService;


    public IUserSignUpService signUp() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ApiConstants.BASE_URL)
                .build();
        _signUpService = restAdapter.create(IUserSignUpService.class);


        return _signUpService;
    }
}
