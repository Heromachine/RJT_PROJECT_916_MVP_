package com.example.jessi.rjt_ex_9_16_mvp_login.uilogin;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.*;
import com.example.jessi.rjt_ex_9_16_mvp_login.R;

import java.util.ArrayList;


public class Presenter_Login implements Presenter_IF_LogIn{
    private static final String TAG = "Presenter_Login";

    View_Inter_Login VIL;
    Model_LogIn_Validation MLV;

    private final ArrayList<String>  LOGINPATTERNS = new ArrayList<String>();
    private final ArrayList<String>  LOGINFEILDNAMES = new ArrayList<String>();


    public Presenter_Login(MainActivity mainActivity) {

        LOGINPATTERNS.add ("^[ A-Za-z0-9._-]{3,15}$");
        LOGINPATTERNS.add ("^[A-Za-z0-9.-_!]{6,18}$");
        LOGINFEILDNAMES.add("Username:");
        LOGINFEILDNAMES.add("Password:");

        this.MLV = new Model_LogIn_Validation(LOGINPATTERNS, LOGINFEILDNAMES);
        VIL = mainActivity;
    }

    @Override
    public void iPresenter_OnButtonClicked(View view) {
        Log.d(TAG, "iPresenter_OnButtonClicked: ");
        switch(view.getId())
        {
            case R.id.btn_login:
                this.MLV.addTextViewString(view.findViewById(R.id.etx_username).toString());
                this.MLV.addTextViewString(view.findViewById(R.id.etx_password).toString());

                Toast.makeText(view.getContext(), "LOGIN", Toast.LENGTH_SHORT).show();
            break;

            case R.id.btn_signup:
                Toast.makeText(view.getContext(), "SIGNUP", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
