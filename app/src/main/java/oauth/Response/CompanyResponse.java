package oauth.Response;

import java.util.List;

/**
 * Created by gokhan on 4/8/15.
 */
public class CompanyResponse {



    private String _id;
    private String name;
    private String information;
    private String city;
    private String sector;
    private String email;
    private String address;
    private String websiteUrl;
    private String phone;
    private String imgUrl;
    private String created;

    public String getInformation() {
        return information;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getSector() {
        return sector;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getPhone() {
        return phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getCreated() {
        return created;
    }


}
