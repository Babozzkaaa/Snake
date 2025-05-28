import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ular extends Actor
{
    /**
     * Act - do whatever the ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(2);
        if(Greenfoot.getRandomNumber(100)<11){
            if(Greenfoot.getRandomNumber(100)<50){
                turn(Greenfoot.getRandomNumber(31));
            }else{
                turn(0-Greenfoot.getRandomNumber(31));
            }
        }
    }
    public void damage(){
        if(isTouching(katak.class)){
            removeTouching(katak.class);
            
        }
        
    }
    
}
