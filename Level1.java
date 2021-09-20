import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(player.class, platform.class, obstacle.class, collectable.class,
            door.class, HUD.class);
        collectable collectable = new collectable();
        addObject(collectable,258,370);
        door door = new door();
        addObject(door,574,40);
        obstacle obstacle = new obstacle();
        addObject(obstacle,171,88);
        player player = new player();
        addObject(player,24,364);
    }
}
