package net.codersdownunder.gemsplusplus.items;

import net.codersdownunder.gemsplusplus.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class GemArmorItem extends ArmorItem {

	
	
	public GemArmorItem(IArmorMaterial materialIn, EquipmentSlotType slots, Properties builder) {
		super(materialIn, slots, builder);
		
	}

	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) 
	{
		if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HELMETPHOENIXITE.get() 
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.CHESTPLATEPHOENIXITE.get()
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.LEGGINGSPHOENIXITE.get()
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.BOOTSPHOENIXITE.get()) {
			
				player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 0, 5));
		}

	}
	 

	   

}
