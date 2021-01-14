package net.codersdownunder.gemsplusplus.world;

import net.codersdownunder.gemsplusplus.References;
import net.codersdownunder.gemsplusplus.init.BlockInit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class OreGeneration {
	
	public static ConfiguredFeature<?,?> ORERUBY;
	public static ConfiguredFeature<?,?> ORESAPPHIRE;
	public static ConfiguredFeature<?,?> OREAMETHYST;
	public static ConfiguredFeature<?,?> ORETOPAZ;
	public static ConfiguredFeature<?,?> OREPHOENIXITE;
	public static ConfiguredFeature<?,?> OREJADE;
	public static ConfiguredFeature<?,?> ORECITRINE;
	public static ConfiguredFeature<?,?> OREGARNET;
	public static ConfiguredFeature<?,?> ORESPINEL;
	public static ConfiguredFeature<?,?> OREONYX;
	public static ConfiguredFeature<?,?> OREAGATE;
	public static ConfiguredFeature<?,?> OREMALACHITE;
	public static ConfiguredFeature<?,?> ORETOURMALINE;
	public static ConfiguredFeature<?,?> ORECHRYSOCOLLA;
	public static ConfiguredFeature<?,?> OREJASPER;
	public static ConfiguredFeature<?,?> OREAMETRINE;
	
	public static ConfiguredFeature<?,?> NETHERORERUBY;
	public static ConfiguredFeature<?,?> NETHERORESAPPHIRE;
	public static ConfiguredFeature<?,?> NETHEROREAMETHYST;
	public static ConfiguredFeature<?,?> NETHERORETOPAZ;
	public static ConfiguredFeature<?,?> NETHEROREPHOENIXITE;
	public static ConfiguredFeature<?,?> NETHEROREJADE;
	public static ConfiguredFeature<?,?> NETHERORECITRINE;
	public static ConfiguredFeature<?,?> NETHEROREGARNET;
	public static ConfiguredFeature<?,?> NETHERORESPINEL;
	public static ConfiguredFeature<?,?> NETHEROREONYX;
	public static ConfiguredFeature<?,?> NETHEROREAGATE;
	public static ConfiguredFeature<?,?> NETHEROREMALACHITE;
	public static ConfiguredFeature<?,?> NETHERORETOURMALINE;
	public static ConfiguredFeature<?,?> NETHERORECHRYSOCOLLA;
	public static ConfiguredFeature<?,?> NETHEROREJASPER;
	public static ConfiguredFeature<?,?> NETHEROREAMETRINE;

	public static void ores() { 
		ORERUBY = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORERUBY.get().getDefaultState(), 3)).range(90).square().func_242731_b(9);
		ORESAPPHIRE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORESAPPHIRE.get().getDefaultState(), 3)).range(80).square().func_242731_b(8);
		OREAMETHYST = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREAMETHYST.get().getDefaultState(), 3)).range(80).square().func_242731_b(8);
		ORETOPAZ = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORETOPAZ.get().getDefaultState(), 3)).range(90).square().func_242731_b(8);
		OREPHOENIXITE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREPHOENIXITE.get().getDefaultState(), 2)).range(80).square().func_242731_b(6);
		OREJADE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREJADE.get().getDefaultState(), 3)).range(90).square().func_242731_b(8);
		ORECITRINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORECITRINE.get().getDefaultState(), 3)).range(80).square().func_242731_b(9);
		OREGARNET = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREGARNET.get().getDefaultState(), 3)).range(80).square().func_242731_b(8);
		ORESPINEL = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORESPINEL.get().getDefaultState(), 3)).range(80).square().func_242731_b(9);
		OREONYX = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREONYX.get().getDefaultState(), 3)).range(90).square().func_242731_b(7);
		OREAGATE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREAGATE.get().getDefaultState(), 3)).range(80).square().func_242731_b(10);
		OREMALACHITE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREMALACHITE.get().getDefaultState(), 3)).range(80).square().func_242731_b(9);
		ORETOURMALINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORETOURMALINE.get().getDefaultState(), 3)).range(90).square().func_242731_b(11);
		ORECHRYSOCOLLA = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.ORECHRYSOCOLLA.get().getDefaultState(), 3)).range(80).square().func_242731_b(9);
		OREJASPER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREJASPER.get().getDefaultState(), 3)).range(90).square().func_242731_b(8);
		OREAMETRINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.OREAMETRINE.get().getDefaultState(), 3)).range(80).square().func_242731_b(7);
		
		NETHERORERUBY = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORERUBY.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORESAPPHIRE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORESAPPHIRE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREAMETHYST = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREAMETHYST.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORETOPAZ = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORETOPAZ.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREPHOENIXITE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREPHOENIXITE.get().getDefaultState(), 6)).range(256).square().func_242731_b(7);
		NETHEROREJADE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREJADE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORECITRINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORECITRINE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREGARNET = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREGARNET.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORESPINEL = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORESPINEL.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREONYX = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREONYX.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREAGATE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREAGATE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREMALACHITE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREMALACHITE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORETOURMALINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORETOURMALINE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHERORECHRYSOCOLLA = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHERORECHRYSOCOLLA.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREJASPER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREJASPER.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		NETHEROREAMETRINE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHEROREAMETRINE.get().getDefaultState(), 3)).range(256).square().func_242731_b(4);
		
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oreruby"), ORERUBY);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oresapphire"), ORESAPPHIRE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oreamethyst"), OREAMETHYST);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oretopaz"), ORETOPAZ);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orephoenixite"), OREPHOENIXITE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orejade"), OREJADE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orecitrine"), ORECITRINE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oregarnet"), OREGARNET);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orespinel"), ORESPINEL);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oreonyx"), OREONYX);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oreagate"), OREAGATE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oremalachite"), OREMALACHITE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oretourmaline"), ORETOURMALINE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orechrysocolla"), ORECHRYSOCOLLA);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "orejasper"), OREJASPER);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "oreametrine"), OREAMETRINE);
		
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroreruby"), NETHERORERUBY);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroresapphire"), NETHERORESAPPHIRE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroreamethyst"), NETHEROREAMETHYST);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroretopaz"), NETHERORETOPAZ);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorephoenixite"), NETHEROREPHOENIXITE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorejade"), NETHEROREJADE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorecitrine"), NETHERORECITRINE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroregarnet"), NETHEROREGARNET);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorespinel"), NETHERORESPINEL);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroreonyx"), NETHEROREONYX);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroreagate"), NETHEROREAGATE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroremalachite"), NETHEROREMALACHITE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroretourmaline"), NETHERORETOURMALINE);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorechrysocolla"), NETHERORECHRYSOCOLLA);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netherorejasper"), NETHEROREJASPER);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "netheroreametrine"), NETHEROREAMETRINE);
	}
	
	@SubscribeEvent
	public static void biomeModification(final BiomeLoadingEvent event) { 
	
		ores();
		
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORERUBY);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORESAPPHIRE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREAMETHYST);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORETOPAZ);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREPHOENIXITE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREJADE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORECITRINE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREGARNET);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORESPINEL);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREONYX);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREAGATE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREMALACHITE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORETOURMALINE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ORECHRYSOCOLLA);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREJASPER);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> OREAMETRINE);
		
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORERUBY);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORESAPPHIRE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREAMETHYST);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORETOPAZ);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREPHOENIXITE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREJADE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORECITRINE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREGARNET);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORESPINEL);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREONYX);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREAGATE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREMALACHITE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORETOURMALINE);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHERORECHRYSOCOLLA);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREJASPER);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> NETHEROREAMETRINE);
	}
}	
