package aiw.mobile.ta_pam.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import aiw.mobile.ta_pam.R;

public class ProfilePage extends AppCompatActivity {

    EditText et_name, et_email, et_username;
    ImageView iv_profile, iv_back;
    Button btn_save, btn_addprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        iv_profile = findViewById(R.id.iv_back_version);
        iv_back = findViewById(R.id.iv_back);
        et_name = findViewById(R.id.et_fullname);
        et_email = findViewById(R.id.et_email);
        et_username = findViewById(R.id.et_username);
        btn_save = findViewById(R.id.btn_contactUs);
        btn_addprofile = findViewById(R.id.btn_addprofile);

        iv_back.setOnClickListener(v -> {
            Intent intent = new Intent(ProfilePage.this, HomePage.class);
            startActivity(intent);
        });
    }
}