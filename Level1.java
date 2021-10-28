import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 20;
    private final  Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();

    }

    public void act()
    {
        spawn();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectables.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,574,40);
        addObject(new Floor(), 600, 800);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player, 25, 760);
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

        door2.setLocation(550,31);
        BrickWall brickWall11 = new BrickWall();
        addObject(brickWall11,935,228);
        trapDoor4.setLocation(1150,311);
        trapDoor4.setLocation(1156,312);
        brickWall11.setLocation(1118,280);
        BrickWall brickWall12 = new BrickWall();
        addObject(brickWall12,887,211);
        trapDoor.setLocation(226,468);
        BrickWall brickWall13 = new BrickWall();
        addObject(brickWall13,661,173);

        Brick brick = new Brick();
        addObject(brick,176,362);
        removeObject(brickWall6);
        Brick brick2 = new Brick();
        addObject(brick2,445,530);
        powerup9.setLocation(562,460);
        brick2.setLocation(576,499);
        powerup9.setLocation(565,478);
        trapDoor.setLocation(210,434);
        Brick brick3 = new Brick();
        addObject(brick3,688,320);
        removeObject(brick3);
        brick2.setLocation(397,523);
        removeObject(brickWall5);
        removeObject(trapDoor2);
        removeObject(brickWall2);
        removeObject(brickWall3);
        removeObject(brickWall7);
        removeObject(brickWall4);
        removeObject(brickWall);
        removeObject(brickWall10);
        removeObject(brickWall8);
        removeObject(trapDoor3);
        removeObject(brickWall13);
        removeObject(trapDoor);
        removeObject(trapDoor4);
        removeObject(brickWall9);
        removeObject(brickWall11);
        removeObject(brickWall12);
        door2.setLocation(1169,204);
        brick.setLocation(841,158);
        brick.setLocation(800,168);
        removeObject(brick2);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,180,572);
        smBrickWall.setLocation(66,629);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,278,522);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,82,458);
        smBrickWall3.setLocation(72,413);
        TrapDoor trapDoor5 = new TrapDoor(0);
        addObject(trapDoor5,516,436);
        TrapDoor trapDoor6 = new TrapDoor(0);
        addObject(trapDoor6,753,352);
        TrapDoor trapDoor7 = new TrapDoor(0);
        addObject(trapDoor7,320,301);
        BrickWall brickWall14 = new BrickWall();
        addObject(brickWall14,23,279);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,278,182);
        TrapDoor trapDoor8 = new TrapDoor(0);
        addObject(trapDoor8,995,318);
        smBrickWall4.setLocation(233,225);
        trapDoor7.setLocation(400,333);
        smBrickWall4.setLocation(314,228);
        trapDoor7.setLocation(342,356);
        brick.setLocation(717,188);
        powerup10.setLocation(292,476);
        powerup.setLocation(93,570);
        powerup3.setLocation(520,402);
        powerup9.setLocation(365,317);
        powerup8.setLocation(732,326);
        powerup5.setLocation(990,292);
        powerup5.setLocation(986,282);
        powerup6.setLocation(331,197);
        powerup4.setLocation(40,233);
        powerup2.setLocation(49,583);
        powerup7.setLocation(679,132);
    }

    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY),Greenfoot.getRandomNumber(2100), -30);
        }

    }
}
