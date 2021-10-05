package com.jesusc24.sendmessage.iu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.jesusc24.sendmessage.data.model.Message;
import com.jesusc24.sendmessage.databinding.ActivityViewMessageBinding;

public class ViewMessageActivity extends AppCompatActivity {

    private ActivityViewMessageBinding binding;
    private static final String TAG = "SendMesssageProject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //1. Recoger el Intent que nos ha enviado la Activity SendMessageActivity
        Intent intent = getIntent();
        //2. Recoger el objeto Bundle con el mismo método que se ha introducido en el Intent
        //Bundle bundle = intent.getExtras();

        //2.1 Aquí uso el bundle interno que he creado en SendMessage que es el extras
        Bundle bundle = intent.getExtras();
        Message message = (Message) bundle.getSerializable("message");

        //2.2 Funciona porque el bundle extras está dentro del extra y lo reccorre recursivamente
        //Message message = (Message) intent.getSerializableExtra("message");

        //3. Asignar a cada cadena a sus componentes
        binding.tvContentUser.setText(message.getUser());
        binding.tvContentMessage.setText(message.getMessage());

        //binding.tvContentUser.setText(bundle.getString("user");
        //binding.tvContentUser.setText(bundle.getString("message");

        Log.i(TAG, "ViewMessageActivity -> onCreate()");

    }

    // region Métodos de ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ViewMessageActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ViewMessageActivity -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ViewMessageActivity -> onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "ViewMessageActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "ViewMessageActivity -> onDestroy()");
        super.onDestroy();
    }
    //endregion
}