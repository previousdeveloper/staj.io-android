package oauth.Response;

/**
 * Created by gokhan on 4/8/15.
 */
public class UserSignUpResponse {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String type;
    public String data;
}
