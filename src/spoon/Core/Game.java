package spoon.Core;

import javax.swing.*;
import java.util.List;

public class Game {
    private String name;
    private List<Scene> scenes;
    private int windowWidth;
    private int windowHeight;
    private boolean fullscreen;
    private boolean resizable;
    private int idCurrentScene;

    public Game() {
        this("Untitled Game", null, 800, 600, false, true, 0);
    }

    public Game(String name) {
        this(name, null, 800, 600, false, true, 0);
    }

    public Game(String name, List<Scene> scenes) {
        this(name, scenes, 800, 600, false, true, 0);
    }

    public Game(String name, List<Scene> scenes, int windowWidth, int windowHeight, boolean fullscreen, boolean resizable, int idCurrentScene) {
        this.name = name;
        this.scenes = scenes;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.fullscreen = fullscreen;
        this.resizable = resizable;
        this.idCurrentScene = idCurrentScene;

        this.run();
    }

    public void run(){
        JFrame window = new JFrame(this.name);
        window.setSize(this.windowWidth, this.windowHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        if(this.fullscreen) window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setResizable(resizable);
        window.setVisible(true);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public void addScene(Scene scene){
        this.scenes.add(scene);
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public boolean isResizable() {
        return resizable;
    }

    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    public int getIdFirstScene() {
        return idCurrentScene;
    }

    public void setIdFirstScene(int idFirstScene) {
        this.idCurrentScene = idFirstScene;
    }
}

