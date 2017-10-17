package com.nith.appteam.hillffair17.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.nith.appteam.hillffair17.Activities.BattleDayActivity;
import com.nith.appteam.hillffair17.Activities.ClubActivity;
import com.nith.appteam.hillffair17.Activities.EventActivity;
import com.nith.appteam.hillffair17.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by octacode on 25/8/17.
 */

public class SharedPref {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String PREF_NAME="UserInfo";
    private static final String LOGIN_STATUS="loginstatus";
    private static final String USER_ID="apikey";
    private static final String IS_FIRST_TIME="isfirstTime";
    private static final  String USER_NAME="name";
    private static  final String USER_EMAIL="email";
    private static  final String USER_ROLLNO="rollno";
    private static  final String USER_PIC_URL="picUrl";
    private static final String NITIAN_STATUS="nitian";
    private static  final String FIRST_ROLL_REGISTER="rollRegister";

    public SharedPref(Context context){
        sharedPreferences = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public SharedPref(EventActivity eventActivity) {
    }

    public SharedPref(BattleDayActivity battleDayActivity) {
    }

    public SharedPref(ClubActivity clubActivity) {
    }

    public void setLoginStatus(boolean isLogIn){
        editor.putBoolean(LOGIN_STATUS,isLogIn);
        editor.commit();
    }

    public boolean getInstructionsReadStatus(){
        return sharedPreferences.getBoolean("quizinstruct",false);
    }

    public boolean getLoginStatus(){
        return sharedPreferences.getBoolean(LOGIN_STATUS,false);
    }


    public static boolean getFirstRun(Context context) {
        return false;
    }

    public static void setFirstRun(Context context) {
        context.getSharedPreferences(context.getString(R.string.preference), MODE_PRIVATE).edit().putBoolean(context.getString(R.string.is_first_run), false).apply();
    }

    public void setUserId(String userId){
        editor.putString(USER_ID,userId);
        editor.commit();
    }
    public String getUserId(){
        return sharedPreferences.getString(USER_ID,"");
    }

    public void setIsFirstTime(){
        editor.putBoolean(IS_FIRST_TIME,true);
        editor.commit();
    }

    public boolean showIsFirstTime(){
        return sharedPreferences.getBoolean(IS_FIRST_TIME,false);
    }

    public void setUserName(String name){
        editor.putString(USER_NAME,name);
        editor.commit();
    }

    public String getUserName(){
        return sharedPreferences.getString(USER_NAME,"");
    }

    public void setUserRollno(String rollno){
        editor.putString(USER_ROLLNO,rollno);
        editor.commit();
    }
    public String getUserRollno(){
        return sharedPreferences.getString(USER_ROLLNO,"");
    }


    public void setUserEmail(String email){
        editor.putString(USER_EMAIL,email);
        editor.commit();
    }
    public String getUserEmail(){
        return sharedPreferences.getString(USER_EMAIL,"");
    }

    public void setUserPicUrl(String picUrl){
        editor.putString(USER_PIC_URL,picUrl);
        editor.commit();
    }
    public String getUserPicUrl(){
        return sharedPreferences.getString(USER_PIC_URL,"");
    }

    public void  setNitianStatus(boolean status){
        editor.putBoolean(NITIAN_STATUS,status);
        editor.commit();
    }

    public boolean getNitianStatus(){
        return sharedPreferences.getBoolean(NITIAN_STATUS,false);
    }

    public void  setFirstRollRegister(boolean status){
        editor.putBoolean(FIRST_ROLL_REGISTER,status);
        editor.commit();
    }
    public boolean getFirstTimeRollregister(){
        return sharedPreferences.getBoolean(FIRST_ROLL_REGISTER,true);
    }
}
