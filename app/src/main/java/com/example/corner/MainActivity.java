package com.example.corner;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtglass;
    EditText ettext;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettext=(EditText)findViewById(R.id.ettext);
        txtglass=(TextView)findViewById(R.id.txtglass);
        //ettext.setVisibility(View.GONE);
        txtglass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==0){
                    ettext.setVisibility(View.VISIBLE);
                    count=1;

                }
                else{
                    ettext.setVisibility(View.GONE);
                    count=0;
                }


            }
        });

    }
}