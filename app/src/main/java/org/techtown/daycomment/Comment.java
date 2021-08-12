package org.techtown.daycomment;

public class Comment {
    private String title;
    private String comment;
    private String content;

    public Comment() {
        init();
    }

    private void init() {
        setTitle("오늘의 속담 보세요");
        setComment("가는말이고아야오는말이곱다");
        setContent("설명 : 말을 곱게하면 똑같이 곱게 돌아온다");
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public String getComment(){
        return this.comment;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
