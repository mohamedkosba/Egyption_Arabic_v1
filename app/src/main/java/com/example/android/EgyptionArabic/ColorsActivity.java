package com.example.android.EgyptionArabic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;


import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_grid_view);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dark Olive Green", "اخضر داكن", R.drawable.dark_olive_green, R.raw.dark_olive_green));
        words.add(new Word("Green", "اخضر", R.drawable.green, R.raw.color_green));
        words.add(new Word("Dusty Yellow", "اصفر باهت(بيچ)", R.drawable.dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "اصفر فاتج", R.drawable.mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("Orange", "برتقاني", R.drawable.orange, R.raw.color_orange));
        words.add(new Word("Pumpkin", "برتقاني قرع عسل (يقطين)", R.drawable.pumpkin, R.raw.color_pumpkin));
        words.add(new Word("Dark Brown", "بني داكن", R.drawable.dark_brown, R.raw.dark_brown));
        words.add(new Word("Brown", "بني", R.drawable.brown, R.raw.color_brown));
        words.add(new Word("Turquoise", "تركواز", R.drawable.turquoise, R.raw.color_turquoise));
        words.add(new Word("Red", "احمر", R.drawable.red, R.raw.color_red));
        words.add(new Word("Blue", "ازرق", R.drawable.blue, R.raw.color_blue));
        words.add(new Word("Azure", "ازرق سماوي", R.drawable.azure, R.raw.color_azure));
        words.add(new Word("Violet", "بنفسجي", R.drawable.violet, R.raw.color_violet));
        words.add(new Word("Dark Violet", "بنفسجي غامق", R.drawable.dark_violet, R.raw.dark_violet));
        words.add(new Word("Purple", "موف غامق (ارجواني)", R.drawable.purple, R.raw.color_purple));
        words.add(new Word("pink", "بمبي (وردي)", R.drawable.pink, R.raw.color_pink));
        words.add(new Word("Silver", "فضي", R.drawable.silver, R.raw.silver));
        words.add(new Word("Gray", "رمادي", R.drawable.gray, R.raw.color_gray));
        words.add(new Word("White", "ابيض", R.drawable.white, R.raw.color_white));
        words.add(new Word("Black", "اسود", R.drawable.black, R.raw.color_black));


        // we create this custom array adapter because the default work with the single (View) in one listItem
        //this adapter control how the list item should look like
        //for each item in the list
        //this input words is list which is the data scorce
        WordAdapter adapter =new WordAdapter(this, words, R.color.category_colors);

//---------------------------------------------------------------------------------------------------
//the implementation of the ListView and the ArrayAdapter is here
        // getting reference to the whole container on the screen, to set the adapter to it
        GridView listView = (GridView) findViewById(R.id.list);


        // setting the adapter to the list view
        listView.setAdapter(adapter);

    }
}
