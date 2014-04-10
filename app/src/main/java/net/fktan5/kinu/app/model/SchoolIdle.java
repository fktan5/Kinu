package net.fktan5.kinu.app.model;

/**
 * Created by keigo on 2014/03/27.
 */
public class SchoolIdle {
    private String name;
    private String cv;
    private int age;
    private String blood;
    private String foodLike;
    private String foodDislike;
    private int[] threesize;
    private int height;

    public SchoolIdle(){
        this.name = "Unseen Idol";
        this.cv = "Rookie Voice Actior";
        this.age = 18;
        this.blood = "A";
        this.foodDislike = "うめぼし";
        this.foodLike = "まぐろ";
        this.threesize = new int[]{80,60,80};
        this.height = 160;
    }

    public SchoolIdle(String name, String cv) {
        this();
        this.name = name;
        this.cv = cv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getFoodLike() {
        return foodLike;
    }

    public void setFoodLike(String foodLike) {
        this.foodLike = foodLike;
    }

    public String getFoodDislike() {
        return foodDislike;
    }

    public void setFoodDislike(String foodDislike) {
        this.foodDislike = foodDislike;
    }

    public int[] getThreesize() {
        return threesize;
    }

    public void setThreesize(int[] threesize) {
        this.threesize = threesize;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
