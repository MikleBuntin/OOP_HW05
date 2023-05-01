package org.example.model;

public class User {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private int check;
    public User(Integer id, String name, Integer check) {
        this.id = id;
        this.name = name;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public int getCheck() {
        return check;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + id +
                ", name=" + name +
                ", check=" + check +
                '}' + "\n";
    }
}