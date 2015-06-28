package oauth.Request;

/**
 * Created by gokhan on 6/28/15.
 */
public class AccessTokenRequest {


    private String username;
    private String password;
    private String client_id;
    private String client_secret;
    private String grant_type;


    public AccessTokenRequest() {
        this.client_id = "client";
        this.client_secret ="client";
        this.grant_type = "password";
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }


    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }


    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
