import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class acidRain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AcidRain extends Obstacle
{
    /**
     * Act - do whatever the acidRain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private float yVelocity;
    private final float GRAVITY;
    
      public AcidRain(float gravity)
    {
        GRAVITY = gravity;
    }

    public void act()
    {
    fall();
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
