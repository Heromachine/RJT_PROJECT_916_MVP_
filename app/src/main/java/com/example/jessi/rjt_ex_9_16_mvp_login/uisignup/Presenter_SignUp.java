package com.example.jessi.rjt_ex_9_16_mvp_login.uisignup;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.jessi.rjt_ex_9_16_mvp_login.R;
import com.example.jessi.rjt_ex_9_16_mvp_login.data.validation.Model_Validation;

import java.util.ArrayList;

public class Presenter_SignUp implements Presenter_IF_SignUp{
    private static final String TAG = "Presenter_SignUp";

    View_Inter_SignUp VIS;
    Model_Validation MVS;

    String error;

    private final ArrayList<String> SIGNINPATTERNS = new ArrayList<String>();
    private final ArrayList<String> SIGNINFEILDNAMES = new ArrayList<String>();

    public Presenter_SignUp(View_SignUp mainActivity)
    {
        SIGNINPATTERNS.add ("^[ A-Za-z0-9._-]{3,15}$");
        SIGNINPATTERNS.add ("^[A-Za-z0-9.-_!]{6,18}$");
        SIGNINPATTERNS.add ("^[A-Za-z0-9.-_!]{6,18}$");
        SIGNINPATTERNS.add ("^[a-zA-Z0-9._-]{3,20}@[a-zA-Z0-9]{3,9}.com$");

        SIGNINFEILDNAMES.add("Username: ");
        SIGNINFEILDNAMES.add("Password: ");
        SIGNINFEILDNAMES.add("Password: ");
        SIGNINFEILDNAMES.add("Email: ");

        this.MVS = new Model_Validation(SIGNINPATTERNS, SIGNINFEILDNAMES);
        VIS = mainActivity;
    }


    @Override
    public void iPresenter_OnButtonClicked(View view) {
        Log.d(TAG, "iPresenter_OnButtonClicked: ");
        switch(view.getId())
        {
            case R.id.btn_login:

                this.MVS.addTextViewString(view.findViewById(R.id.etx_su_username).toString());
                this.MVS.addTextViewString(view.findViewById(R.id.etx_su_password).toString());
                this.MVS.addTextViewString(view.findViewById(R.id.etx_su_password2).toString());
                this.MVS.addTextViewString(view.findViewById(R.id.etx_su_email).toString());
                break;

            case R.id.btn_signup:
                error = "";
                Toast.makeText(view.getContext(), "Signing up...", Toast.LENGTH_SHORT).show();
                if (MVS.validation(error))
                {

                }
                else
                {

                }


                break;
        }
    }
}
