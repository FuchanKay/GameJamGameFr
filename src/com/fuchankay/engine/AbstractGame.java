package com.fuchankay.engine;

public abstract class AbstractGame {
    
    public abstract void update(GameContainer gc, Input input, float dt);

    public abstract void render(GameContainer gc, Renderer r);
}
 