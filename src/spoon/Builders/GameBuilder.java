package spoon.Builders;

import spoon.Core.Game;
import spoon.Core.Scene;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {
    private String name = "Untitled Game";
    private List<Scene> scenes = new ArrayList<>();
    private int windowWidth = 800;
    private int windowHeight = 600;
    private boolean fullscreen = false;
    private boolean resizable = true;
    private int idCurrentScene = 0;

    public GameBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GameBuilder setScenes(List<Scene> scenes) {
        this.scenes = scenes;
        return this;
    }

    public GameBuilder setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
        return this;
    }

    public GameBuilder setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
        return this;
    }

    public GameBuilder setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
        return this;
    }

    public GameBuilder setResizable(boolean resizable) {
        this.resizable = resizable;
        return this;
    }

    public GameBuilder setIdCurrentScene(int idCurrentScene) {
        this.idCurrentScene = idCurrentScene;
        return this;
    }

    public GameBuilder addScene(Scene scene) {
        this.scenes.add(scene);
        return this;
    }

    public Game createGame() {
        return new Game(name, scenes, windowWidth, windowHeight, fullscreen, resizable, idCurrentScene);
    }
}