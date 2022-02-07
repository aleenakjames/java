abstract class Shape
{
            abstract void numberofsides();
}
class Rectangle extends Shape
{
            void numberofsides()
            {
                System.out.println("I am Rectangle, I have 4 sides");
            }
}
class Triangle extends Shape
{
            void numberofsides()
            {
                System.out.println("I am Triangle, I have 3 sides");
            }
}
class Hexagon extends Shape
{
            void numberofsides()
            {
               System.out.println("I am Hexagon, I have 6 sides");
            }
}
public class Main
{
    public static void main(String args[])
    {
        Shape s;
        s=new Rectangle();
        s.numberofsides();
        s=new Triangle();
        s.numberofsides();
        s=new Hexagon();
        s.numberofsides();      
                       
    }
}
