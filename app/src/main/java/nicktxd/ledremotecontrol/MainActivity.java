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
    Button btOne;
    Button btTwo;
    Button btThree;
    Button btFour;
    Button btFive;
    Button btSix;
    Button btSeven;
    Button btEight;
    Button btNine;
    Button btTen;
    Button btEleven;
    Button btTwelve;
    Button btFade;
    Button btSmooth;
    Button btStrobe;
    Button btFlash;

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
        btOne = findViewById(R.id.bt1);
        btTwo = findViewById(R.id.bt2);
        btThree = findViewById(R.id.bt3);
        btFour = findViewById(R.id.bt4);
        btFive = findViewById(R.id.bt5);
        btSix = findViewById(R.id.bt6);
        btSeven = findViewById(R.id.bt7);
        btEight = findViewById(R.id.bt8);
        btNine = findViewById(R.id.bt9);
        btTen = findViewById(R.id.bt10);
        btEleven = findViewById(R.id.bt11);
        btTwelve = findViewById(R.id.bt12);
        btFade = findViewById(R.id.btFade);
        btSmooth = findViewById(R.id.btSmooth);
        btStrobe = findViewById(R.id.btStrobe);
        btFlash = findViewById(R.id.btFlash);

        btON.setOnClickListener(mSendClickListener);
        btOFF.setOnClickListener(mSendClickListener);
        btBrightUp.setOnClickListener(mSendClickListener);
        btBrightDown.setOnClickListener(mSendClickListener);
        btRed.setOnClickListener(mSendClickListener);
        btGreen.setOnClickListener(mSendClickListener);
        btBlue.setOnClickListener(mSendClickListener);
        btWhite.setOnClickListener(mSendClickListener);
        btOne.setOnClickListener(mSendClickListener);
        btTwo.setOnClickListener(mSendClickListener);
        btThree.setOnClickListener(mSendClickListener);
        btFour.setOnClickListener(mSendClickListener);
        btFive.setOnClickListener(mSendClickListener);
        btSix.setOnClickListener(mSendClickListener);
        btSeven.setOnClickListener(mSendClickListener);
        btEight.setOnClickListener(mSendClickListener);
        btNine.setOnClickListener(mSendClickListener);
        btTen.setOnClickListener(mSendClickListener);
        btEleven.setOnClickListener(mSendClickListener);
        btTwelve.setOnClickListener(mSendClickListener);
        btFade.setOnClickListener(mSendClickListener);
        btSmooth.setOnClickListener(mSendClickListener);
        btStrobe.setOnClickListener(mSendClickListener);
        btFlash.setOnClickListener(mSendClickListener);

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
                case R.id.bt1:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.One);
                    break;
                case R.id.bt2:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Two);
                    break;
                case R.id.bt3:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Three);
                    break;
                case R.id.bt4:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Four);
                    break;
                case R.id.bt5:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Five);
                    break;
                case R.id.bt6:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Six);
                    break;
                case R.id.bt7:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Seven);
                    break;
                case R.id.bt8:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Eight);
                    break;
                case R.id.bt9:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Nine);
                    break;
                case R.id.bt10:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Ten);
                    break;
                case R.id.bt11:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Eleven);
                    break;
                case R.id.bt12:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Twelve);
                    break;
                case R.id.btFade:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Fade);
                    break;
                case R.id.btSmooth:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Smooth);
                    break;
                case R.id.btStrobe:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Strobe);
                    break;
                case R.id.btFlash:
                    if(!managerIR.hasIrEmitter())
                        return;
                    managerIR.transmit(38400, patterns.Flash);
                    break;
            }
        }
    };
}
