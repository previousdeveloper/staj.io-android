package oauth.Service;

import oauth.Response.CurrentUserResponse;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by gokhan on 6/28/15.
 */
public interface ICurrentUser {


    @GET("/user")
    public void currentUser(Callback<CurrentUserResponse> companyBaseResponseCallback);
}
