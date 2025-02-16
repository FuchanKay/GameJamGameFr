package com.fuchankay.engine;

import java.util.HashMap;
import java.util.Map;

import com.fuchankay.game.SceneId;

public class SceneHandler {
    private AbstractGame game;
    private Map<SceneId, AbstractGame> sceneMap = new HashMap<SceneId, AbstractGame>();
    public SceneHandler() {
    }
    public void add(SceneId id, AbstractGame game) {
        this.sceneMap.put(id, game);
    }
    public void switchScene(SceneId id) {
        this.game = sceneMap.get(id);
    }
    public AbstractGame getGame() { 
        return this.game;
    }
}
    