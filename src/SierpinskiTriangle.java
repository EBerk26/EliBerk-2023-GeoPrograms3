public class SierpinskiTriangle extends World {

    public void Sierpinski(double size, int order){
        if (order==0){
            for(int x = 1; x<=3; x++){
                plane.move(size);
                plane.turn(120);
            }
            plane.isTrail = false;
            plane.move(size);
            plane.isTrail = true;
        } else {
            Sierpinski(size/2,order-1);
            Sierpinski(size/2,order-1);
            plane.turn(120);
            plane.isTrail = false;
            plane.move(size/2);
            plane.isTrail = true;
            Sierpinski(size/2,order-1);
            plane.turn(180);
            plane.move(size);
            plane.turn(60);
        }
    }

    public void go() {
        plane.teleport(200,650);
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.startingAngle(0);
        Sierpinski(512,6);
        System.out.println(plane.xpos);
    }
}