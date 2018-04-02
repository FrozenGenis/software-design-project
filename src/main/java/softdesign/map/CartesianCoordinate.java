// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package main.java.softdesign.map;

import javax.vecmath.Tuple3d;

public class CartesianCoordinate {

	private static final double GRID_STICKYINESS = 0.0001;

	private final int x;
	private final int z;

	private int gridSize;
	private boolean onGrid;

	public CartesianCoordinate(int x, int z) {
		this.x = x;
		this.z = z;
	}

	public CartesianCoordinate(Tuple3d point, int gridSize) {
		this.gridSize = gridSize;
		double estimatedX = point.x + cartesianOffset();
		double estimatedZ = point.z + cartesianOffset();

		x = (int) Math.round(estimatedX);
		z = (int) Math.round(estimatedZ);

		onGrid = estimatedX - x < GRID_STICKYINESS && estimatedZ - z < GRID_STICKYINESS;
	}

	private int cartesianOffset() {
		return (gridSize - 1) / 2;
	}

	public int getX() {
		return x;
	}

	public int getZ() {
		return z;
	}

	public boolean isOnGrid() {
		return onGrid;
	}
}
