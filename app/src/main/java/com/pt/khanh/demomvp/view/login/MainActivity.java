package com.pt.khanh.demomvp.view.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pt.khanh.demomvp.presenter.login.PresenterHandleLogIn;
import com.pt.khanh.demomvp.R;

public class MainActivity extends AppCompatActivity implements ViewHandleLogIn, View.OnClickListener {
    private Button mButtonOk;
    private EditText mEdittextUsername, mEditPassword;

    private PresenterHandleLogIn mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonOk = findViewById(R.id.button_ok);
        mEdittextUsername = findViewById(R.id.edittext_username);
        mEditPassword = findViewById(R.id.edittext_password);
        mPresenter = new PresenterHandleLogIn(this);
        mButtonOk.setOnClickListener(this);
    }

    @Override
    public void LogInSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LogInEror() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void CheckInput() {
        Toast.makeText(this, "Please fill full attribute!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        String username = mEdittextUsername.getText().toString();
        String password = mEditPassword.getText().toString();
        mPresenter.CheckLogin(username, password);
    }
}
