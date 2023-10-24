package ru.geekbrains.lesson1.store3d.modelelements;

public class Texture {

    public Texture(String name)
    {
        this.name = name;
    }

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static int counter = 0;
    private final int id;
    private final String name;

}
