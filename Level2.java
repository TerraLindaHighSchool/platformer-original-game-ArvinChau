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
    private final  Class NEXT_LEVEL = Level3.class;
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

        removeObject(brickWall9);
        removeObject(trapDoor4);
        removeObject(brickWall8);
        removeObject(trapDoor3);
        removeObject(brickWall10);
        removeObject(brickWall7);
        removeObject(brickWall4);
        removeObject(brickWall2);
        removeObject(trapDoor2);
        removeObject(brickWall);
        removeObject(brickWall3);
        removeObject(brickWall5);
        removeObject(brickWall6);
        removeObject(trapDoor);
        powerup8.setLocation(782,427);
        door2.setLocation(116,305);
        door2.setLocation(34,225);
        door2.setLocation(30,76);
        TrapDoor trapDoor5 = new TrapDoor(0);
        addObject(trapDoor5,160,143);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,0,138);
        trapDoor5.setLocation(125,134);
        trapDoor5.setLocation(188,131);
        trapDoor5.setLocation(214,136);
        trapDoor5.setLocation(155,169);
        smBrickWall.setLocation(368,127);
        trapDoor5.setLocation(27,136);
        trapDoor5.setLocation(54,134);
        smBrickWall.setLocation(154,138);
        trapDoor5.setLocation(567,321);
        smBrickWall.setLocation(128,132);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,36,409);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,994,688);
        smBrickWall3.setLocation(1166,684);
        powerup2.setLocation(670,288);
        powerup2.setLocation(564,280);
        powerup2.setLocation(41,359);
        smBrickWall2.setLocation(236,433);
        powerup2.setLocation(177,370);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,878,588);
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,683,522);
        SmBrickWall smBrickWall6 = new SmBrickWall();
        addObject(smBrickWall6,917,454);
        powerup6.setLocation(903,402);
        SmBrickWall smBrickWall7 = new SmBrickWall();
        addObject(smBrickWall7,1111,378);
        powerup5.setLocation(680,474);
        SmBrickWall smBrickWall8 = new SmBrickWall();
        addObject(smBrickWall8,448,465);
        powerup9.setLocation(461,430);
        trapDoor5.setLocation(441,354);
        TrapDoor trapDoor6 = new TrapDoor(0);
        addObject(trapDoor6,601,284);
        TrapDoor trapDoor7 = new TrapDoor(0);
        addObject(trapDoor7,358,189);
        trapDoor6.setLocation(601,268);
        SmBrickWall smBrickWall9 = new SmBrickWall();
        addObject(smBrickWall9,906,289);
        smBrickWall7.setLocation(1097,365);
        SmBrickWall smBrickWall10 = new SmBrickWall();
        addObject(smBrickWall10,1116,203);
        smBrickWall10.setLocation(1126,204);
        Brick brick = new Brick();
        addObject(brick,776,99);
        SmBrickWall smBrickWall11 = new SmBrickWall();
        addObject(smBrickWall11,426,90);
        powerup8.setLocation(642,63);
        powerup8.setLocation(650,60);
        powerup5.setLocation(598,226);
        powerup9.setLocation(366,144);
        powerup7.setLocation(904,242);
        powerup3.setLocation(835,550);
        powerup4.setLocation(672,476);
        powerup10.setLocation(926,412);
        powerup.setLocation(444,432);
        powerup10.setLocation(958,385);
        powerup6.setLocation(908,374);
        smBrickWall6.setLocation(931,427);
        smBrickWall9.setLocation(886,278);
        powerup7.setLocation(886,242);
        smBrickWall7.setLocation(1102,357);
        smBrickWall7.setLocation(1078,351);
        smBrickWall7.setLocation(1109,332);
        smBrickWall6.setLocation(920,418);
        smBrickWall9.setLocation(845,282);
        removeObject(smBrickWall10);
        removeObject(smBrickWall9);

        BrickWall brickWall11 = new BrickWall();
        addObject(brickWall11,883,256);
        powerup7.setLocation(883,230);
        powerup7.setLocation(857,264);
        powerup7.setLocation(872,202);
        BrickWall brickWall12 = new BrickWall();
        addObject(brickWall12,1143,190);
        removeObject(smBrickWall5);
        BrickWall brickWall13 = new BrickWall();
        addObject(brickWall13,646,516);
        smBrickWall7.setLocation(1118,292);
        brickWall11.setLocation(1099,216);
        removeObject(brickWall12);
        brickWall11.setLocation(1170,203);
        powerup7.setLocation(1176,155);
        smBrickWall4.setLocation(853,590);
        smBrickWall11.setLocation(408,91);
    }

    public void act(){
        spawn();
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0005)
        {
            addObject(new Lemon(GRAVITY),Greenfoot.getRandomNumber(2100), -30);
        }
        
    }
}
