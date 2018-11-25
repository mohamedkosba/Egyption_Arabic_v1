package com.example.android.EgyptionArabic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_view);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "واحد", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two", "اتنين", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three", "تلاته", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four", "اربعه", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five", "خمسه", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six", "سته", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven", "سبعه", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "تمنيه", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine", "تسعه", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten", "عشره", R.drawable.number_ten, R.raw.number_ten));

        // we create this custom array adapter because the default work with the single (View) in one listItem
        //this adapter control how the list item should look like
        //for each item in the list
        //this input words is list which is the data source
        WordAdapter adapter =new WordAdapter(this, words, R.color.category_numbers);

//---------------------------------------------------------------------------------------------------
//the implementation of the ListView and the ArrayAdapter is here
        // getting reference to the whole container on the screen, to set the adapter to it
        ListView listView = (ListView) findViewById(R.id.list);


        // setting the adapter to the list view
        listView.setAdapter(adapter);





    }
}
