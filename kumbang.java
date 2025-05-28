import greenfoot.*;

public class kumbang extends Actor {
    private int spd = 1; // adjust 1 - 5 bebas

    public void act() {
        if (cek()) {
            move(spd);
        } else {
            rotasi();
        }
    }

    private boolean cek() {
    int xDepan = (int) (getX() + Math.cos(Math.toRadians(getRotation())) * spd);
    int yDepan = (int) (getY() + Math.sin(Math.toRadians(getRotation())) * spd);
    int worldWidth = getWorld().getWidth();
    int worldHeight = getWorld().getHeight();

    boolean isWithinWorldBounds = xDepan > 0 && xDepan < worldWidth - 1 && yDepan > 0 && yDepan < worldHeight - 1;
    boolean isNoCollision = getWorld().getObjectsAt(xDepan, yDepan, batu1.class).isEmpty();

    return isWithinWorldBounds && isNoCollision;
}

    private void rotasi() {
        int rotasiSaatIni = getRotation();
        int rotasiBaru = rotasiSaatIni;

        setRotation(rotasiSaatIni - 90);
        if (cek()) {
            return;
        }

        setRotation(rotasiSaatIni);

        setRotation(rotasiSaatIni + 90);
        if (cek()) {
            return;
        }

        setRotation(rotasiSaatIni);
    }
}
