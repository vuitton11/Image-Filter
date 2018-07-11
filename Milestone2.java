
public class Milestone2 {

    public static void main(String[] args) {

        Picture p = new Picture("C:\\Users\\veton\\Desktop\\square.jpg");

        System.out.println(countRedPixels(p));
        switchRedBlue(p);
        flipHorizontal(p);
        flipVertical(p);
        flipDiagonal(p);
        p.write("C:\\Users\\veton\\Desktop\\square.jpg");

    }

    //Returns the number of red pixels in a picture
// (1) from MS1
    public static int countRedPixels(Picture v){
        Pixel[] numberOfPixels = v.getPixels();
        int redPixels = 0;



        // Checks if the pixel in a index is a pure red
        for(int i = 0; i < numberOfPixels.length; i++ ){
            if(numberOfPixels[i].getRed() == 255
                    && numberOfPixels[i].getGreen()== 0
                    && numberOfPixels[i].getBlue() == 0 ) {
                redPixels++;
            }
        }
        return redPixels;
    }

    //Switches all red and blue pixels (pure red, pure blue)
// (2) from MS1
    public static void switchRedBlue(Picture v){
        Pixel[] numberOfPixels = v.getPixels();

        // Iterates through all the pixes
        for(int i = 0; i < numberOfPixels.length; i++){

            //If the pixel is red it replaces its rgb with that of blue
            if(numberOfPixels[i].getRed() == 255
                    && numberOfPixels[i].getGreen()== 0
                    && numberOfPixels[i].getBlue() == 0){
                numberOfPixels[i].setRed(0);
                numberOfPixels[i].setBlue(255);
            }

            //If the pixel is blue it replaces its rgb with that of red
            else if(numberOfPixels[i].getRed() == 0
                    && numberOfPixels[i].getGreen()== 0
                    && numberOfPixels[i].getBlue() == 255){
                numberOfPixels[i].setRed(255);
                numberOfPixels[i].setBlue(0);
            }
        }


    }


    //Flips over imaginary vertical line (3) from MS1
// IF pixels exist ON the midline, leave them there without reflecting
    public static void flipHorizontal(Picture v){

        Pixel [] pixels = v.getPixels();

        int x = pixels[pixels.length-1].getX()+1;
        int y = pixels[pixels.length-1].getY()+1;
        Pixel [][] ann = new Pixel[y][x];

        for(int i = 0; i< pixels.length; i++){
            ann[pixels[i].getY()][pixels[i].getX()] = pixels[i];
        }

        for(int j = 0; j < y; j++){
            for(int k =0; k < x/2;k++){
                ann[j][ann[j].length-1-k].setBlue(ann[j][k].getBlue());
                ann[j][ann[j].length-1-k].setRed(ann[j][k].getRed());
                ann[j][ann[j].length-1-k].setGreen(ann[j][k].getGreen());
                ann[j][ann[j].length-1-k].setAlpha(ann[j][k].getAlpha());
            }
        }

    }


    //Flips over imaginary horizontal line (4) from MS1
// IF pixels exist ON the midline, leave them there without reflecting
    public static void flipVertical(Picture v){

        Pixel [] pixels = v.getPixels();

        int x = pixels[pixels.length-1].getX()+1;
        int y = pixels[pixels.length-1].getY()+1;
        Pixel [][] ann = new Pixel[y][x];

        for(int i = 0; i< pixels.length; i++){
            ann[pixels[i].getY()][pixels[i].getX()] = pixels[i];
        }

        for(int j = 0; j < x; j++){
            for(int k =0; k < y/2;k++){
                ann[ann.length-1-k][j].setBlue(ann[k][j].getBlue());
                ann[ann.length-1-k][j].setRed(ann[k][j].getRed());
                ann[ann.length-1-k][j].setGreen(ann[k][j].getGreen());
                ann[ann.length-1-k][j].setAlpha(ann[k][j].getAlpha());
            }
        }

    }



    //Flips over imaginary diagonal line (5) from MS1
// upper right to lower left diagonal line
// you may assume SQUARE images (height == width)
// IF pixels exist ON the midline, leave them there without reflecting
    public static void flipDiagonal(Picture v) {

        Pixel[] pixels = v.getPixels();

        int x = pixels[pixels.length - 1].getX() + 1;
        int y = pixels[pixels.length - 1].getY() + 1;
        Pixel[][] ann = new Pixel[y][x];


            for (int i = 0; i < pixels.length; i++) {
                ann[pixels[i].getY()][pixels[i].getX()] = pixels[i];
            }
            for (int j = 0; j < y/2; j++) {
                for (int k = 0; k < x/2; k++) {
                    ann[ann.length - 1 - j][ann.length - 1 - k].setBlue(ann[k][j].getBlue());
                    ann[ann.length - 1 - j][ann.length - 1 - k].setRed(ann[k][j].getRed());
                    ann[ann.length - 1 - j][ann.length - 1 - k].setGreen(ann[k][j].getGreen());
                    ann[ann.length - 1 - j][ann.length - 1 - k].setAlpha(ann[k][j].getAlpha());

                }
            }


        }

        }
