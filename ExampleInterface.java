interface Form {
    double calculateArea();
}

class Circle implements Form {
    private double ray;

    // ...

    @Override
    public double calculateArea() {
        return Math.PI * ray * ray;
    }
}

