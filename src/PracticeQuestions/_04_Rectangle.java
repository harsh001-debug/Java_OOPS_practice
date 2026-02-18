package PracticeQuestions;

/* 6. Create a class Rectangle with attributes length and width,
      each defaulting to 1. The class should include set and get
      methods for both attributes, and a method to calculate the area of the rectangle.
*/
class _04_Rectangle {
    private double length;
    private double width;

    _04_Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    _04_Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    void getLength(){
        System.out.println("Length : "+this.length);
    }
    void getWidth(){
        System.out.println("Width : "+this.width);
    }

    void areaOfRectangle(){
        double area = this.length * this.width;
        System.out.println("Area of Rectangle : " + area);
    }
    public static void main(String[] args) {

        _04_Rectangle r1 = new _04_Rectangle();
        r1.getLength();
        r1.getWidth();
        r1.areaOfRectangle();


        _04_Rectangle r2 = new _04_Rectangle(5,7);
        r2.getLength();
        r2.getWidth();
        r2.areaOfRectangle();
    }
}

/* ------------>>>>>>>>>>OUTPUT<<<<<<<<<<<<-----------------

Length : 1.0
Width : 1.0
Area of Rectangle : 1.0
Length : 5.0
Width : 7.0
Area of Rectangle : 35.0

 */
