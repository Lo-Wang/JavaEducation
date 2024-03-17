package lr2;

class Rectangle {
    private double length;
    private double width;

    // Конструктор для создания "прямоугольника" по длине и ширине
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter/setter методы для длины
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter/setter методы для ширины
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return length * width;
    }

    // Метод для вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
