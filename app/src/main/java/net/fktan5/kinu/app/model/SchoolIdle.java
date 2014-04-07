package net.fktan5.kinu.app.model;

/**
 * Created by keigo on 2014/03/27.
 */
public class SchoolIdle {
    private String name;
    private String cv;

    public SchoolIdle(){
        this.name = "Unseen Idol";
        this.cv = "Rookie Voice Actior";
    }

    public SchoolIdle(String name, String cv) {
        this.name = name;
        this.cv = cv;
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
