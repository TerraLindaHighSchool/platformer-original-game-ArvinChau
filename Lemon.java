import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lemon extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    /**
     * Act - do whatever the Bomb1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Lemon(float gravity)
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
