package subham.sinha.dev.freedium;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import subham.sinha.dev.freedium.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.net.URL;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    MaterialButton paywall;
    TextInputEditText url_user;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        paywall=findViewById(R.id.paywall);
        url_user=findViewById(R.id.url_user);

        paywall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String link=url_user.getText().toString().trim();
                if(link.startsWith(("https://"))){

                    Intent i=new Intent(getApplicationContext(),WebviewClass.class);
                    i.putExtra("geturl",link);
                    startActivity(i);
                }else {
                    Snackbar.make(v,"Enter A Valid Url",Snackbar.LENGTH_SHORT);
                }

//                startActivity(new Intent(getApplicationContext(),WebviewClass.class));



            }
        });


//        setSupportActionBar(binding.toolbar)


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
public void about(View v){
    MaterialAlertDialogBuilder md=new MaterialAlertDialogBuilder(MainActivity.this);
   // md.setIcon(R.drawable.ic_launcher_foreground);
    md.setTitle("About The Developer");
    md.setMessage("An FOSS App developed for bypassing medium paywall using freedium.\nRead medium articles for free. Written in Java:)\n All Thanks To Freedium ");
   // md.setPositiveButtonIcon(getResources().getDrawable(R.drawable.ic_github));

    md.setPositiveButton("Github", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Intent i=new Intent().setAction(Intent.ACTION_VIEW).setData(Uri.parse("https://github.com/subhamsinhadev/Freedium-Android"));
            startActivity(i);


        }
    });
// md.setNeutralButtonIcon(getResources().getDrawable(R.drawable.ic_linkedin));
    md.setNeutralButton("Linkedin", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Intent i=new Intent().setAction(Intent.ACTION_VIEW).setData(Uri.parse("https://linkedin.com/in/subhamsinhadev"));
            startActivity(i);


        }
    });
    md.show();

}
}