interface circle
{
    int r=5;
    default void c_area()
    {
        float c_a=3.14f*r*r;
        System.out.println("Area of circle = "+c_a);
    }
}
interface rectangle
{
    int l=10,b=15;
    default void r_area()
    {
        int r_a=l*b;
        System.out.println("Area of rectangle = "+r_a);
    }
}
interface triangle
{
    int ba=12,he=10;
    default void t_area()
    {
        double t_a=0.5*ba*he;
        System.out.println("Area of triangle = "+t_a);
    }
}
class test implements circle,rectangle,triangle
{
    public static void main(String[]args)
    {
        test t=new test();
        t.c_area();
        t.r_area();
        t.t_area();
    }
}
