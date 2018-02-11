package ataufiq.com.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("weṭeṭṭi","red",R.drawable.color_red,
                R.raw.color_red));
        words.add(new Word("chokokki","green",R.drawable.color_green,
                R.raw.color_green));
        words.add(new Word("ṭakaakki","brown",R.drawable.color_brown,
                R.raw.color_brown));
        words.add(new Word("ṭopoppi","gray",R.drawable.color_gray,
                R.raw.color_gray));
        words.add(new Word("kululli","black",R.drawable.color_black,
                R.raw.color_black));
        words.add(new Word("kelelli","white",R.drawable.color_white,
                R.raw.color_white));
        words.add(new Word("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow));
        words.add(new Word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow));

        WordAdapter itemsAdapter=
                new WordAdapter(this,words,R.color.category_colors);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
