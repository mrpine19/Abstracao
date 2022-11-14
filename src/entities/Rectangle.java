package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // A CLASSE, POR EXTENDER UMA CLASSE ABSTRATA, É OBRIGADA A S
    // OBRESCREVER SEUS MÉTODOS ABSTRATOS
    @Override
    public double area() {
        return width * height;
    }
}
