package com.example.mobiocartapp.Activity;

import android.content.Context;
import android.content.SharedPreferences;

public class pref {
    public static pref p;
    private SharedPreferences sp;
    private  SharedPreferences.Editor spe;

    public pref(Context c)
    {
        p =this;
        sp = c.getSharedPreferences("mypref" , Context.MODE_PRIVATE);
        spe = sp.edit();
    }

    public void setkeyvalue(String key , String value)
    {
        spe.putString(key, value);
        spe.commit();
    }

    public String getkeyvalue(String key)
    {
        String getvalue = sp.getString(key , "");
        return  getvalue;
    }

    public void removepref(Context c , String removekey)
    {
        sp = c.getSharedPreferences("mypref" , Context.MODE_PRIVATE);
        spe = sp.edit();
        spe.remove(removekey);
        spe.commit();
    }

    public void clearpref()
    {
        spe.clear();
        spe.commit();
    }

}
