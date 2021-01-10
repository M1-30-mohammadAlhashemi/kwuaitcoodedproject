package com.example.finalproject;

import java.io.Serializable;

public class code implements Serializable {

    private String name;
    private String important;
    private String importantCommand;
    private String importantCommand1;
    private String importantCommand2;
    private int img;

    public code(String name, String important, String importantCommand, String importantCommand1, String importantCommand2, int img) {
        this.name = name;
        this.important = important;
        this.importantCommand = importantCommand;
        this.importantCommand1 = importantCommand1;
        this.importantCommand2 = importantCommand2;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getImportantCommand() {
        return importantCommand;
    }

    public void setImportantCommand(String importantCommand) {
        this.importantCommand = importantCommand;
    }

    public String getImportantCommand1() {
        return importantCommand1;
    }

    public void setImportantCommand1(String importantCommand1) {
        this.importantCommand1 = importantCommand1;
    }

    public String getImportantCommand2() {
        return importantCommand2;
    }

    public void setImportantCommand2(String importantCommand2) {
        this.importantCommand2 = importantCommand2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}