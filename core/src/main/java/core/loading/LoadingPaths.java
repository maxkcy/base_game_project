package core.loading;

import java.util.ArrayList;
import java.util.List;

public class LoadingPaths {

    public List<String> getTexturePaths() {
        List<String> list = new ArrayList<>();

        list.add(ImagesPaths.TEST_CELL);
        list.add(ImagesPaths.TEST_PLAYER);
        list.add(ImagesPaths.PIXEL);
        list.add(ImagesPaths.ARROW);
        return list;
    }

    public List<String> getBitmapPaths() {
        List<String> list = new ArrayList<>();
        //list.add(GameAssets.GAME_FONT);
        return list;
    }

    public List<String> getTileMapPaths() {
        List<String> list = new ArrayList<>();

        //Levels
        //list.add(LevelNames.LEVEL_1);

        return list;
    }

    public List<String> getMusicPaths() {
        return null;
    }

    public List<String> getSoundPaths() {
        List<String> list = new ArrayList<>();

        //Menu
//        list.add(SoundPaths.CORRECT_AUDIO);

        return list;
    }

}
