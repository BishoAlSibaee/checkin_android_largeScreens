package com.example.mobilecheckdevice;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.tuya.smart.android.user.bean.User;
import com.tuya.smart.home.sdk.TuyaHomeSdk;
import com.tuya.smart.home.sdk.bean.HomeBean;
import com.tuya.smart.home.sdk.bean.scene.SceneBean;
import com.tuya.smart.sdk.api.INeedLoginListener;

import java.util.List;

public class MyApp  extends Application {

    public static Application app ;
    public static User TuyaUser ;
    public static List<HomeBean> homeBeans ;
    public static HomeBean HOME;
    public static PROJECT THE_PROJECT ;
    public static String Device_Id;
    public static String Device_Name;
    public static PROJECT_VARIABLES ProjectVariables ;
    public static String my_token;
    public static CheckInActions checkInActions ;
    public static CheckoutActions checkOutActions ;
    public static ClientBackActions clientBackActions ;
    public static List<ROOM> ROOMS ;
    public static List<SceneBean> SCENES ;
    static String cloudClientId = "d9hyvtdshnm3uvaun59d" , cloudSecret = "825f9def941f456099798ccdc19112e9";
    public static String ErrorsUrl = "https://ratco-solutions.com/Checkin/Test/php/insertError.php";
    public static String applicationSide = "CheckApp";

    @Override
    public void onCreate() {
        super.onCreate();
        app = this ;
        setTuyaApplication();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Intent i = new Intent(this,Login.class);
        startActivity(i);
        Log.d("AppTerminated","Terminated");
    }

    void setTuyaApplication() {
        TuyaHomeSdk.setDebugMode(true);
        try {
            TuyaHomeSdk.init(app);
            TuyaHomeSdk.setOnNeedLoginListener(new INeedLoginListener() {
                @Override
                public void onNeedLogin(Context context) {
                }
            });
        }
        catch (Exception e ) {
            Log.d("TuyaError" , e.getMessage());
        }


    }

    public static SceneBean searchSceneInList(List<SceneBean> scenes , String sceneName) {
        for (int i=0;i<scenes.size();i++){
            if (scenes.get(i).getName().equals(sceneName)) {
                return scenes.get(i) ;
            }
        }
        return null ;
    }
}
