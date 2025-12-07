package subham.sinha.dev.freedium;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WebviewClass extends AppCompatActivity {
    WebView view_fdm;
    FloatingActionButton share;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webclass);
        view_fdm=findViewById(R.id.view_fdm);
        share=findViewById(R.id.btn_share);
        Intent i=getIntent();
        String link=i.getStringExtra("geturl");
        String fcd="https://removepaywalls.com/5/"+link;
        WebSettings settings=view_fdm.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);



        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apptag = "🔥 Frredium — Read Without Limits!\n" +
                        "Skip paywalls and enjoy premium articles *for free* — clean, fast, and ad-free 📰✨\n\n" +
                        "👉 Try now: https://freedium-android.vercel.app/\n\n" +
                        "#Frredium #ReadFree #AndroidApp #TechForGood\n\n" +
                        "📖 Read the shared article: ";

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT, apptag + fcd);
                startActivity(i);

            }
        });

        view_fdm.setWebViewClient(new WebViewClient());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            settings.setForceDark(WebSettings.FORCE_DARK_ON);
        }

      view_fdm.setBackgroundColor(Color.TRANSPARENT);

        if(fcd!=null){
            view_fdm.loadUrl(fcd);
            MaterialAlertDialogBuilder materialAlertDialogBuilder=new MaterialAlertDialogBuilder(WebviewClass.this).setTitle("Testing Phase")
                    .setMessage("This Application is now in testing phase !! Please report any issues in about section");
            materialAlertDialogBuilder.show();

        }




    }
}
