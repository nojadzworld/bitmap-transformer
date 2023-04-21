package bitmap.transformer;

import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Bitmap {


    public byte[] Bitmap(String inputFilePath) throws IOException {
         BufferedImage bitmap = null;
         int width = 0;
         int height = 0;

        try {
            bitmap = ImageIO.read(inputFilePath.toFile());
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public void addTransform(String transformName) {
        if ("invert".equals(transformName)) {
            invert();
        }else if () {

        } else {
            System.err.println("Error: Transform name unknown: " + transformName);
        }
    }


    public void writeFile(String outputFilePath) throws IOException {
        ImageIO.write(image, "bmp", new File(outputFilePath));
    }

    private void invert() {


    }
    

}
