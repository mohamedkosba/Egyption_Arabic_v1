package com.example.android.EgyptionArabic;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_view);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "اب", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("Mother", "ام", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("Son", "ابن", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("Daughter", "ابنه", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("Older Brother", "اخ كبير", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("Younger Brother", "اخ صغير", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("Older Sister", "اخت كبيره", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("Younger Sister", "اخت صغيره", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("Grandmother", "جده", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("Grandfather", "جد", R.drawable.family_grandfather, R.raw.family_grandfather));

        // we create this custom array adapter because the default work with the single (View) in one listItem
        //this adapter control how the list item should look like
        //for each item in the list
        //this input words is list which is the data scorce
        WordAdapter adapter =new WordAdapter(this, words, R.color.category_family);

//---------------------------------------------------------------------------------------------------
//the implementation of the ListView and the ArrayAdapter is here
        // getting reference to the whole container on the screen, to set the adapter to it
        ListView listView = (ListView) findViewById(R.id.list);


        // setting the adapter to the list view
        listView.setAdapter(adapter);

    }
}
