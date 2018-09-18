package com.example.jessi.rjt_ex_9_16_mvp_login.data.validation;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public class Model_LocalData
{
    public void createSP(Context context, String viewPreference)
    {
        SharedPreferences SP = context.getSharedPreferences(viewPreference, Context.MODE_PRIVATE);
        SP = context.getSharedPreferences(viewPreference, Context.MODE_PRIVATE);

    }
    public void addSP(Context context, String table, String field, String content)
    {
        SharedPreferences SP = context.getSharedPreferences(table, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = SP.edit();
        editor.putString(field, content);
        editor.apply();
    }

    public String getSP(Context context, String table, String field)
    {
        SharedPreferences SP = context.getSharedPreferences(table, Context.MODE_PRIVATE);
        String my = SP.getString(field, "");
        return my;
    }

    public boolean isSP(Context context, String table,  String item)
    {
        SharedPreferences SP = context.getSharedPreferences(table, Context.MODE_PRIVATE);
        return SP.contains(item);
    }
}



