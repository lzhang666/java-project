package _03objects.P8_19;

public class Canonball {
    private double xPos;
    private double yPos = 0;
    private double xVel;
    private double yVel;

    public Canonball(double xPosition){
        xPos = xPosition;
    }

    //update position and velocity
    public void move(double sec){
        xPos = xPos + xVel * sec;
        yPos = yPos + (yVel * sec + 0.5*(-9.81)*sec*sec);
        yVel = yVel + (-9.81*sec);
    }

    public double getX(){
        return xPos;
    }

    public double getY(){
        return yPos;
    }

    public void shoot(double angle, double initVel){
        double radAngle = angle * Math.PI/180;
        xVel = initVel * Math.cos(radAngle);
        yVel = initVel * Math.sin(radAngle);
        double time = 0;
        while (yPos >= 0){
            move(0.1);
            //System.out.println(getX()+" "+getY());
            System.out.printf("x position: %.1f; y position: %.1f", getX(), getY());
            System.out.println();
        }
    }





}
