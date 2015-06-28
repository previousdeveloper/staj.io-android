package oauth.Service;


import oauth.Response.GetAllCompanyResponse;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by gokhan on 4/8/15.
 */
public interface ICompanyService {

    @GET("/company")
    void listReport(Callback<GetAllCompanyResponse> companyBaseResponseCallback);
}
