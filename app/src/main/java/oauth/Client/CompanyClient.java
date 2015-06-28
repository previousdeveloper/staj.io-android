package oauth.Client;

import oauth.Constants.ApiConstants;
import oauth.Service.ICompanyService;
import retrofit.RestAdapter;

/**
 * Created by gokhan on 4/8/15.
 */
public class CompanyClient {

    private ICompanyService _companyService;


    public ICompanyService getAllCompanyListAdapter() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ApiConstants.BASE_URL)
                .setRequestInterceptor(new RequestInterceptorClient().requestInterceptor)
                .build();
        _companyService = restAdapter.create(ICompanyService.class);


        return _companyService;
    }
}
