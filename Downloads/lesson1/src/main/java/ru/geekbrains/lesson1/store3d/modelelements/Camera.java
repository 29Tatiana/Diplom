package ru.geekbrains.lesson1.store3d.modelelements;

public class Camera {
     public void rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void move(Point3D newLocation) {
        this.location = newLocation;
    }


    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }


    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }


    private Point3D location;
    private Angle3D angle;

}

