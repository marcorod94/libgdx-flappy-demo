package com.mdev.flappy.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Marco Rodriguez on 14/11/2016.
 */

public abstract class State
{
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected com.mdev.flappy.states.GameStateManager gsm;

    public State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    public abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
