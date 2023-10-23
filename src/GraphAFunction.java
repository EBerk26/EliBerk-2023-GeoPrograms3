public class GraphAFunction extends World {
    public double f(int a){
        //return(a*a/610);
        return(Math.sin(Math.toRadians(a)*1.08) * 200);
        //return(0.03*(40.242/500*a)*(40.242/500*a)*(40.242/500*a)+(40.242/500*a)*(40.242/500*a)+1.6*(40.242/500*a));
    }
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        //setup
        plane.trailWidth = 3;
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
        //setup values manually
        double startingslope = 1; //this is equivalent to the negative derivative of the function at x=-500
        double redcoefficient = 1;
        //setup values automatically for the 3 functions currently there
        if (0.006<f(2)&f(2)<0.008) {
            startingslope = 1.6393;
            redcoefficient = 155.55;
        }
            else if (7.537<f(2) && f(2)<7.539){
                startingslope = 3.7699;
                redcoefficient = 67.6408;
            }
                else if (0.283<f(2)&& f(2)<0.285){
                startingslope = -5.3815;
                redcoefficient = 47.3802;
                }
        double slope = startingslope;
        for (int a = -500; a < 500; a++) {
            plane.pausetime = 2;
            plane.isTrail = true;
            double previousxpos = plane.xpos;
            double previousypos = plane.ypos;
            plane.teleport(a+500, 400 - f(a));
            if(a<-498){slope=startingslope;}
            plane.setColor(((int)(redcoefficient*Math.abs(slope))),100,100);
            plane.startingAngle((int)Math.toDegrees(Math.atan(slope)));
            slope = (plane.ypos-previousypos)/(plane.xpos-previousxpos);
            plane.move(2);
            plane.pausetime = 0;
            plane.isTrail = false;
            plane.turn(180);
            plane.move(2);
        }
        plane.turn(180);
    }
}