package _08final.mvc.model;

import java.awt.*;
import java.util.ArrayList;

public class LaserWave extends Sprite {
    private final double FIRE_POWER = 20.0;
    private final int MAX_EXPIRE = 25;



    public LaserWave(Falcon fal, boolean bool) {

        super();
        setTeam(Team.FRIEND);

        //defined the points on a cartesean grid
        ArrayList<Point> pntCs = new ArrayList<Point>();

        if(bool == true){
            pntCs.add(new Point(0,3)); //top point
            pntCs.add(new Point(20,0)); //right
            pntCs.add(new Point(0,1)); //bottom
            pntCs.add(new Point(-20,0)); //left
        }
        else{
            pntCs.add(new Point(0,-1)); //top point
            pntCs.add(new Point(20,0)); //right
            pntCs.add(new Point(0,-3)); //bottom
            pntCs.add(new Point(-20,0)); //left
        }



        assignPolarPoints(pntCs);

        //a bullet expires after 20 frames
        setExpire( 20 );
        setRadius(50);
        setColor(Color.RED);


        //everything is relative to the falcon ship that fired the bullet
        //fire forward
        if(bool == true){
            setDeltaX( fal.getDeltaX() +
                    Math.cos( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
            setDeltaY( fal.getDeltaY() +
                    Math.sin( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
        }
        //fire backward
        else{
            setDeltaX( fal.getDeltaX() -
                    Math.cos( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
            setDeltaY( fal.getDeltaY() -
                    Math.sin( Math.toRadians( fal.getOrientation() ) ) * FIRE_POWER );
        }
        setCenter( fal.getCenter() );


        //set the bullet orientation to the falcon (ship) orientation
        setOrientation(fal.getOrientation());


    }

    @Override
    public void move(){

        super.move();

        if (getExpire() == 0)
            CommandCenter.getInstance().getOpsList().enqueue(this, CollisionOp.Operation.REMOVE);
        else
            setExpire(getExpire() - 1);

    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.red);
        g.fillPolygon(getXcoords(), getYcoords(), dDegrees.length);
    }


}
