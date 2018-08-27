package pl.koziolekweb.ragecomicsmaker.event;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CropImageEvent {

    public final BufferedImage image;
    public final int startX;
    public final int startY;
    public final int endX;
    public final int endY;

    public CropImageEvent(BufferedImage image, int startX, int startY, int endX, int endY) {
        this.image = image;
        this.startY = startY;
        this.startX = startX;
        this.endX = endX;
        this.endY = endY;
    }
}
