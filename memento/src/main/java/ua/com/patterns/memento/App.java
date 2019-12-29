package ua.com.patterns.memento;

import ua.com.patterns.memento.shapes.Circle;
import ua.com.patterns.memento.shapes.CompoundShape;
import ua.com.patterns.memento.shapes.Dot;
import ua.com.patterns.memento.shapes.Rectangle;


import java.awt.*;

import static java.awt.Color.GREEN;

public class App {

    public static void main(String... args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, GREEN),
                        new Dot(240, 240, GREEN),
                        new Dot(240, 360, GREEN),
                        new Dot(360, 360, GREEN),
                        new Dot(360, 240, GREEN)
                )
        );
    }
}
