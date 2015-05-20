package fingersome.dorfsvsgoblins.item;

import fingersome.dorfsvsgoblins.DorfsVsGoblins;
import fingersome.dorfsvsgoblins.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHopSeeds extends Item
{
	private final String name = ItemInfo.ITEM_HOPS_SEEDS_UNLOCALIZED;

	public ItemHopSeeds()
	{
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(ModInfo.MODID + "." + ItemInfo.ITEM_HOPS_SEEDS_UNLOCALIZED);
		setCreativeTab(DorfsVsGoblins.tabDvG);
		setMaxStackSize(1);
	}
	
	public String getName()
	{
		return name;
	}
	
}