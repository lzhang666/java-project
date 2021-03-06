package _08final.mvc.model;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

import _08final.mvc.controller.Game;

public class Debris extends Sprite{


    //radius of a large debris
    private final int RAD = 40;
    private final int MAX_EXPIRE = 100;



    public Debris(Asteroid astExploded){

        //call Sprite constructor
        super();
        setTeam(Team.DEBRIS);
        setColor(Color.GREEN);
        setExpire(MAX_EXPIRE);
        int  nSizeNew =	astExploded.getSize() + 1;


        //random delta-x
        int nDX = Game.R.nextInt(10 + nSizeNew*2);
        if(nDX %2 ==0)
            nDX = -nDX;
        setDeltaX(nDX);

        //random delta-y
        int nDY = Game.R.nextInt(10+ nSizeNew*2);
        if(nDY %2 ==0)
            nDY = -nDY;
        setDeltaY(nDY);

        assignRandomShape();

        //an nSize of zero is a big asteroid
        //a nSize of 1 or 2 is med or small asteroid respectively

        setRadius(RAD/(nSizeNew * 2));
        setCenter(astExploded.getCenter());

    }



    //this is for an asteroid only
    public void assignRandomShape ()
    {
        int nSide = Game.R.nextInt( 7 ) + 7;
        int nSidesTemp = nSide;

        int[] nSides = new int[nSide];
        for ( int nC = 0; nC < nSides.length; nC++ )
        {
            int n = nC * 48 / nSides.length - 4 + Game.R.nextInt( 8 );
            if ( n >= 48 || n < 0 )
            {
                n = 0;
                nSidesTemp--;
            }
            nSides[nC] = n;
        }

        Arrays.sort( nSides );

        double[]  dDegrees = new double[nSidesTemp];
        for ( int nC = 0; nC <dDegrees.length; nC++ )
        {
            dDegrees[nC] = nSides[nC] * Math.PI / 24 + Math.PI / 2;
        }
        setDegrees( dDegrees);

        double[] dLengths = new double[dDegrees.length];
        for (int nC = 0; nC < dDegrees.length; nC++) {
            if(nC %3 == 0)
                dLengths[nC] = 1 - Game.R.nextInt(40)/100.0;
            else
                dLengths[nC] = 1;
        }
        setLengths(dLengths);

    }


    @Override
    public void move() {

        super.move();

        if (getExpire() < MAX_EXPIRE -5){
            setDeltaX(getDeltaX() * 1.07);
            setDeltaY(getDeltaY() * 1.07);
        }


        if (getExpire() == 0)
            CommandCenter.getInstance().getOpsList().enqueue(this, CollisionOp.Operation.REMOVE);

        else
            setExpire(getExpire() - 1);

    }

    //method to return random number for coloring
    public float randCol(){
        Random rand = new Random();
        return rand.nextInt(255);
    }

}
