package _08final_raster.mvc.model;

import _08final_raster.mvc.model.Sprite;

import javax.swing.*;
import java.awt.*;

/**
 * Created by John on 5/28/2016.
 */
public class Bush2 extends Sprite {
    private Image imgBush2 = new ImageIcon(Sprite.strImageDir + "Bush2.gif").getImage();

    public Bush2(int nCenterX, int nCenterY){
        super(nCenterX,nCenterY);
        setTeam(Team.BACKGROUND);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(imgBush2,getCenter().x,getCenter().y,null);
    }

}
