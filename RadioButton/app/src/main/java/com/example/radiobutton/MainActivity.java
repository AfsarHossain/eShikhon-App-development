package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rbClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.rbL:
                str = "Lenovo";
                Toast.makeText(getApplicationContext(), "Lenovo Choosed", Toast.LENGTH_LONG).show();
                break;
            case R.id.rbA:
                str = "Asus";
                Toast.makeText(getApplicationContext(), "Asus Choosed", Toast.LENGTH_LONG).show();
                break;
            case R.id.rbD:
                str = "Dell";
                Toast.makeText(getApplicationContext(), "Dell Chossed", Toast.LENGTH_LONG).show();
                break;
            case R.id.rbHp:
                str = "HP";
                Toast.makeText(getApplicationContext(), "HP Chossed", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void viewBtn(View view) {
        Intent intent = new Intent(this, RadioInputActivity.class);
        EditText editText = findViewById(R.id.editText);
        intent.putExtra("Choosen", str);
        intent.putExtra("Editable", editText.getText().toString());
        startActivity(intent);

    }
}