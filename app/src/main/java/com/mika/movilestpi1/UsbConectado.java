package com.mika.movilestpi1;

import android.Manifest;
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

    private int bandera= 0;

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Boolean b = intent.getBooleanExtra("connected", false);
        if(b && bandera == 0){
            Toast.makeText(context,"USB Activado", Toast.LENGTH_LONG).show();
            Intent intent1 = new Intent(context,LlamadaActivity.class);
            context.startActivity(intent1);
            bandera = 1;
        }else {
            bandera = 0;
             Toast.makeText(context,"USB Desactivado", Toast.LENGTH_LONG).show();
        }
    }

}
