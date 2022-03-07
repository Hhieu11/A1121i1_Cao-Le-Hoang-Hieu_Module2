package ss6_KeThua.BaiTap;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D() {

    }

    public void Point3D(){}
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        setX(x);
        setY(x);
        this.z=z;
    }
    public float[] getXYZ(){

        float[]arr={getX(),getY(),z};
        return arr;
    }
    public String toString() {
        return "(" +getX() + ", " + getY() + ", " + z +")";
    }

}
