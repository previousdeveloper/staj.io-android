package oauth.Service;

import oauth.Request.AccessTokenRequest;
import oauth.Response.AccessTokenResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by gokhan on 6/28/15.
 */


public interface IOauthService {
    @POST("/oauth/token")
    void getAccessToken(@Body AccessTokenRequest accessTokenRequest,
                        Callback<AccessTokenResponse> responseCallback);

}
