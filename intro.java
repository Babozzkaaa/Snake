import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        katakintro katakintro = new katakintro();
        addObject(katakintro,564,167);
        start start = new start();
        addObject(start,554,449);
        ular ular = new ular();
        addObject(ular,370,207);
        ular.setLocation(370,196);
        katakintro.setLocation(577,185);
        ular.setLocation(288,219);
        removeObject(ular);
        removeObject(katakintro);
        start.setLocation(646,470);
        start.setLocation(534,430);
        start.setLocation(536,460);
        start.setLocation(554,434);
        start.setLocation(683,450);
        start.setLocation(613,448);
        start.setLocation(472,465);
        start.setLocation(577,481);
        katakintro katakintro2 = new katakintro();
        addObject(katakintro2,142,235);
        portal portal = new portal();
        addObject(portal,454,95);
        katakintro2.setLocation(210,274);
        batu1 batu1 = new batu1();
        addObject(batu1,73,211);
        batu1 batu12 = new batu1();
        addObject(batu12,101,201);
        batu1 batu13 = new batu1();
        addObject(batu13,121,196);
        batu1 batu14 = new batu1();
        addObject(batu14,189,192);
        batu1 batu15 = new batu1();
        addObject(batu15,155,192);
        batu1 batu16 = new batu1();
        addObject(batu16,224,202);
        batu1 batu17 = new batu1();
        addObject(batu17,209,196);
        batu1 batu18 = new batu1();
        addObject(batu18,268,262);
        batu1 batu19 = new batu1();
        addObject(batu19,257,236);
        batu1 batu110 = new batu1();
        addObject(batu110,247,213);
        batu1 batu111 = new batu1();
        addObject(batu111,269,320);
        batu1 batu112 = new batu1();
        addObject(batu112,271,285);
        katakintro2.setLocation(113,304);
        ular ular2 = new ular();
        addObject(ular2,35,446);
        portal.setLocation(306,142);
        ular2.setLocation(23,453);
        ular2.setLocation(31,434);
        removeObject(ular2);
        ularintro ularintro = new ularintro();
        addObject(ularintro,79,406);
        ularintro.setLocation(69,403);
        katakintro2.setLocation(179,289);
    }
    
}
