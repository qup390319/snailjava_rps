package com.example.snailjava_rps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {
    private TextView tv_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(btnHomeListener);

        Button btn_player = (Button) findViewById(R.id.btn_player);
        TextView tv_computer = (TextView) findViewById(R.id.tv_result);
        TextView tv_result = (TextView) findViewById(R.id.tv_computer);
        tv_player = (TextView) findViewById(R.id.tv_player);


        RadioGroup rad_gamer = (RadioGroup) findViewById(R.id.rad_gamer);
        RadioButton rad_scissor = (RadioButton) findViewById(R.id.rad_scissor);
        RadioButton rad_Stone = (RadioButton) findViewById(R.id.rad_stone);
        RadioButton rad_paper = (RadioButton) findViewById(R.id.rad_paper);

        rad_gamer.setOnCheckedChangeListener(rad_gamerListener);

        btn_player.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {

                Integer computer = (int) (Math.random() * 3);
                tv_computer.setText((computer == 0) ? "剪刀" : (computer == 1) ? "石頭" : "布");

                if (rad_scissor.isChecked() && computer == 2 || rad_Stone.isChecked() && computer == 0 || rad_paper.isChecked() && computer == 1) {
                    tv_result.setText("恭喜你獲勝了");
                } else if (rad_scissor.isChecked() && computer == 1 || rad_Stone.isChecked() && computer == 2 || rad_paper.isChecked() && computer == 0) {
                    tv_result.setText("你輸了 嗚嗚嗚");
                } else {
                    tv_result.setText("平手了");
                }
            }
        });
    }

    private final RadioGroup.OnCheckedChangeListener rad_gamerListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == R.id.rad_scissor) {
                tv_player.setText("你選了剪刀");
            } else if (checkedId == R.id.rad_stone) {
                tv_player.setText("你選了石頭");
            } else {
                tv_player.setText("你選了布");
            }
        }
    };

    private final View.OnClickListener btnHomeListener = new View.OnClickListener() {
        public void onClick(View v) {
            finish();
        }
    };


}

