1. declare and instantiate and ArrayList of Colors objects using the Color class;

ArrayList<Color> palette = new ArrayList<Color>();

left hand side: declares that palette is a reference to an ArrayList object. 
right hand side: creates (instantiates) an ArrayList object and returns a reference. 

2. add Color.Red to the ArrayList

palette.add(Color.RED);

3. get last element in ArrayList of 9 colors;

Color color = get(8);

==================================================
4. 
//
// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

public class ListOfVerticalPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));

      // your code goes here
      // TODO Write the code to display the pictures vertically
        int height = 0;
        for (Picture pic : gallery)
        {      
            height = height + 10;
            pic.translate(0,height);
            height = pic.getMaxY();
            pic.draw();
        }
   }
}

==================================================
5. get size of array list named palette

int size = palette.size()

6.