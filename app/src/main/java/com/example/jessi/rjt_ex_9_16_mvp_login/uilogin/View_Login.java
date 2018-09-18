package com.example.jessi.rjt_ex_9_16_mvp_login.uilogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jessi.rjt_ex_9_16_mvp_login.R;

public class View_Login extends AppCompatActivity implements View_Inter_Login{

    Presenter_IF_LogIn iPresenter;
    EditText userName;
    EditText passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_login);
        iPresenter = new Presenter_Login(this);
        userName = findViewById(R.id.etx_username);
        passWord = findViewById(R.id.etx_password);

        userName.setText(iPresenter.returnUsername());
        passWord.setText(iPresenter.returnPassword());

    }

    public void View_LogIn_clickHandler(View view)
    {
        iPresenter.iPresenter_OnButtonClicked(view, this, userName.getText().toString(), passWord.getText().toString());
    }



    @Override
    public void vil_getUsername(View view) {


    }

    @Override
    public void vil_setUsername(View view) {


    }
}
