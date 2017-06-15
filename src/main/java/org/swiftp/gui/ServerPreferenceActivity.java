package org.swiftp.gui;

import java.io.File;
import java.net.InetAddress;

import org.swiftp.FTPServerService;
import org.swiftp.Globals;
import org.swiftp.R;


import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

/**
 * This is the main activity for swiftp, it enables the user to start the server service
 * and allows the users to change the settings.
 */
public class ServerPreferenceActivity extends PreferenceActivity{

    private static String TAG = ServerPreferenceActivity.class.getSimpleName();



    public static void start(Context context) {
        Intent starter = new Intent(context, ServerPreferenceActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.ftp_preferences);
        setContentView(R.layout.activity_preference);


    }



    @Override
    protected void onResume() {
        Log.v(TAG, "onResume");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.v(TAG, "onPause");
        super.onPause();

        Log.v(TAG, "Unregistering the FTPServer actions");


    }



}
