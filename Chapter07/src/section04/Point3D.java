package section04;

public class Point3D extends Point {
	int z;

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	@Override
	public String getLocation() {
		System.out.println(super.getLocation());
		return "("+x+","+y+","+z+")";
	}
}
