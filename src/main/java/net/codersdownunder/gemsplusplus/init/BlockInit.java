package net.codersdownunder.gemsplusplus.init;

import net.codersdownunder.gemsplusplus.References;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MODID);
	
	public static final RegistryObject<Block> BLOCKRUBY = BLOCKS.register("blockruby", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKSAPPHIRE = BLOCKS.register("blocksapphire", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKAMETHYST = BLOCKS.register("blockamethyst", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKTOPAZ = BLOCKS.register("blocktopaz", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKPHOENIXITE = BLOCKS.register("blockphoenixite", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKJADE = BLOCKS.register("blockjade", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKCITRINE = BLOCKS.register("blockcitrine", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKGARNET = BLOCKS.register("blockgarnet", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKSPINEL = BLOCKS.register("blockspinel", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKONYX = BLOCKS.register("blockonyx", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKAGATE = BLOCKS.register("blockagate", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKMALACHITE = BLOCKS.register("blockmalachite", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKTOURMALINE = BLOCKS.register("blocktourmaline", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKCHRYSOCOLLA = BLOCKS.register("blockchrysocolla", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKJASPER = BLOCKS.register("blockjasper", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> BLOCKAMETRINE = BLOCKS.register("blockametrine", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	
	public static final RegistryObject<Block> ORERUBY = BLOCKS.register("oreruby", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORESAPPHIRE = BLOCKS.register("oresapphire", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREAMETHYST = BLOCKS.register("oreamethyst", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORETOPAZ = BLOCKS.register("oretopaz", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREPHOENIXITE = BLOCKS.register("orephoenixite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREJADE = BLOCKS.register("orejade", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORECITRINE = BLOCKS.register("orecitrine", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREGARNET = BLOCKS.register("oregarnet", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORESPINEL = BLOCKS.register("orespinel", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREONYX = BLOCKS.register("oreonyx", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREAGATE = BLOCKS.register("oreagate", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREMALACHITE = BLOCKS.register("oremalachite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORETOURMALINE = BLOCKS.register("oretourmaline", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> ORECHRYSOCOLLA = BLOCKS.register("orechrysocolla", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREJASPER = BLOCKS.register("orejasper", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> OREAMETRINE = BLOCKS.register("oreametrine", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));

	public static final RegistryObject<Block> NETHERORERUBY = BLOCKS.register("netheroreruby", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORESAPPHIRE = BLOCKS.register("netheroresapphire", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREAMETHYST = BLOCKS.register("netheroreamethyst", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORETOPAZ = BLOCKS.register("netheroretopaz", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREPHOENIXITE = BLOCKS.register("netherorephoenixite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREJADE = BLOCKS.register("netherorejade", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORECITRINE = BLOCKS.register("netherorecitrine", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREGARNET = BLOCKS.register("netheroregarnet", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORESPINEL = BLOCKS.register("netherorespinel", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREONYX = BLOCKS.register("netheroreonyx", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREAGATE = BLOCKS.register("netheroreagate", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREMALACHITE = BLOCKS.register("netheroremalachite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORETOURMALINE = BLOCKS.register("netheroretourmaline", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHERORECHRYSOCOLLA = BLOCKS.register("netherorechrysocolla", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREJASPER = BLOCKS.register("netherorejasper", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> NETHEROREAMETRINE = BLOCKS.register("netheroreametrine", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	
	
}
