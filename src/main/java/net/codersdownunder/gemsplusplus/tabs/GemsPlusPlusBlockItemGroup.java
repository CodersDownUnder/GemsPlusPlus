package net.codersdownunder.gemsplusplus.tabs;

import net.codersdownunder.gemsplusplus.init.BlockInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GemsPlusPlusBlockItemGroup extends ItemGroup {

	public GemsPlusPlusBlockItemGroup() {
		super("gemsplusplusblock");
		
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockInit.BLOCKAGATE.get()));
	}
	
	

}
