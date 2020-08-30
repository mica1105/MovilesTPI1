package com.mika.movilestpi1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class UsbConectado extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Boolean b = intent.getBooleanExtra("connected", false);
        if(b){
            Toast.makeText(context,"Ud tiene el USB conectado",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(context, "Ud. tiene el USB desactivado", Toast.LENGTH_LONG).show();
        }
    }

}
