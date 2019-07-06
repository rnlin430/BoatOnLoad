package com.github.rnlin.boat.on.road;

import org.bukkit.plugin.java.JavaPlugin;



public class BoatOnRoad extends JavaPlugin {


		@Override
		public void onDisable() {
			// TODO 自動生成されたメソッド・スタブ
			super.onDisable();
		}


		@Override
		public void onEnable() {
			// TODO 自動生成されたメソッド・スタブ
			super.onEnable();
System.out.println("\u001b[32m" + "BoatOnLoad:onEnable" + "\u001b[m");

			// config
			saveDefaultConfig();
			// FileConfiguration config = getConfig();
			new MovementListener(this);
		}


}