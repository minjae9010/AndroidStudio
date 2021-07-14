package tk.mjsv.project30519;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text1,text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoO,rdoPi,rdoQ;
    Button fisnish,returnto;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = findViewById(R.id.Text1);
        text2 = findViewById(R.id.Text2);
        chkAgree = findViewById(R.id.ChkAgree);
        rGroup1 = findViewById(R.id.Rgroup1);
        fisnish = findViewById(R.id.finish);
        returnto = findViewById(R.id.re);
        imgPet = findViewById(R.id.ImgPet);
        rdoO = findViewById(R.id.RdoO);
        rdoPi = findViewById(R.id.RdoPI);
        rdoQ = findViewById(R.id.RdoQ);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    fisnish.setVisibility(View.VISIBLE);
                    returnto.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    fisnish.setVisibility(View.INVISIBLE);
                    returnto.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        rdoO.setOnClickListener(this);
        rdoPi.setOnClickListener(this);
        rdoQ.setOnClickListener(this);
        fisnish.setOnClickListener(this);
        returnto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.RdoO:
                imgPet.setImageResource(R.drawable.oreo);
                break;
            case R.id.RdoPI:
                imgPet.setImageResource(R.drawable.pie);
                break;
            case R.id.RdoQ:
                imgPet.setImageResource(R.drawable.q10);
                break;
            case R.id.re:
                chkAgree.setChecked(false);
                imgPet.setImageResource(0);
                rGroup1.clearCheck();
                break;
            case R.id.finish:
                System.exit(0);
                break;

        }
    }
}