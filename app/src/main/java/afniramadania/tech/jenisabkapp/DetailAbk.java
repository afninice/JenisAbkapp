package afniramadania.tech.jenisabkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailAbk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_abk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Abk anakabk = getIntent().getParcelableExtra("key");

        ImageView image = (ImageView) findViewById(R.id.img_item_photo);
        TextView name = (TextView) findViewById(R.id.tv_item_name);
        TextView remarks = (TextView) findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView) findViewById(R.id.content_detail);

        Glide.with(this).load(image).apply(new RequestOptions().override(300, 200)).into(image);


        name.setText(anakabk.getName());
        remarks.setText(anakabk.getRemarks());
        deskripsi.setText(anakabk.getDeskripsi());


        Log.i("photo",anakabk.getPhoto());
        Log.i("deskripsi",anakabk.getDeskripsi());


    }

}
