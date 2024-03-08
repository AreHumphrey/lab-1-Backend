package org.example;

public class Cats {
    private final String name;
    private Integer age;

    public Cats(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void meow() {
        System.out.println("Meow!" + name);
    }

    public void birthDay() {
        age++;
        System.out.println("Happy birthDay, MEWKIN");
    }

    public void play() {
        System.out.println("PLAY!!");
    }

    public void drink() {
        System.out.println("Cat drink");
    }

    public void jump() {
        System.out.println("JUMP!");
    }
}
