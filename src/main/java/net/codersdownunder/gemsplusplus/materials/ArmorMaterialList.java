
package net.codersdownunder.gemsplusplus.materials;

import net.codersdownunder.gemsplusplus.References;
import net.codersdownunder.gemsplusplus.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorMaterialList implements IArmorMaterial {

	agate("agate", 600, new int[] {4, 5, 5, 4}, 25, ItemInit.AGATE.get(), "entity.ender_dragon.growl", 1.0f),
	amethyst("amethyst", 1000, new int[] {8, 10, 9, 7}, 25, ItemInit.AMETHYST.get(), "entity.ender_dragon.growl", 0.0f),
	citrine("citrine", 500, new int[] {7, 6, 7, 6}, 25, ItemInit.CITRINE.get(), "entity.ender_dragon.growl", 0.0f),
	chrysocolla("chrysocolla", 460, new int[] {4, 7, 7, 4}, 25, ItemInit.CHRYSOCOLLA.get(), "entity.ender_dragon.growl", 0.0f),
	garnet("garnet", 650, new int[] {2, 10, 9, 7}, 25, ItemInit.GARNET.get(), "entity.ender_dragon.growl", 0.0f),
	jade("jade", 560, new int[] {8, 10, 9, 7}, 25, ItemInit.JADE.get(), "entity.ender_dragon.growl", 0.0f),
	jasper("jasper", 700, new int[] {8, 10, 9, 7}, 25, ItemInit.JASPER.get(), "entity.ender_dragon.growl", 0.0f),
	malachite("malachite", 350, new int[] {8, 10, 9, 7}, 25, ItemInit.MALACHITE.get(), "entity.ender_dragon.growl", 0.0f),
	onyx("onyx", 656, new int[] {8, 10, 9, 7}, 25, ItemInit.ONYX.get(), "entity.ender_dragon.growl", 0.0f),
	phoenixite("phoenixite", 1200, new int[] {3, 4, 3, 4}, 25, Items.LAVA_BUCKET, "entity.ender_dragon.growl", 0.0f),
	ruby("ruby", 400, new int[] {8, 10, 9, 7}, 25, ItemInit.RUBY.get(), "entity.ender_dragon.growl", 0.0f),
	sapphire("sapphire", 600, new int[] {8, 10, 9, 7}, 25, ItemInit.SAPPHIRE.get(), "entity.ender_dragon.growl", 0.0f),
	ametrine("ametrine", 800, new int[] {8, 10, 9, 7}, 25, ItemInit.AMETRINE.get(), "entity.ender_dragon.growl", 0.0f),
	spinel("spinel", 600, new int[] {8, 10, 9, 7}, 25, ItemInit.SPINEL.get(), "entity.ender_dragon.growl", 0.0f),
	topaz("topaz", 700, new int[] {8, 10, 9, 7}, 25, ItemInit.TOPAZ.get(), "entity.ender_dragon.growl", 0.0f),
	tourmaline("tourmaline", 500, new int[] {8, 10, 9, 7}, 25, ItemInit.TOURMALINE.get(), "entity.ender_dragon.growl", 0.0f);
	

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
	private final String name, equipSound;
	private int[] damageReductionAmounts;
	private final int durability, enchantability;
	private final float toughness;
	private Item repairItem;

	private ArmorMaterialList(String nameIn, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) {
		this.name = nameIn;
        this.durability = durability;
		this.damageReductionAmounts = damageReductionAmounts;
		this.enchantability = enchantability;
		this.toughness = toughness;
		this.equipSound = equipSound;
		this.repairItem = repairItem;
		
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairItem);
	}

	@OnlyIn(Dist.CLIENT)
	public String getName() {
		return References.MODID + ":" + this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
       return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.durability;
	}

	@Override
	public float getKnockbackResistance() {
		return this.toughness;
	}

}
