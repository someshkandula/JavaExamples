package com.somesh.examples.overloadride;
class CalculateArea{
      void Area(int length){System.out.println(length*2);}
      void Area(int length , int width){System.out.println(length*width);}
      public static void main(String args[]){
      CalculateArea obj=new CalculateArea();
      obj.Area(10);   // Area of a Square
      obj.Area(20,20);  // Area of a Rectangle
      }
}