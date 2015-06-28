package oauth.Service;

import oauth.Request.UserSignUpRequest;
import oauth.Response.UserSignUpResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;


public interface IUserSignUpService {

    @POST("/signUp")
    void signUp(@Body UserSignUpRequest user, Callback<UserSignUpResponse> responseCallback);

}
