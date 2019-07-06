package com.github.rnlin.boat.on.road;

import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class MovementListener implements Listener {
	private Plugin plugin;

	public MovementListener(BoatOnRoad plugin) {
		super();
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onVehickeMove(VehicleEntityCollisionEvent e) {
		Vehicle vehicle = e.getVehicle();
//System.out.println("onDamage:22");
		Vector vector = vehicle.getVelocity();
		vehicle.setVelocity(vector.multiply(10));
//System.out.println("onDamage:25");
		
	}
}
