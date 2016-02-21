package com.util;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;



public class ImageUtil {

    private static BufferedImage questionImage;
    private static BufferedImage answerImage;
    
	public static BufferedImage getImage(String name){
		BufferedImage image=null;
		try {
			image = ImageIO.read(IOUtilities.getResourceInputStream("images/"+name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

}
