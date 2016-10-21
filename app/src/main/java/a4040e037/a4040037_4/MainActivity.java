package a4040e037.a4040037_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button a1;
    private Button a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutt(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, about.class);
        startActivity(intent);
    }
    public void viddd(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, video.class);
        startActivity(intent);
    }
}