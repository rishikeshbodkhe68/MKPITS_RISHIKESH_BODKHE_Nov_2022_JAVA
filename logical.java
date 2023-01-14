package javaProgram;
public class logical {
public static void main(String[] args)
{
 int x = 20, y = 40, z = 50;
 if((y > x) && (y < z)) //
   System.out.println("y is greater than x but smaller than z");

 if((x < y) && (y < z))
   System.out.println("z is greater than x, y");

 if((x < y) && (y < z))
  System.out.println("x is smaller than y, z");
 }
}
