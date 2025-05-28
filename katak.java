import greenfoot.*;

public class katak extends Actor {
    private int hp;
    public static int level = 1;

    public katak() {
        hp = 3;
        GreenfootImage myImage = getImage();
        int tinggiBaru = (int) myImage.getHeight() / 2;
        int lebarBaru = (int) myImage.getWidth() / 2;
        myImage.scale(tinggiBaru, lebarBaru);
    }

    public void act() {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
            setRotation(0);
            Actor batu1 = getOneIntersectingObject(batu1.class);
            if (batu1 != null) {
                setLocation(getX() - 4, getY());
            }
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
            setRotation(180);
            Actor batu1 = getOneIntersectingObject(batu1.class);
            if (batu1 != null) {
                setLocation(getX() + 4, getY());
            }
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
            setRotation(90);
            Actor batu1 = getOneIntersectingObject(batu1.class);
            if (batu1 != null) {
                setLocation(getX(), getY() - 4);
            }
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
            setRotation(-90);
            Actor batu1 = getOneIntersectingObject(batu1.class);
            if (batu1 != null) {
                setLocation(getX(), getY() + 4);
            }
        }
        hit();
        tersentuh();
        levelup();
    }

    public void hit() {
        Actor kumbang = getOneIntersectingObject(kumbang.class);
        if (kumbang != null) {
            getWorld().removeObject(kumbang);
            MyWorld.tambahPoint(1);
            getWorld().showText("point:" + MyWorld.getPoint(), 41, 51);
        }
    }

    private void tersentuh() {
        if (isTouching(ular.class)) {
            setLocation(15, 550);
            hp--;
            getWorld().showText("HP :" + hp, 32, 32);
            if (hp < 1) {
                endGame();
            }
        }
    }

    private void endGame() {
        Greenfoot.stop();
        MyWorld.restartPoint();
        GameOver();
    }

    private void GameOver() {
        Greenfoot.setWorld(new hitam());
    }

    public void levelup() {
        Actor portal = getOneIntersectingObject(portal.class);
        if (portal != null) {
            int now = MyWorld.getPoint();
            if (level == 1) {
                level = 2;
                Greenfoot.setWorld(new level2());
            } else if (level == 2) {
                level = 3;
                Greenfoot.setWorld(new level3());
            } else if (level == 3) {
                level = 4;
                Greenfoot.setWorld(new putih());
            }
            MyWorld.setPoint(now);
        }
    }
}
