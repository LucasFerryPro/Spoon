package spoon.Entities.Component;

import javax.swing.*;
import java.awt.*;

import static spoon.Entities.Component.Pivot.*;

public class View {

    private Image image;
    private double sizeW;
    private double sizeH;
    private Pivot pivot;

    public View(String imagePath) {
        this(imagePath,TOP_RIGHT, 1, 1);
    }

    public View(String imagePath, Pivot pivot) {
        this(imagePath, pivot, 1, 1);
    }

    public View(String imagePath, double sizeW, double sizeH) {
        this(imagePath, TOP_RIGHT, 1, 1);
    }

    public View(String imagePath, Pivot pivot, double sizeW, double sizeH) {
        this.sizeW = sizeW;
        this.sizeH = sizeH;
        this.pivot = pivot;
        ImageIcon icon = new ImageIcon("public\\" + imagePath);
        int originalWidth = icon.getIconWidth();
        int originalHeight = icon.getIconHeight();
        int newWidth = (int) (originalWidth * sizeW);
        int newHeight = (int) (originalHeight * sizeH);
        this.image = icon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    }

    public void resizeImage(){
        int originalWidth = image.getWidth(null);
        int originalHeight = image.getHeight(null);
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

    public double getSizeW() {
        return sizeW;
    }

    public void setSizeW(double sizeW) {
        this.sizeW = sizeW;
    }

    public double getSizeH() {
        return sizeH;
    }

    public void setSizeH(double sizeH) {
        this.sizeH = sizeH;
    }
}
