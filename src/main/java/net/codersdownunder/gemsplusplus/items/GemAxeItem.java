package net.codersdownunder.gemsplusplus.items;

import net.codersdownunder.gemsplusplus.init.ItemInit;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GemAxeItem extends AxeItem {
	
	public GemAxeItem(IItemTier tier, float p_i48530_2_, float attackSpeedIn, Properties builder) {
		super(tier, p_i48530_2_, attackSpeedIn, builder);
	
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		
		if (stack.getItem() == ItemInit.AXEPHOENIXITE.get()) {
				entity.setFire(60);
		}
		
		return false;
	}
	
	  public ActionResultType onItemUse(ItemUseContext context) {
		  
		  if (context.getItem().getItem() == ItemInit.AXEPHOENIXITE.get()) {
	      PlayerEntity playerentity = context.getPlayer();
	      World world = context.getWorld();
	      BlockPos blockpos = context.getPos();
	      BlockState blockstate = world.getBlockState(blockpos);
	      if (CampfireBlock.canBeLit(blockstate)) {
	         world.playSound(playerentity, blockpos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
	         world.setBlockState(blockpos, blockstate.with(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
	         if (playerentity != null) {
	            context.getItem().damageItem(1, playerentity, (player) -> {
	               player.sendBreakAnimation(context.getHand());
	            });
	         }

	         return ActionResultType.func_233537_a_(world.isRemote());
	      } else {
	         BlockPos blockpos1 = blockpos.offset(context.getFace());
	         if (AbstractFireBlock.canLightBlock(world, blockpos1, context.getPlacementHorizontalFacing())) {
	            world.playSound(playerentity, blockpos1, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
	            BlockState blockstate1 = AbstractFireBlock.getFireForPlacement(world, blockpos1);
	            world.setBlockState(blockpos1, blockstate1, 11);
	            ItemStack itemstack = context.getItem();
	            if (playerentity instanceof ServerPlayerEntity) {
	               CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity)playerentity, blockpos1, itemstack);
	               itemstack.damageItem(1, playerentity, (player) -> {
	                  player.sendBreakAnimation(context.getHand());
	               });
	            }

	            return ActionResultType.func_233537_a_(world.isRemote());
	         } else {
	            return ActionResultType.FAIL;
	         }
	      }
	   }
		  return ActionResultType.PASS;
	  }
	
}
