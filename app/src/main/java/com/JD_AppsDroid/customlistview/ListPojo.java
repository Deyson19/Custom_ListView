package com.JD_AppsDroid.customlistview;

public class ListPojo {
    private String title;
    private int description;
    private int images;

    public ListPojo(String title,int description,int images){
        this.title = title;
        this.description = description;
        this.images = images;
    }
    public String getTitle(){
        return title;
    }

    public int getDescription(){
        return description;
    }

    public int getImages(){
        return images;
    }

}
