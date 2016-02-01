/**
 * Created by Bradley on 2/1/16.
 */
public class Map {

    public Tile[][] tiles;
    private final int MAP_WIDTH = 400;
    private final int MAP_HEIGHT = 300;

    public Map(){

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

    public void removeItemFromLoaction(int x, int y){
        tiles[y][x].removeItem();
    }

    public void removeEntityFromLocation(int x, int y){
        tiles[y][x].removeEntity();
    }

}
