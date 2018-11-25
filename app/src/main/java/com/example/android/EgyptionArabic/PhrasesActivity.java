package com.example.android.EgyptionArabic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_view);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "رايح فين؟", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "اسمك ايه؟", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "اسمي ...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "حاسس بايه", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "انا تمام", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "هتيجي", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "ايوا جاي", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "جاي", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "يلا", R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "تعال هنا", R.raw.phrase_come_here));

        //1) --> we create this custom array adapter because the default work with the single (View) in one listItem
        //this adapter control how the list item should look like
        //for each item in the list
        //this input words is list which is the data source

        //2) --> we also add a third parameter for activity color because every activity has different
        //background color and we chose to add it here not in the word custom class because we don't
        //need to waste memory in repeated code
        WordAdapter adapter =new WordAdapter(this, words, R.color.category_phrases);

//---------------------------------------------------------------------------------------------------
//the implementation of the ListView and the ArrayAdapter is here
        // getting reference to the whole container on the screen, to set the adapter to it
        ListView listView = (ListView) findViewById(R.id.list);


        // setting the adapter to the list view
        listView.setAdapter(adapter);

    }
}
