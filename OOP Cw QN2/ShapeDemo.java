public class ShapeDemo {

    public static void main(String[] args) {

        try {

            Shape c =
                    new Circle(
                            5,
                            "Red",
                            true);

            Shape r =
                    new Rectangle(
                            4,
                            6,
                            "Blue",
                            false);

            Shape t =
                    new Triangle(
                            3,
                            4,
                            5,
                            "Green",
                            true);

            Shape[] shapes = {c, r, t};

            System.out.println(
                    "AREAS OF SHAPES");

            printAreas(shapes);

            System.out.println(
                    "\nLARGEST SHAPE");

            System.out.println(
                    largest(shapes));

            System.out.println(
                    "\nRESIZING SHAPES");

            c.resize(2);
            r.resize(2);
            t.resize(2);

            printAreas(shapes);

            System.out.println(
                    "\nCREATING INVALID TRIANGLE");

            Shape bad =
                    new Triangle(
                            1,
                            2,
                            10,
                            "Black",
                            true);

        }

        catch (InvalidShapeException e) {

            System.out.println(
                    "Exception caught: "
                    + e.getMessage());
        }
    }

    public static void printAreas(
            Shape[] shapes) {

        for (Shape s : shapes) {

            System.out.printf(
                    "%s Area = %.2f%n",
                    s,
                    s.getArea());
        }
    }

    public static Shape largest(
            Shape[] shapes) {

        Shape largest = shapes[0];

        for (int i = 1;
             i < shapes.length;
             i++) {

            if (shapes[i].getArea() >
                    largest.getArea()) {

                largest = shapes[i];
            }
        }

        return largest;
    }
}