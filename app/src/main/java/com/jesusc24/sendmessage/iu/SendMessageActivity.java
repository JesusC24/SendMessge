package com.jesusc24.sendmessage.iu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jesusc24.sendmessage.R;
import com.jesusc24.sendmessage.data.model.Message;
import com.jesusc24.sendmessage.databinding.ActivitySendmessageBinding;

/**
 * Pide al usuario el nombre del distinatrio y un menaje a enviar
 *
 * @author Jwaúa Cortés
 * @version 1.0
 * @see android.app.Activity
 */
public class SendMessageActivity extends AppCompatActivity {

    private static final String TAG = "SendMesssageProject";
    public ActivitySendmessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySendmessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        // binding.btSend.setOnClickListener(view -> sendMessage());

        /* binding.btSend.setOnClickListener(view -> {
            sendMessage();
        }); */

        Log.i(TAG, "SendMessageActivity -> onCreate()");
    }

    //region Métodos que crea el menú de la aplicación
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Este método se ejectura siempre que se pulsa una opción dentro del menu
     * @param item
     * @return
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_about) {
            showAboutUs();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //endregion


    // region Métodos de ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SendMessageActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessageActivity-> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessageActivity -> onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SendMessageActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "SendMessageActivity -> onDestroy()");
        super.onDestroy();
    }
//endregion

    /**
     * Este método es el que utilizamos en la propiedad
     * android:onclick dentro del componente Button btSend
     */

    public void getOnClick(View view) {
        switch (view.getId()) {
            case R.id.btSend:
                sendMessage();
                break;
        }
    }

    /**
     * Este método crea el Intent con los datos que pasa la actividad SendActivity a ViewActivity
     * Inicializar el
     */
    private void sendMessage() {
        //1.1 Crear un objeto contenedor a Bundle para añadir los datos
        Bundle bundle = new Bundle();

        //1.1.1 Ejemplo con dos variables String
        //bundle.putString("user", binding.edUser.getText().toString());
        //bundle.putString("message", binding.edMessage.getText().toString());

        //1.1.2 Ejemplos con la clase modelo Message
        Message message = new Message();
        message.setUser(binding.edUser.getText().toString());
        message.setMessage(binding.edMessage.getText().toString());
        bundle.putSerializable("message", message);

        //1.2 Se crea wl mensaje o Intent explícito ya que se conoce la
        //Actividty origen y la Actibity destino.
        Intent intent = new Intent(this, ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * Este método incializa la Acitivty AboutUs
     */
    private void showAboutUs() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}