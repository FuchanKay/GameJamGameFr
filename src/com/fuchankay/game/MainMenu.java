package com.fuchankay.game;

import java.awt.event.MouseEvent;

import com.fuchankay.engine.AbstractGame;
import com.fuchankay.engine.GameContainer;
import com.fuchankay.engine.Input;
import com.fuchankay.engine.Renderer;

public class MainMenu extends AbstractGame {

    public MainMenu(GameContainer gc) {
    }

    @Override
    public void update(GameContainer gc, Input input, float deltaTime) {
        if (input.isButtonUp(MouseEvent.BUTTON1)) { 
            gc.getSceneHandler().switchScene(SceneId.SceneTemplate);
        }
    }    
    
    @Override
    public void render(GameContainer gc, Renderer r) {
        r.drawRect(0xff0000, 50, 50, 50, 50);
    }
}
