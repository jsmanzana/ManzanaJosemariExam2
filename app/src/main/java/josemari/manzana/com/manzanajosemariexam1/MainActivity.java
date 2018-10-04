package josemari.manzana.com.manzanajosemariexam1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_activity);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.btn1){
            i = new Intent(this,SecondActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.0610410, 120.991841"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
    }
}
