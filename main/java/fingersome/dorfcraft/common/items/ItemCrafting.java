package fingersome.dorfcraft.common.items;

import net.minecraft.item.Item;

public class ItemCrafting extends Item {

	protected String name;
	 
	 public ItemCrafting(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 }
	
}