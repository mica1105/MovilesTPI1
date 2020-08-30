package com.mika.movilestpi1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;

import static android.Manifest.permission.CALL_PHONE;

public class UsbConectado extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Boolean b = intent.getBooleanExtra("connected", false);
        if(b){
            Toast.makeText(context,"USB activado", Toast.LENGTH_LONG).show();
        }else {
             Toast.makeText(context,"USB desactivado", Toast.LENGTH_LONG).show();
        }
    }


}
