import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final  Class NEXT_LEVEL = Win.class;
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    
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

        removeObject(brickWall10);
        removeObject(brickWall4);
        removeObject(trapDoor4);
        removeObject(brickWall9);
        removeObject(brickWall8);
        removeObject(brickWall7);
        removeObject(trapDoor3);
        removeObject(brickWall6);
        removeObject(trapDoor);
        removeObject(brickWall5);
        removeObject(brickWall2);
        removeObject(brickWall3);
        removeObject(trapDoor2);
        removeObject(brickWall);
        door2.setLocation(1180,79);
        BrickWall brickWall11 = new BrickWall();
        addObject(brickWall11,1144,162);
        BrickWall brickWall12 = new BrickWall();
        addObject(brickWall12,1041,161);
        brickWall12.setLocation(1039,158);
        brickWall12.setLocation(1055,165);
        brickWall12.setLocation(1078,162);
        brickWall12.setLocation(1065,161);
        removeObject(brickWall12);
        removeObject(brickWall11);
        Brick brick = new Brick();
        addObject(brick,1194,144);
        brick.setLocation(1161,122);
        brick.setLocation(1142,134);
        brick.setLocation(1103,152);
        door2.setLocation(1170,94);
        Brick brick2 = new Brick();
        addObject(brick2,532,311);
        brick2.setLocation(1066,670);
        brick2.setLocation(943,662);
        BrickWall brickWall13 = new BrickWall();
        addObject(brickWall13,526,742);
        TrapDoor trapDoor5 = new TrapDoor(0);
        addObject(trapDoor5,656,511);
        powerup9.setLocation(489,409);
        BrickWall brickWall14 = new BrickWall();
        addObject(brickWall14,533,509);
        brickWall14.setLocation(535,509);
        brickWall14.setLocation(519,512);
        brickWall14.setLocation(539,507);
        brickWall14.setLocation(549,500);
        brickWall14.setLocation(552,498);
        brickWall14.setLocation(547,502);
        brickWall14.setLocation(684,503);
        trapDoor5.setLocation(866,558);
        trapDoor5.setLocation(1082,498);
        Brick brick3 = new Brick();
        addObject(brick3,417,483);
        brick3.setLocation(1,473);
        brick3.setLocation(0,497);
        brick3.setLocation(46,478);
        brick3.setLocation(104,474);
        brick3.setLocation(62,482);
        brickWall14.setLocation(856,571);
        brickWall14.setLocation(732,542);
        brickWall14.setLocation(598,556);
        TrapDoor trapDoor6 = new TrapDoor(0);
        addObject(trapDoor6,843,398);
        powerup6.setLocation(938,475);
        BrickWall brickWall15 = new BrickWall();
        addObject(brickWall15,420,358);
        TrapDoor trapDoor7 = new TrapDoor(0);
        addObject(trapDoor7,678,304);
        TrapDoor trapDoor8 = new TrapDoor(0);
        addObject(trapDoor8,822,216);
        BrickWall brickWall16 = new BrickWall();
        addObject(brickWall16,266,254);
        brick3.setLocation(216,523);
        BrickWall brickWall17 = new BrickWall();
        addObject(brickWall17,498,200);
        BrickWall brickWall18 = new BrickWall();
        addObject(brickWall18,704,146);
        powerup8.setLocation(252,463);
        powerup9.setLocation(152,468);
        powerup10.setLocation(932,113);
        powerup7.setLocation(1004,109);
        powerup6.setLocation(847,346);
        powerup5.setLocation(692,272);
        powerup4.setLocation(623,504);
        powerup3.setLocation(845,619);
        powerup2.setLocation(530,712);
        powerup.setLocation(427,315);
        powerup5.setLocation(696,100);
        powerup10.setLocation(928,117);
        powerup6.setLocation(502,166);
    }

    public void act(){
        spawn();
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0005)
        {
            addObject(new Rock(GRAVITY),Greenfoot.getRandomNumber(2100), -30);
        }
        
    }
}
