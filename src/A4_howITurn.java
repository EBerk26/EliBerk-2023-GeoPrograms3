public class A4_howITurn extends World {
    public void house(int Darkness) {
        for (int y = 0; y < 3; y++) {
            if (y == 0) {
                plane.setColor(Darkness, 0, 0); //first color
                    } else if (y == 1) {
                        plane.setColor(0, Darkness, 0); //second color
                        } else {
                            plane.setColor(0, 0, Darkness); //third color
            }
            plane.move(100);
            plane.turn(120);
        }
        plane.startingAngle(90);
        for (int z =0; z<3; z++) {
            if (z==0) { plane.setColor(0, Darkness, 0); //first color
                } else if (z == 1) {
                    plane.setColor(Darkness, 0, 0); //second color
                        } else {
                            plane.setColor(0, 0, Darkness); //third color
            }
        plane.move(100);
        plane.turn(90);
        }
        plane.startingAngle(0);
    }
    public void go() {
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.teleport(50, 100);
        house(250);
        plane.teleport(50, 675);
        house(200);
        plane.teleport(850, 675);
        house(160);
        plane.teleport(850, 100);
        house(128);
        plane.teleport(500,400);
        plane.startingAngle(270);
    }
}