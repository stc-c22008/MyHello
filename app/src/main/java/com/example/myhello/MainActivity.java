package com.example.myhello;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン添オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);

        btClear.setOnClickListener(listener);
    }

    //ボタンをクリックした時のリスナクラス
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);

            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            if (id == R.id.btClick){
                String inputStr = input.getText().toString();

                output.setText(inputStr + "さん、ご機嫌いかがですか");

            }else if (id == R.id.btClick) {

                input.setText("");

                output.setText("");
            }
        }
    }
}