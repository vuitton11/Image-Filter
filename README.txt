Week 2 Write some Code (60 pts, autograded)
 
In this milestone, you will be implementing the algorithms you designed in MS1. The instructions below will help you get started. You will be handing in via Autolab (which will be opened early next week).
 
See the attached zip file for all the library files necessary for this milestone.
Extract these files into a directory.
 
Helpful Background
Look at the API documentation for the library. Pay extra attention to the API for Picture/SimplePicture and Pixel. All methods you see in SimplePicture are also available for you to use in Picture objects.
 
The API can be found at: http://www.cs.rutgers.edu/~atjang/mediacomp/docs
 
As you learned in class, you can create an object by using the provided constructors. Specifically:
            
//On Windows
//note the backslashes in the path MUST be escaped
Picture p = new Picture(“C:\\Andrew\\Pics\\mypic.jpg”);
 
//On MacOS/Linux
Picture p = new Picture(“/home/andrew/Pics/mypic.jpg”);
 
 
creates a new Picture object from the file mypic.jpg. You may then call any of the methods below and pass in p. The object referenced by p will be manipulated by your methods. To write your modified picture call the instance method write() on p.
 
p.write(“C:\\Andrew\\Pics\\mypic-modified.jpg”);
 
will write the changes to a new file called mypic-modified.jpg.  IMPORTANT: You MUST use the full path when writing your new image. Relative paths (e.g. ./foo.jpg ) or simple filenames (e.g. foo.jpg) will not work correctly.
 
You can then view your modified image.
 
 
Write your code in a file called: Milestone2.java
 
Implement the following methods exactly as written:
 
//Returns the number of red pixels in a picture
// (1) from MS1
public static int countRedPixels(Picture v)
 
//Switches all red and blue pixels (pure red, pure blue)
// (2) from MS1
public static void switchRedBlue(Picture v)
 
 
//Flips over imaginary vertical line (3) from MS1
// IF pixels exist ON the midline, leave them there without reflecting
public static void flipHorizontal(Picture v)
 
 
//Flips over imaginary horizontal line (4) from MS1
// IF pixels exist ON the midline, leave them there without reflecting
public static void flipVertical(Picture v)
 
 
//Flips over imaginary diagonal line (5) from MS1
// upper right to lower left diagonal line
// you may assume SQUARE images (height == width)
// IF pixels exist ON the midline, leave them there without reflecting
public static void flipDiagonal(Picture v)
 
 
There is a utility included to help you discover colors and explore images. It is aptly named Picture Explorer.
 
To run it, compile it and then execute the command:
 
java PictureExplorer
 
 
 
 
We encourage you to upload your image creations on piazza for all to see!

Autolab will be open closer to the due date to accept submissions. Do not wait until then to start!