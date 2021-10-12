import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final  Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    private void prepare(){
        setPaintOrder(Player.class, platform.class, Obstacle.class, collectables.class,
            door.class, HUD.class);
        door door = new door();
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
        trapDoor trapDoor = new trapDoor(0);
        addObject(trapDoor,1051,352);
        bomb bomb = new bomb(0);
        addObject(bomb,679,410);
        bomb bomb2 = new bomb(0);
        addObject(bomb2,524,490);
        bomb.setLocation(757,558);
        bomb2.setLocation(824,483);
        bomb2.setLocation(856,494);
        brickWall8.setLocation(910,458);
        powerup6.setLocation(917,422);
        bomb bomb3 = new bomb(0);
        addObject(bomb3,632,632);
        door.setLocation(1000,556);
        door.setLocation(1048,764);
        bomb.setLocation(616,490);
        addObject(new bomb(GRAVITY),730,418);
        removeObject(door);
        trapDoor trapDoor2 = new trapDoor(0);
        addObject(trapDoor2,288,656);
        trapDoor2.setLocation(573,745);
        trapDoor trapDoor3 = new trapDoor(0);
        addObject(trapDoor3,804,368);
        trapDoor.setLocation(416,519);
        door door2 = new door();
        addObject(door2,1048,351);
        door2.setLocation(1166,332);
        trapDoor trapDoor4 = new trapDoor(0);
        addObject(trapDoor4,1130,408);
        trapDoor4.setLocation(1138,404);
        trapDoor4.setLocation(1148,400);
        door2.setLocation(1172,344);
        door2.setLocation(1166,366);
        door2.setLocation(1165,339);
        door2.setLocation(1156,370);
        door2.setLocation(1148,347);
        door2.setLocation(1167,310);
        addObject(new bomb(GRAVITY),180,384);
    }
    public void act(){
        
    }
    
    private void spawn()
    {
        if(Math.random() < 0.00025)
        {
            addObject(new Rock(GRAVITY),Greenfoot.getRandomNumber(2100), -30);
        }
        
    }
}
