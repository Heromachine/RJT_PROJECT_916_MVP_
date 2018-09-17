package com.example.jessi.rjt_ex_9_16_mvp_login.uilogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jessi.rjt_ex_9_16_mvp_login.R;

public class MainActivity extends AppCompatActivity implements View_Inter_Login{

    Presenter_IF_LogIn iPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_login);
        iPresenter = new Presenter_Login(this);
    }

    public void MainActiviy_clickHandler(View view)
    {
        iPresenter.iPresenter_OnButtonClicked(view);
    }



    @Override
    public void vil_getUsername(View view) {

    }

    @Override
    public void vil_setUsername(View view) {

    }
}
