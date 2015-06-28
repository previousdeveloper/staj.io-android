package oauth.Response;


public class CurrentUserResponse {
    private String username;
    private String name;


   private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "CurrentUserReponse{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
