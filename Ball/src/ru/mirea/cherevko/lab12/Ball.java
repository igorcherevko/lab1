package ru.mirea.cherevko.lab12;
import java.lang.*;

public class Ball {
    private double diametr;
    private double volume;
    private String color;

    public Ball(double diametr, double volume, String color) {
        this.diametr = diametr;
        this.volume = volume;
        this.color = color;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diametr=" + diametr +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
}
