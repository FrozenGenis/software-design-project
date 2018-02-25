package main.java.softdesign;

import simbad.gui.*;
import simbad.sim.*;
import simbad.sim.Agent;
import simbad.sim.EnvironmentDescription;
import java.util.ArrayList;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

public class Main {
  static Point3d coords = new Point3d();

  public void start() {
    Environment environment = new Environment();
    CentralBase centralBase = new CentralBase();

    ArrayList<Agent> swarm = new ArrayList<Agent>();
    //use constants for environment size
    if(Environment.WORLD_SIZE <= Environment.SMALL) {
      swarm.add(new Robot(environment.coords(0,0), "small" , centralBase.sendMap()));
    }

    for (Agent robot:swarm)
    environment.add(robot);
    
    new Simbad(environment, false);
  }

  public static void main(String[] args) {
    new Main().start();
    }
  }
