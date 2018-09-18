package com.example.jessi.rjt_ex_9_16_mvp_login.uisignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.jessi.rjt_ex_9_16_mvp_login.R;

public class View_SignUp extends AppCompatActivity implements View_Inter_SignUp{

    Presenter_SignUp iPresenter;
    TextView instructionsError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instructionsError = findViewById(R.id.tv_instructions_error);
        iPresenter = new Presenter_SignUp(this);
    }
    public void View_SignUp_clickHandler(View view)
    {
        iPresenter.iPresenter_OnButtonClicked(view);
        instructionsError.setText(iPresenter.error);
    }


    @Override
    public void vis_getUserName(View view) {

    }

    @Override
    public void vis_getPassword(View view) {

    }

    @Override
    public void vis_getPassword2(View view) {

    }

    @Override
    public void vis_getEmail(View view) {

    }

    @Override
    public void vis_setInstructions(View view) {

    }
}
