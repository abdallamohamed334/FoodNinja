package com.example.foodninja;

public class Cat {
    int image;
    String title, dis;

    public Cat(int image, String title, String dis) {
        this.image = image;
        this.title = title;
        this.dis = dis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}
