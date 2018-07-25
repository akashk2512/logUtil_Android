package com.akash.logutils;

import android.util.Log;

public class DoDebug {

    public static void D(String logKey,String message){
        Log.d(logKey,message);
    }
    public static void E(String logKey,String message){
        Log.e(logKey,message);
    }
}
