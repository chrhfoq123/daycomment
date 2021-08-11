package org.techtown.daycomment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title, content, comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Comment comment = new Comment();
        comment.setTitle("오늘의 속담");

        title = findViewById(R.id.title);
        title.setText(comment.getTitle());
    }
}