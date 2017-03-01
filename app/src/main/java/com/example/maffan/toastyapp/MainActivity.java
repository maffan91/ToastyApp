package com.example.maffan.toastyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button warningButton;
    Button errorButton;
    Button infoButton;
    Button successButton;
    Button normalButton;
    Button iconButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        warningButton = (Button) findViewById(R.id.warning_button);
        errorButton = (Button) findViewById(R.id.error_button);
        infoButton = (Button) findViewById(R.id.info_button);
        successButton = (Button) findViewById(R.id.success_button);
        normalButton = (Button) findViewById(R.id.normal_no_icon_button);
        iconButton = (Button) findViewById(R.id.normal_icon_button);

        warningButton.setOnClickListener(this);
        errorButton.setOnClickListener(this);
        infoButton.setOnClickListener(this);
        successButton.setOnClickListener(this);
        normalButton.setOnClickListener(this);
        iconButton.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.error_button:{

                Toasty.error(this,"Server Error").show();
                break;
            }
            case R.id.info_button:{

                Toasty.info(this,"Updates available").show();
                break;
            }
            case R.id.warning_button:{

                Toasty.warning(this,"Version Depricated").show();
                break;
            }
            case R.id.success_button:{

                Toasty.success(this,"Successfully Completed!!").show();
                break;
            }
            case R.id.normal_icon_button:{

                Toasty.custom(this,"Custom Toast",getResources().getDrawable(R.drawable.ic_clear_white_48dp),getResources().getColor(R.color.colorPrimary), Toast.LENGTH_SHORT,true).show();
                break;
            }
            case R.id.normal_no_icon_button:{

                Toasty.normal(this,"Account Created").show();
                break;
            }
        }
    }
}
