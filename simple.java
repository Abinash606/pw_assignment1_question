public class simple{
  public static void main(String[] args){
  // Q1 - Take Two Integer And Product Of Two Number.
        int x = 10;
        int y = 20;
        int product = (x*y);
        System.out.println(product);
  // Q2 -  Print The ASCII value of Character 'U'.
          int x1 = 'U';
        System.out.println(x1);
  //  Q3 - Write a program to take length and Breadth of a rectangle and print the area.
         int length = 7;
         int breadth = 4;
         int area = (length * breadth);
         System.out.println(area);
   //  Q4 - Write a Java program to calculate the cube of a number.
         int number = 4;
         int cube = (number*number*number);
         System.out.println(cube);
  // Q5 - Write a Java program to swap two numbers with the help of a third variable.
        int x2 = 10;
        int y2 = 20;
        System.out.println("Before Swap The Number are : "+ x2 );
        System.out.println("Before Swap The Number are : "+ y2);
        int temp;
        temp = x2;
        x2 = y2;
        y2 = temp;
        System.out.println("After Swap The Number are : "+ x2 );
        System.out.println("After Swap The Number are :" + y2); 
       
}
}
