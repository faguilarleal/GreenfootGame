import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Princess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Princess extends Actor
{
    int vidas = 3;
    /**
     * Act - do whatever the Princess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Princess(){
        GreenfootImage image = getImage();
        image.scale(20,50);
        setImage(image); 
    
    }
    
    public void act()
    {
        // Add your action code here.
        mover();
        cortarArbusto();
        perder();
    }
    
    public void mover(){
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
        }
    }
    
    public void cortarArbusto(){
        Actor foundArbusto = getOneIntersectingObject(Enemy.class);
        if(isTouching(Enemy.class)){
            getWorld().removeObject(foundArbusto);
        }
    
    }
    
    public void perder(){
        Actor foundFlower = getOneIntersectingObject(Flower.class);
        if(vidas ==0){
            getWorld().removeObject(this);
        }
        else{
            if(isTouching(Flower.class)){
                this.vidas --;
                getWorld().removeObject(foundFlower);
            }
        }
        }
        
    }
    
    
    

