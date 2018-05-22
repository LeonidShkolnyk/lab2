package com.example.amenight.univer;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Toast;

import com.example.amenight.univer.databinding.ActivitySecondBinding;

/**
 * Created by amenight on 5/22/18.
 */

public class SecondActivity extends AppCompatActivity {

    private boolean isRed;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        binding.btnSecond.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Lyonya", Toast.LENGTH_SHORT).show();
            binding.rlContainer.setBackgroundColor(isRed ?
                    getResources().getColor(R.color.colorPrimary) :
                    getResources().getColor(R.color.colorAccent));
            isRed = !isRed;
            RotateAnimation rotate = new RotateAnimation(0, 1360,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(1000);
            rotate.setInterpolator(new LinearInterpolator());
            binding.btnSecond.setAnimation(rotate);
        });
    }
}
