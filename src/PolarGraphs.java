

public class PolarGraphs extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 0;
        plane.teleport(0, 400);
        plane.isTrail = true;
        plane.startingAngle(0);
        //x axis
        plane.move(1000);
        //y axis
        plane.teleport(500,0);
        plane.startingAngle(90);
        plane.move(800);
        plane.teleport(500,400);
        plane.trailWidth = 5;
        for(int x = 1; x<=360; x++){
            plane.pausetime = 0;
            plane.startingAngle(x);
            plane.isTrail = false;
            if(1-2*Math.sin((x)) < 0){
                plane.turn(180);
                plane.move(-100*(2*Math.sin(Math.toRadians((x)))-1));
                plane.isTrail = true;
                plane.move(2);
                plane.teleport(500,400);
            } else {
                plane.move(100 * (2 * Math.sin(Math.toRadians((x)))-1));
                plane.isTrail = true;
                plane.move(2);
                plane.teleport(500, 400);
            }
        }
    }


}
