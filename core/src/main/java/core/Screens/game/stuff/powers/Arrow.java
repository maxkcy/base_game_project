package core.Screens.game.stuff.powers;

import com.badlogic.gdx.graphics.g2d.Sprite;

import core.util.Enums.Direction;

public class Arrow extends Power {

    public Arrow(Sprite powerSprite, Direction direction) {
        super(powerSprite);
        switch (direction) {
            case LEFT:
                sprite.rotate90(true);
            case DOWN:
                sprite.rotate90(true);
            case RIGHT:
                sprite.rotate90(true);
        }
    }
}