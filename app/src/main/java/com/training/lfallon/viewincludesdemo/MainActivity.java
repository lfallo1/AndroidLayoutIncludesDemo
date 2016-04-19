package com.training.lfallon.viewincludesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private View topButton;
    private View bottomButton;
    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.include_text_panel_textView);

        View topButtonPanel = findViewById(R.id.activity_main_buttonPanelTop);
        View bottomButtonPanel = findViewById(R.id.activity_main_buttonPanelBottom);

        topButton = topButtonPanel.findViewById(R.id.include_button_panel_button);
        bottomButton = bottomButtonPanel.findViewById(R.id.include_button_panel_button);
        topButton.setOnClickListener(this);
        bottomButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.include_button_panel_button){
            textView.setText("Clicked it!" + (counter++));
        }
    }
}
