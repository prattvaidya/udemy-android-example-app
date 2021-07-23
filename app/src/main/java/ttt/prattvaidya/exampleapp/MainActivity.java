package ttt.prattvaidya.exampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
        Log.i("Info", "Button pressed");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Values",nameEditText.getText().toString());
    }
}