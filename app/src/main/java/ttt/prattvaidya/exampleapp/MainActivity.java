package ttt.prattvaidya.exampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
        Log.i("Info", "Button pressed");
        EditText nameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        String usernameText = nameEditText.getText().toString();

        Log.i("Values",usernameText + " " + passwordEditText.getText().toString());
        Toast.makeText(this, "Welcome " + usernameText, Toast.LENGTH_SHORT).show();

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.stairs);
    }
}