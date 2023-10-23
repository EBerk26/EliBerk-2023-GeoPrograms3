public class B0_BasicLoop extends World {
public void grid(int height, int width)
{for (int y = 1; y < height+1; y++) {
    for (int x = 0; x < width; x++) {
        plane.setColor(100+155/(x+1)*x/3*2,100+155/height*y,255);
        plane.square(70);
        plane.teleport(plane.xpos + 75, plane.ypos);
    }
    plane.teleport(plane.xpos - width*75, plane.ypos + 75);
}}
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.trailWidth = 3;
        plane.teleport(10, 10);
        plane.pausetime = 0;
        plane.isTrail = true;
        grid(10,10);
        plane.teleport(800,400);
        }
    }