import java.awt.*;

/**
 * Created by Bradley on 2/1/16.
 */
public class Map {

    public Tile[][] tiles;
    private final int MAP_WIDTH = 100;
    private final int MAP_HEIGHT = 50;

    public Map(){
        initMap();
    }

    private void initMap(){
        tiles = new Tile[MAP_WIDTH][MAP_HEIGHT];

        for(int i=0; i<MAP_WIDTH; i++){
            for(int j=0; j<MAP_HEIGHT; j++){
                Terrain terrain = null;
                AreaEffect areaEffect = null;
                Item item = null;
                Entity entity = null;

                if(i==5){
                    terrain = new Terrain("mountain");
                }else if(j==5){
                    terrain = new Terrain("water");
                }else{
                    terrain = new Terrain("grass");
                }

                // For now there are no area effects or items or entities.
                tiles[i][j] = new Tile(terrain, areaEffect, item, entity);
            }
        }
    }

    public Terrain getTerrainAtLocation(int x, int y){
        return tiles[y][x].getTerrain();
    }

    public AreaEffect getAreaEffectAtLocation(int x, int y){
        return tiles[y][x].getAreaEffect();
    }

    public Item getItemAtLocation(int x, int y){
        return tiles[y][x].getItem();
    }

    public Entity getEntityAtLocation(int x, int y){
        return tiles[y][x].getEntity();
    }

    public void insertItemAtLocation(int x, int y, Item item){
        tiles[y][x].addItem(item);
    }

    public void insertEntityAtLocation(int x, int y, Entity entity){
        tiles[y][x].addEntity(entity);
    }

    public void removeItemFromLocation(int x, int y){
        tiles[y][x].removeItem();
    }

    public void removeEntityFromLocation(int x, int y){
        tiles[y][x].removeEntity();
    }

    public int getMapWidth(){
        return MAP_WIDTH;
    }

    public int getMapHeight(){
        return MAP_HEIGHT;
    }
}
