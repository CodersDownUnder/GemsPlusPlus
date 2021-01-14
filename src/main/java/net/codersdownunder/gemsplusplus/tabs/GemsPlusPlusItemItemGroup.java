package net.codersdownunder.gemsplusplus.tabs;


import net.codersdownunder.gemsplusplus.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GemsPlusPlusItemItemGroup extends ItemGroup {

	public GemsPlusPlusItemItemGroup() {
		super("gemsplusplusitem");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.AGATE.get());
	}
	
	

}
