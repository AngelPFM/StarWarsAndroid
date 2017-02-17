package com.example.angelhpascual.starwarsandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Help extends AppCompatActivity
{

    TextView text;
    ImageView imgTwitter;
    ImageView imgGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        text = (TextView) findViewById(R.id.txtAbout);
        Linkify.addLinks(text, Linkify.ALL);


        imgGitHub = (ImageView) findViewById(R.id.imgGitHub);
    }



    public void imgGitHub_onClick(View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://github.com/angelPFM/"));
        startActivity(intent);
    }

}
