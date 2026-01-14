public class VolumeEarth{
	public static void main(String[] args) {
	int radiuskm = 6378;
	double radiusmiles = 6378.0 / 1.6;
	double pi = Math.PI;
	double VolumeEarthKm = 4.0/3.0 * pi * Math.pow(radiuskm,3);
	double VolumeEarthmiles = 4.0/3.0 * pi * Math.pow(radiusmiles,3);
	System.out.println("The volume of earth in cubic kilometers is " + VolumeEarthKm + " and cubic miles is " + VolumeEarthmiles);
	}
}