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

        Comment ct = new Comment();

        title = findViewById(R.id.title);
        title.setText(ct.getTitle());

        comment = findViewById(R.id.comment);
        comment.setText(ct.getComment());

        content = findViewById(R.id.content);
        content.setText(ct.getContent());
    }
}