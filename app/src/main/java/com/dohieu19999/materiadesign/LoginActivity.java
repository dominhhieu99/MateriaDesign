package com.dohieu19999.materiadesign;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.FontRequest;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private TextView tvNameLogo;
    private TextView tvSloganName;
    private TextInputLayout username;
    private TextInputLayout password;
    private Button btn_login;
    private Button callSignUp;



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        tvNameLogo = (TextView) findViewById(R.id.tvNameLogo);
        tvSloganName = (TextView) findViewById(R.id.tvSlogan_name);
        username = (TextInputLayout) findViewById(R.id.username);
        password = (TextInputLayout) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.btn_login);
        callSignUp = (Button) findViewById(R.id.callSignUp);

        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SingUpActivity.class);

                Pair[] pairs = new Pair[7];
                Object first;
                Object second;
                pairs[0] = new Pair<View,String>(imgLogo, "logo_image");
                pairs[1] = new Pair<View,String>(tvNameLogo, "logo_text");
                pairs[2] = new Pair<View,String>(tvSloganName, "logo_decs");
                pairs[3] = new Pair<View,String>(username, "username");
                pairs[4] = new Pair<View,String>(password, "password");
                pairs[5] = new Pair<View,String>(btn_login, "button_tran");
                pairs[6] = new Pair<View,String>(callSignUp, "login_sigup");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                    startActivity(intent,activityOptions.toBundle());
                }            }
        });
    }
}