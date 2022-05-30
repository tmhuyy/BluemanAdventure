// import java.io.IOException;
// import javax.imageio.ImageIO;

public class OBJ_DOOR extends Entity {

    public OBJ_DOOR(GamePanel gp) {
        super(gp);

        name = "Door";
        right1 = setup("door");
        collision = true;

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 30;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}