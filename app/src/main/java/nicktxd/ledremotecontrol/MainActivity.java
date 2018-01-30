package nicktxd.ledremotecontrol;

import android.Manifest;
import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ConsumerIrManager managerIR;

    Button btON;
    Button btOFF;
    Button btBrightUp;
    Button btBrightDown;
    Button btRed;
    Button btGreen;
    Button btBlue;
    Button btWhite;

    Patterns patterns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        managerIR = (ConsumerIrManager)getSystemService(Context.CONSUMER_IR_SERVICE);
        btON = findViewById(R.id.btON);
        btOFF = findViewById(R.id.btOFF);
        btBrightUp = findViewById(R.id.btBrightUp);
        btBrightDown = findViewById(R.id.btBrightDown);
        btRed = findViewById(R.id.btRed);
        btGreen = findViewById(R.id.btGreen);
        btBlue = findViewById(R.id.btBlue);
        btWhite = findViewById(R.id.btWhite);



        btON.setOnClickListener(mSendClickListener);
        btOFF.setOnClickListener(mSendClickListener);
        btBrightUp.setOnClickListener(mSendClickListener);
        btBrightDown.setOnClickListener(mSendClickListener);
        btRed.setOnClickListener(mSendClickListener);
        btGreen.setOnClickListener(mSendClickListener);
        btBlue.setOnClickListener(mSendClickListener);
        btWhite.setOnClickListener(mSendClickListener);

        patterns = new Patterns();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.TRANSMIT_IR}, 1);
        }

    }

    View.OnClickListener mSendClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btON:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.On);
                    break;
                case R.id.btOFF:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Off);
                    break;
                case R.id.btBrightDown:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.BrightnessDown);
                case R.id.btBrightUp:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.BrightnessUp);
                case R.id.btRed:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Red);
                    break;
                case R.id.btGreen:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Green);
                    break;
                case R.id.btBlue:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Blue);
                    break;
                case R.id.btWhite:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.White);
                    break;
            }
        }
    };
}
