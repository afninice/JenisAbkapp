package afniramadania.tech.jenisabkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailAbk extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cardview_abk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Abk abk = getIntent().getParcelableExtra("key");

        ImageView photo = (ImageView) findViewById(R.id.img_item_photo);
        TextView name = (TextView) findViewById(R.id.tv_item_name);
        TextView remarks = (TextView) findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView) findViewById(R.id.content_detail);

        Glide.with(this).load(abk.getPhoto()).into(photo);

        name.setText(abk.getName());
        remarks.setText(abk.getRemarks());
        deskripsi.setText(abk.getDeskripsi());


        Log.i("photo",abk.getPhoto());
        Log.i("deskripsi",abk.getDeskripsi());
    }


}
