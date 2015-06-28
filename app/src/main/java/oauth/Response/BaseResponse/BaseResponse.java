package oauth.Response.BaseResponse;

/**
 * Created by gokhan on 6/28/15.
 */
public abstract class BaseResponse {


    private String error = null;
    private String error_description = null;


    public String getError() {
        return error;
    }


    public String getError_description() {


        return error_description;
    }
}