import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;

import javax.swing.*;
import javax.imageio.*;

import java.io.*;

import java.awt.geom.*;

public class Ball extends Machine {
   private double radius;

   public Ball(double x, double y, double xVel, double yVel, double radius) {
      super(x, y, xVel, yVel);
      this.radius = radius;
   }
   
  public Ball(Ball o) {
      super(o.getX(), o.getY(), o.getXVel(), o.getYVel());
      this.radius = o.getRadius();
   }

   /*public int xToYLower(double x) {
      x += getX();
      return m.getY() - Math.pow(Math.pow(radius, 2) - Math.pow(x, 2));
   }*/
 
   public void draw(Graphics g, int width, int height) {
      g.fillOval(((int)getX() - (int)radius), 
                 (height - (int)getY() - (int)radius), 
                 (int)radius * 2, 
                 (int)radius * 2);
   }

   public double getRadius() {
      return radius;
   }

   public String getType() {
       return "ball";
   }
}
