package net.frisco27.mypoint;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.ImageButton;

import net.frisco27.mypoint.R;

/**
 * Created by Frisco27 on 17/11/2017.
 */

public class DialogUbicacion extends DialogFragment {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public Dialog onCreateDialog(Bundle bundle)
    {
        final View content = getActivity().getLayoutInflater().inflate(R.layout.ubicacion_dialog,null);

        ImageButton btnCamera = content.findViewById(R.id.btCamera);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(content)
                // Add action buttons

                .setPositiveButton("guardar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //Código para cuando se haga click en negativo
                        dialog.dismiss();
                    }
                });

        return builder.create();
    }
}
