import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Princess(), 80, 80);
        aparecer();
    }
    public void act(){
        if(Greenfoot.mouseClicked(null)){
            crearFlor();
            crearArbusto();
            crearArbusto();
        }
    }
    
    public void aparecer(){
        for(int i = 0; i<5; i++){
           crearArbusto();
        }
        for(int i = 0; i<10; i++){
            crearFlor();
        }
            
    }
    
    public void crearArbusto(){
        Random rd = new Random();
        Enemy arbusto = new Enemy();
        addObject(arbusto, rd.nextInt(400) +120,rd.nextInt(250)+100);
    }
    
    public void crearFlor(){
        Random rd = new Random();
        Flower flor = new Flower();
        addObject(flor, rd.nextInt(400)+120, rd.nextInt(250)+100);
        
    }
    
    
}
