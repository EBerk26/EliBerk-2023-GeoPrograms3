public class A1_HowToMove extends World {
    double Sides = 18;
    //This is the method that your program looks for and executes when you 'run' it

    public void go() {
//code that was already there
        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 1;
//setup
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.teleport(450, 750);
//loop that draws
        for (int x = 0; x < Sides; x++) {
            plane.move(100);
            plane.turn(180-(180*(Sides-2))/Sides);
        }

    }
}
/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/