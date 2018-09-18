package com.example.jessi.rjt_ex_9_16_mvp_login.uilogin;

import android.content.Context;
import android.view.View;

public interface Presenter_IF_LogIn {

    public  void iPresenter_OnButtonClicked(View view, Context context, String username, String password);

    public String returnUsername();
    public String returnPassword();
    public void setUserName(String username);
    public void setPassWord(String password);

    public void iPresenter_giveViewEditTextString(View view);

}
