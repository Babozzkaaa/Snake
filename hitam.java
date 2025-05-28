import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hitam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hitam extends World
{

    /**
     * Constructor for objects of class hitam.
     * 
     */
    public hitam()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1); 
        showText("Game Over",575, 200);
        showText("tekan M untuk Kembali ke menu utama", 375,300);
        showText("tekan Enter untuk Merestart Game", 800,300);
    }
    public void act() {
    if (Greenfoot.isKeyDown("enter")) {
        Greenfoot.setWorld(new MyWorld());
    }
    if (Greenfoot.isKeyDown("m") || Greenfoot.isKeyDown("M")) {
        Greenfoot.setWorld(new intro());
    }
}
    
}
