package net.codersdownunder.gemsplusplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.gemsplusplus.init.BlockInit;
import net.codersdownunder.gemsplusplus.init.ItemInit;
import net.codersdownunder.gemsplusplus.tabs.GemsPlusPlusBlockItemGroup;
import net.codersdownunder.gemsplusplus.tabs.GemsPlusPlusItemItemGroup;
import net.codersdownunder.gemsplusplus.world.OreGeneration;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(References.MODID)
public class GemsPlusPlus
{
    public static final Logger LOGGER = LogManager.getLogger();
    
    public static final ItemGroup gemsplusplusitem = new GemsPlusPlusItemItemGroup();
	public static final ItemGroup gemsplusplusblock = new GemsPlusPlusBlockItemGroup();
    
    public GemsPlusPlus() {
    		
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        
        
        MinecraftForge.EVENT_BUS.register(this);
        
        
    }
    
   
    private void clientRegistries(final FMLClientSetupEvent event) {
		LOGGER.info("clientRegistries method registered");
		RenderType GppRender = RenderType.getCutoutMipped();
		
		RenderTypeLookup.setRenderLayer(BlockInit.OREAGATE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREAMETHYST.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORECHRYSOCOLLA.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORECITRINE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREGARNET.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREJADE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREJASPER.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREMALACHITE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREONYX.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREPHOENIXITE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORERUBY.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORESAPPHIRE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORESPINEL.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.OREAMETRINE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORETOPAZ.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.ORETOURMALINE.get(), GppRender);
		
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREAGATE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREAMETHYST.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORECHRYSOCOLLA.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORECITRINE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREGARNET.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREJADE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREJASPER.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREMALACHITE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREONYX.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREPHOENIXITE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORERUBY.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORESAPPHIRE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORESPINEL.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHEROREAMETRINE.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORETOPAZ.get(), GppRender);
		RenderTypeLookup.setRenderLayer(BlockInit.NETHERORETOURMALINE.get(), GppRender);
		
	}

    private void setup(final FMLCommonSetupEvent event)
    {
    	event.enqueueWork(() ->
		{
			
			OreGeneration.ores();
		});
    }
    
    @Mod.EventBusSubscriber(modid = References.MODID, bus = Bus.MOD)
    public static class ModEventBusSubscriber {
    	
    	@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		final IForgeRegistry<Item> registry = event.getRegistry();
    		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
    				.forEach(block -> {
    					final Item.Properties properties = new Item.Properties().group(gemsplusplusblock);
    					final BlockItem blockItem = new BlockItem(block, properties);
    					blockItem.setRegistryName(block.getRegistryName());
    					registry.register(blockItem);
                    });
    	}	
    }
    
}
