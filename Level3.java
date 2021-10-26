import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 4.5f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final  Class NEXT_LEVEL = Level4.class;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectables.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,574,40);
        addObject(new Floor(), 600, 800);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player, 55, 755);

        BrickWall brickWall = new BrickWall();
        addObject(brickWall,366,735);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,574,676);
        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,789,742);
        BrickWall brickWall4 = new BrickWall();
        addObject(brickWall4,704,605);
        BrickWall brickWall5 = new BrickWall();
        addObject(brickWall5,445,602);
        BrickWall brickWall6 = new BrickWall();
        addObject(brickWall6,578,530);
        BrickWall brickWall7 = new BrickWall();
        addObject(brickWall7,805,530);
        BrickWall brickWall8 = new BrickWall();
        addObject(brickWall8,916,472);
        BrickWall brickWall9 = new BrickWall();
        addObject(brickWall9,1014,414);
        BrickWall brickWall10 = new BrickWall();
        addObject(brickWall10,720,456);
        Powerup powerup = new Powerup();
        addObject(powerup,361,698);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,805,705);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,568,642);
        Powerup powerup4 = new Powerup();
        addObject(powerup4,700,567);
        Powerup powerup5 = new Powerup();
        addObject(powerup5,801,492);
        Powerup powerup6 = new Powerup();
        addObject(powerup6,912,437);
        Powerup powerup7 = new Powerup();
        addObject(powerup7,999,378);
        Powerup powerup8 = new Powerup();
        addObject(powerup8,717,422);
        Powerup powerup9 = new Powerup();
        addObject(powerup9,566,497);
        Powerup powerup10 = new Powerup();
        addObject(powerup10,446,566);
        TrapDoor trapDoor = new TrapDoor(0);
        addObject(trapDoor,1051,352);

        brickWall8.setLocation(910,458);
        powerup6.setLocation(917,422);

        door.setLocation(1000,556);
        door.setLocation(1048,764);

        removeObject(door);
        TrapDoor trapDoor2 = new TrapDoor(0);
        addObject(trapDoor2,288,656);
        trapDoor2.setLocation(573,745);
        TrapDoor trapDoor3 = new TrapDoor(0);
        addObject(trapDoor3,804,368);
        trapDoor.setLocation(416,519);
        Door door2 = new Door();
        addObject(door2,1048,351);
        door2.setLocation(1166,332);
        TrapDoor trapDoor4 = new TrapDoor(0);
        addObject(trapDoor4,1130,408);
        trapDoor4.setLocation(1138,404);
        trapDoor4.setLocation(1148,400);
        door2.setLocation(1172,344);
        door2.setLocation(1166,366);
        door2.setLocation(1165,339);
        door2.setLocation(1156,370);
        door2.setLocation(1148,347);
        door2.setLocation(1167,310);

        removeObject(trapDoor3);
        removeObject(brickWall10);
        removeObject(brickWall6);
        removeObject(trapDoor);
        removeObject(brickWall5);
        removeObject(brickWall);
        removeObject(trapDoor2);
        removeObject(brickWall3);
        removeObject(brickWall2);
        removeObject(brickWall4);
        removeObject(brickWall7);
        removeObject(brickWall8);
        removeObject(trapDoor4);
        removeObject(brickWall9);
        door2.setLocation(544,180);
        TrapDoor trapDoor5 = new TrapDoor(0);
        addObject(trapDoor5,739,234);
        trapDoor5.setLocation(738,328);
        BrickWall brickWall11 = new BrickWall();
        addObject(brickWall11,554,235);
        BrickWall brickWall12 = new BrickWall();
        addObject(brickWall12,406,308);
        BrickWall brickWall13 = new BrickWall();
        addObject(brickWall13,548,455);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,545,452);
        brickWall13.setLocation(547,456);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,1124,683);
        Brick brick = new Brick();
        addObject(brick,722,651);
        brick.setLocation(830,668);
        Brick brick2 = new Brick();
        addObject(brick2,192,659);
        powerup3.setLocation(624,526);
        brick.setLocation(484,659);
        TrapDoor trapDoor6 = new TrapDoor(0);
        addObject(trapDoor6,807,659);
        trapDoor6.setLocation(767,652);
        trapDoor6.setLocation(810,656);
        trapDoor6.setLocation(796,650);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,1025,588);
        removeObject(smBrickWall3);
        BrickWall brickWall14 = new BrickWall();
        addObject(brickWall14,2,534);
        brickWall14.setLocation(83,534);
        BrickWall brickWall15 = new BrickWall();
        addObject(brickWall15,199,424);
        brickWall12.setLocation(348,532);
        powerup9.setLocation(554,422);
        powerup3.setLocation(375,486);
        powerup10.setLocation(225,382);
        powerup4.setLocation(602,610);
        powerup5.setLocation(211,604);
        powerup8.setLocation(741,284);
        powerup6.setLocation(96,484);
        powerup7.setLocation(1065,640);
        TrapDoor trapDoor7 = new TrapDoor(0);
        addObject(trapDoor7,399,340);
        TrapDoor trapDoor8 = new TrapDoor(0);
        addObject(trapDoor8,988,524);
        trapDoor8.setLocation(792,460);
        door2.setLocation(553,125);
        brickWall11.setLocation(552,180);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,961,231);
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,773,142);
        SmBrickWall smBrickWall6 = new SmBrickWall();
        addObject(smBrickWall6,278,212);
        smBrickWall6.setLocation(342,217);
        brickWall11.setLocation(576,221);
        door2.setLocation(582,178);
        removeObject(trapDoor5);
        SmBrickWall smBrickWall7 = new SmBrickWall();
        addObject(smBrickWall7,757,322);
    }

    public void act(){
        spawn();
    }
    
    private void spawn()
    {
        if(Math.random() < 0.00025)
        {
            addObject(new Rock(GRAVITY),Greenfoot.getRandomNumber(2100), -30);
        }
        
    }
}
