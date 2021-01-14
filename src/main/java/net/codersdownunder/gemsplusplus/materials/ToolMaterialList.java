package net.codersdownunder.gemsplusplus.materials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.codersdownunder.gemsplusplus.init.ItemInit;


public enum ToolMaterialList implements IItemTier {
	
	agate(3, 475, 8f, 2.0f, 18, ItemInit.AGATE.get()),
	amethyst(2, 600, 6f, 2.0f, 10, ItemInit.AMETHYST.get()),
	citrine(3, 700, 8f, 3.0f, 17, ItemInit.CITRINE.get()),
	chrysocolla(2, 300, 5f, 1.0f, 7, ItemInit.CHRYSOCOLLA.get()),
	garnet(2, 700, 5.5f, 2.0f, 16, ItemInit.GARNET.get()),
	jade(3, 600, 6f, 5f, 15, ItemInit.JADE.get()),
	jasper(2, 675, 5.5f, 2.0f, 16, ItemInit.JASPER.get()),
	malachite(3, 375, 5f, 1.0f, 9, ItemInit.MALACHITE.get()),
	onyx(2, 650, 6f, 4f, 17, ItemInit.ONYX.get()),
	phoenixite(3, 1200, 10f, 3.0f, 15, Items.LAVA_BUCKET),
	ruby(2, 900, 5f, 5f, 19, ItemInit.RUBY.get()),
	sapphire(3, 900, 5f, 2.0f, 19, ItemInit.SAPPHIRE.get()),
	spinel(2, 750, 6.5f, 2.0f, 15, ItemInit.SPINEL.get()),
	ametrine(3, 625, 6f, 2.0f, 17, ItemInit.AMETRINE.get()),
	topaz(2, 800, 6f, 3.0f, 15, ItemInit.TOPAZ.get()),
	tourmaline(3, 725, 6.5f, 2.0f, 15, ItemInit.TOURMALINE.get());
	
	
	private float attackDamage, efficiency;
	private int durability, harvestlevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(int harvestlevel, int durability, float efficiency, float attackDamage, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestlevel = harvestlevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}
	@Override
	public int getMaxUses() {
		return this.durability;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		
		return this.harvestlevel;
	}
	@Override
	public int getEnchantability() {
		
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		
		return Ingredient.fromItems(this.repairMaterial);
	}

}
