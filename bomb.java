import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
      public bomb(float gravity)
    {
        GRAVITY = gravity;
    }

    public void act()
    {

    }

    protected void fall()
    { 
     if(!isOnGround())
     {
        yVelocity += GRAVITY;
        setLocation(getX(), getY() + (int) yVelocity);
     }
    }
}