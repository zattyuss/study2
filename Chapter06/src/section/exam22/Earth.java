package section.exam22;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURPACE_AREA;
	static {
		EARTH_SURPACE_AREA = 4*Math.PI + EARTH_RADIUS*EARTH_RADIUS;
	}
}
