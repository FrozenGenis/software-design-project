package main.java.softdesign.map;

public interface Map {

	enum Tile {
		COVERED, WALL, EMPTY, ROBOT;

		public boolean isPassable() {
			return this == COVERED || this == EMPTY;
		}
	}

	void markAsWall(CartesianCoordinate coordinate);

	void markAsCovered(CartesianCoordinate coordinate);

	void markAsRobot(CartesianCoordinate coordinate);

	double getCoverage();

	Tile getTile(CartesianCoordinate coordinate);

	int getSize();
}
