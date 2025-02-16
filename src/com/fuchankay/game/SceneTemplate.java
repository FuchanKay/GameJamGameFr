package com.fuchankay.game;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.fuchankay.engine.AbstractGame;
import com.fuchankay.engine.GameContainer;
import com.fuchankay.engine.Input;
import com.fuchankay.engine.Renderer;
import com.fuchankay.engine.audio.SoundClip;
import com.fuchankay.engine.gfx.ImageTile;

public class SceneTemplate extends AbstractGame {
    private Input input;
    
    public SceneTemplate(GameContainer gc) {
        input = gc.getInput();
    }

    @Override
    public void update(GameContainer gc, Input input, float deltaTime) {
        if (input.isButtonUp(MouseEvent.BUTTON1)) { 
            gc.getSceneHandler().switchScene(SceneId.MainMenu);
        }
    }    
    
    @Override
    public void render(GameContainer gc, Renderer r) {
        
    }
}
