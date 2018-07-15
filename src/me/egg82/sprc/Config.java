package me.egg82.sprc;

public class Config {
	//vars
	public static volatile String prefix = null;
	public static volatile long purgePlayer = -1L;
	public static volatile long purgeWorld = -1L;
	
	public static PlayerConfig playerConfig = new PlayerConfig();
	public static BlockConfig blockConfig = new BlockConfig();
	public static EntityConfig entityConfig = new EntityConfig();
	
	//constructor
	public Config() {
		
	}
	
	//public
	
	//private
	
}
