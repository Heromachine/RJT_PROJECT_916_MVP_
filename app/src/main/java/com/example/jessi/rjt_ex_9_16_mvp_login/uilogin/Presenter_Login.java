package com.example.jessi.rjt_ex_9_16_mvp_login.uilogin;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.example.jessi.rjt_ex_9_16_mvp_login.R;
import com.example.jessi.rjt_ex_9_16_mvp_login.data.localdata.Model_LocalData;
import com.example.jessi.rjt_ex_9_16_mvp_login.data.localdata.Model_Validation;
import com.example.jessi.rjt_ex_9_16_mvp_login.uisignup.View_SignUp;

import java.util.ArrayList;


public class Presenter_Login implements Presenter_IF_LogIn{
    private static final String TAG = "Presenter_Login";

    View_Login VL;
    IViewLogin VIL;
    Model_Validation MVL;
    String error;
    Model_LocalData SP;
    Switch swchLogin;

    String sUsername;
    String sPassword;

    Context cntx;

    private final ArrayList<String>  LOGINPATTERNS = new ArrayList<String>();
    private final ArrayList<String>  LOGINFEILDNAMES = new ArrayList<String>();




    public Presenter_Login(View_Login mainActivity) {
        swchLogin = mainActivity.findViewById(R.id.swch_savecred);
        VIL = mainActivity;
        VL = mainActivity;

        SP = new Model_LocalData();
        SP.createSP(mainActivity, "LogInSP");

        if (SP.isSP(mainActivity,"LogInSP", "username") && SP.isSP(mainActivity,"LogInSP", "password"))
        {
            sUsername = SP.getSP(mainActivity, "LogInSP", "username");
            sPassword = SP.getSP(mainActivity,"LogInSP", "password");
        }


        LOGINPATTERNS.add ("^[ A-Za-z0-9._-]{3,15}$");
        LOGINPATTERNS.add ("^[A-Za-z0-9.-_!]{6,18}$");
        LOGINFEILDNAMES.add("Username:");
        LOGINFEILDNAMES.add("Password:");

        this.MVL = new Model_Validation(LOGINPATTERNS, LOGINFEILDNAMES);

    }

    @Override
    public void iPresenter_OnButtonClicked(View view, Context context, String username, String password) {
        Log.d(TAG, "iPresenter_OnButtonClicked: ");
        switch(view.getId())
        {
            case R.id.btn_login:
                if (swchLogin.isChecked())
                {
                    if (SP.isSP(cntx   , "LogInSP", "username") && SP.isSP(context, "LogInSP","password")) {
                        SP.addSP(context,"LogInSP","username", username);
                        SP.addSP(context,"LogInSP","password", password);
                    }
                    else
                    {
                        sUsername = SP.getSP(context, "LogInSP", "username");
                        sPassword = SP.getSP(context,"LogInSP", "password");
                        SP.addSP(context,"LogInSP","username", username);
                        SP.addSP(context,"LogInSP","password", password);
                    }
                }

                this.MVL.addTextViewString(username);
                this.MVL.addTextViewString(password);
                break;
            case R.id.btn_signup:
                Intent i = new Intent(context, View_SignUp.class);
                context.startActivity(i);

                break;

        }
    }


    @Override
    public String returnUsername() {
        return sUsername;
    }

    @Override
    public String returnPassword() {
        return sPassword;
    }

    @Override
    public void setUserName(String username) {
        sUsername = username;
    }

    @Override
    public void setPassWord(String password) {
        sPassword = password;
    }


    @Override
    public void iPresenter_giveViewEditTextString(View view) {

    }




}
