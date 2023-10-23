public class KochCurve extends World {
    public void KochCurve(int order, int size, int sides){
    if(order == 0 ) {
        plane.move(size);
        } else {
            int angle = 180*(sides-2)/sides;
            KochCurve(order-1,size/3,sides);
            plane.turn(angle);
            for(int x = 2; x<=sides; x++){
                KochCurve(order-1,size/3,sides);
                plane.turn(angle-180);
            }
            plane.turn(180);
            KochCurve(order-1,size/3, sides);
            }
    }


    public void go() {
        int angle;
        plane.pausetime = 2;
        plane.teleport(125, 40);
        plane.isTrail = true;
        plane.startingAngle(0);
    for(int x =1; x<=6; x++) {
        KochCurve(x-1,243,3);
        plane.teleport(125,40+145*x);
        }
    }
    /*public void KochCurve(int order, int size) {
        if (order == 0) {
            plane.move(size);
        } else {
            KochCurve(order - 1, size / 3);
            plane.turn(60);
            KochCurve(order - 1, size / 3);
            plane.turn(-120);
            KochCurve(order - 1, size / 3);
            plane.turn(60);
            KochCurve(order - 1, size / 3);
        }
    }
        public void go() {
            plane.pausetime = 0;
            plane.teleport(75, 650);
            plane.isTrail = true;
            plane.startingAngle(0);
            KochCurve(6, 243);
        }*/
    }