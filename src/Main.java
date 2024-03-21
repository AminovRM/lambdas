import utils.ImageUtils;
import utils.RgbMaster;
import utils.functions.FilterOperation;

import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
       final BufferedImage image = ImageUtils.getImage("images/crab.png");
       final RgbMaster rgbMaster=new RgbMaster(image);

     rgbMaster.changeImage(FilterOperation::serpia);
       ImageUtils.saveImage(rgbMaster.getImage(), "images/clone_crab.png");

    }
    }
