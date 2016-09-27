package id.sch.smktelkom_mlg.tugas01.xiirpl501.formpeminjamanbuku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etID;
    Button bPinjam;
    TextView tvNama, tvID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etID = (EditText) findViewById(R.id.editTextID);
        bPinjam =(Button) findViewById(R.id.buttonPinjam);
        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvID = (TextView) findViewById(R.id.textViewID);
        bPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doProcess();

            }
        });

    }

    private void doProcess()
    {
        if (isValid())
        {
            String nama = etNama.getText().toString();
            String ID = etID.getText().toString();

            tvNama.setText("Nama      : " + nama);
            tvID.setText("ID KTP    : " + ID);
        }
    }

    private boolean isValid()
    {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String ID = etID.getText().toString();

        if(nama.isEmpty())
        {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        }
        else if (nama.length()<3)
        {
            etNama.setError("Nama Minimal 3 Karakter");
            valid = false;
        }
        else
        {
            etNama.setError(null);
        }
        if(ID.isEmpty())
        {
            etID.setError("ID KTP Belum Di isi");
            valid = false;
        }
        else if(ID.length()<4)
        {
            etID.setError("ID Minimal 4 Digit");
            valid = false;
        }
        else
        {
            etID.setError(null);
        }

        return valid;
    }


}