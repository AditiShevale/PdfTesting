package com.example.aditishevale999.pdftesting;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pspdfkit.configuration.activity.PdfActivityConfiguration;
import com.pspdfkit.ui.PdfActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using the configuration builder, you can define options for the activity.
        final PdfActivityConfiguration config = new PdfActivityConfiguration.Builder(this).build();

        // Launch the activity, viewing the PDF document directly from the assets.
        PdfActivity.showDocument(this,
                Uri.parse("file:///android_asset/دعائم الإسلام الجزء 1.pdf"), config);

    }
}
