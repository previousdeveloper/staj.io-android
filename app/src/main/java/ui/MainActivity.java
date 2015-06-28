package ui;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import io.staj.stajio.R;
import oauth.Client.CurrentUserClient;
import oauth.Client.OauthClient;
import oauth.Request.AccessTokenRequest;
import oauth.Response.AccessTokenResponse;
import oauth.Response.CurrentUserResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    private Button getAccessTokenBtn;
    private EditText txtUsername;
    private EditText txtPassword;
    private AccessTokenRequest accessTokenRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listView = (ListView) findViewById(R.id.listViewAdapter);

        //getAllCompany();

        getAccessTokenBtn = (Button) findViewById(R.id.btn_getAccessToken);
        txtUsername = (EditText) findViewById(R.id.txt_username);
        txtPassword = (EditText) findViewById(R.id.txt_password);

        getAccessTokenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAccessToken();
                getCurrentUser();


            }
        });

    }


//    public void userSignUp() {
//        UserSignUpRequest userSignUpRequest = new UserSignUpRequest();
//        userSignUpRequest.setUsername("android12Data122");
//        userSignUpRequest.setPassword("androidD12at121a2");
//        userSignUpRequest.setName("androidD12at121a2");
//        userSignUpRequest.setEmail("androidD12at121a2");
//        UserClient signUpClient = new UserClient();
//        signUpClient.signUp().signUp(userSignUpRequest, new Callback<UserSignUpResponse>() {
//            @Override
//            public void success(UserSignUpResponse userSignUpResponse, Response response) {
//
//                Toast.makeText(getApplication(), userSignUpResponse.getData().toString(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//
//            }
//        });
//    }

//    public void getAllCompany() {
//        CompanyClient companyClient = new CompanyClient();
//        companyClient.getAllCompanyListAdapter().listReport(new Callback<getAllCompany>() {
//            @Override
//            public void success(getAllCompany companyBaseResponse, Response response) {
//
//                final List<CompanyResponse> adapterListesi = new ArrayList();
//                adapterListesi.addAll(companyBaseResponse.getCompanyResponseList());
//                CompanyAdapter companyAdapter = new CompanyAdapter(MainActivity.this, adapterListesi);
//                listView.setAdapter(companyAdapter);
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        Toast.makeText(getApplication(), adapterListesi.get(position).get_id(), Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//
//            }
//
//
//            @Override
//            public void failure(RetrofitError error) {
//                Toast.makeText(getApplication(),
//                        error.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
//    }


    private void getAccessToken() {
        accessTokenRequest = new AccessTokenRequest();
        accessTokenRequest.setUsername(txtUsername.getText().toString());
        accessTokenRequest.setPassword(txtPassword.getText().toString());

        OauthClient service = new OauthClient();

        service.getAccessToken().getAccessToken(accessTokenRequest, new Callback<AccessTokenResponse>() {
            @Override
            public void success(AccessTokenResponse accessTokenResponse, Response response) {


                if (accessTokenResponse.getAccess_token() == null) {
                    Toast.makeText(getApplicationContext(), accessTokenResponse.getError(), Toast.LENGTH_LONG).show();

                } else {
//                    Toast.makeText(getApplicationContext(),
//                            accessTokenResponse.getAccess_token(),
//                            Toast.LENGTH_LONG).show();
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                            .edit().putString("accessToken", accessTokenResponse
                            .getAccess_token()).commit();

                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();


            }
        });
    }

    private void getCurrentUser() {
        CurrentUserClient currentUserClient = new CurrentUserClient();
        currentUserClient.getCurrentUser().currentUser(new Callback<CurrentUserResponse>() {
            @Override
            public void success(CurrentUserResponse currentUserReponse, Response response) {

                String name = currentUserReponse.getUsername();
                String username = currentUserReponse.getUsername();
                String email = currentUserReponse.getEmail();

                Toast.makeText(MainActivity.this, name + username + email, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
