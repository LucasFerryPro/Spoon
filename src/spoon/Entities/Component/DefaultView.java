package spoon.Entities.Component;

import javax.swing.*;
import java.awt.*;

import static spoon.Entities.Component.Pivot.*;

public class DefaultView {

    private Image image;
    private Pivot pivot;

    public DefaultView(String imagePath) {
        this(imagePath, TOP_RIGHT);
    }

    public DefaultView(String imagePath, Pivot pivot) {
        this.pivot = pivot;
        ImageIcon icon = new ImageIcon("public\\" + imagePath);
        this.image = icon.getImage();
    }

    public void resizeImage(double sizeW, double sizeH){
        int originalWidth = this.image.getWidth(null);
        int originalHeight = this.image.getHeight(null);
        int newWidth = (int) (originalWidth * sizeW);
        int newHeight = (int) (originalHeight * sizeH);
        this.image = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    }

    public void render(Graphics g, int x, int y) {
        int imageWidth = image.getWidth(null);
        int imageHeight = image.getHeight(null);

        switch (pivot) {
            case TOP_LEFT:
                // Ne rien changer pour TOP_LEFT, le point d'origine est déjà en haut à gauche
                break;
            case TOP_CENTER:
                x -= imageWidth / 2;
                break;
            case TOP_RIGHT:
                x -= imageWidth;
                break;
            case CENTER_LEFT:
                y -= imageHeight / 2;
                break;
            case CENTER:
                x -= imageWidth / 2;
                y -= imageHeight / 2;
                break;
            case CENTER_RIGHT:
                x -= imageWidth;
                y -= imageHeight / 2;
                break;
            case BOTTOM_LEFT:
                y -= imageHeight;
                break;
            case BOTTOM_CENTER:
                x -= imageWidth / 2;
                y -= imageHeight;
                break;
            case BOTTOM_RIGHT:
                x -= imageWidth;
                y -= imageHeight;
                break;
        }

        g.drawImage(image, x, y, null);
    }

    public Pivot getPivot(){
        return this.pivot;
    }

    public void setPivot(Pivot pivot){
        this.pivot = pivot;
    }
}
