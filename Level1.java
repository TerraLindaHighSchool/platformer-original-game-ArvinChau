import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
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
        setPaintOrder(player.class, platform.class, Obstacle.class, collectables.class,
            door.class, HUD.class);
        door door = new door();
        addObject(door,574,40);
        addObject(new Floor(), 600, 800);

        BrickWall brickWall = new BrickWall();
        addObject(brickWall,435,282);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,269,233);
        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,435,144);
        BrickWall brickWall4 = new BrickWall();
        addObject(brickWall4,286,88);
        BrickWall brickWall5 = new BrickWall();
        addObject(brickWall5,436,62);
        door door2 = new door();
        addObject(door2,473,1);
        Gems gems = new Gems();
        addObject(gems,227,198);
        Gems gems2 = new Gems();
        addObject(gems2,475,245);
        Gems gems3 = new Gems();
        addObject(gems3,429,109);
        addObject(new bomb(GRAVITY),476,104);
        addObject(new bomb(GRAVITY),235,43);
        Gems gems4 = new Gems();
        addObject(gems4,245,373);
        addObject(new trapDoor(GRAVITY),469,349);

    }

    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }

    }
}
