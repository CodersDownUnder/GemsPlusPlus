package net.codersdownunder.gemsplusplus.init;

import net.codersdownunder.gemsplusplus.GemsPlusPlus;
import net.codersdownunder.gemsplusplus.References;
import net.codersdownunder.gemsplusplus.items.GemArmorItem;
import net.codersdownunder.gemsplusplus.items.GemAxeItem;
import net.codersdownunder.gemsplusplus.items.GemHoeItem;
import net.codersdownunder.gemsplusplus.items.GemPickaxeItem;
import net.codersdownunder.gemsplusplus.items.GemShovelItem;
import net.codersdownunder.gemsplusplus.items.GemSwordItem;
import net.codersdownunder.gemsplusplus.materials.ArmorMaterialList;
import net.codersdownunder.gemsplusplus.materials.ToolMaterialList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);
	
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PHOENIXITE = ITEMS.register("phoenixite", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> GARNET = ITEMS.register("garnet", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SPINEL = ITEMS.register("spinel", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AGATE = ITEMS.register("agate", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHRYSOCOLLA = ITEMS.register("chrysocolla", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> JASPER = ITEMS.register("jasper", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AMETRINE = ITEMS.register("ametrine", () -> new Item(new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	
	public static final RegistryObject<Item> PICKAXERUBY = ITEMS.register("pickaxeruby", () -> new GemPickaxeItem(ToolMaterialList.ruby, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXESAPPHIRE = ITEMS.register("pickaxesapphire", () -> new GemPickaxeItem(ToolMaterialList.sapphire, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEAMETHYST = ITEMS.register("pickaxeamethyst", () -> new GemPickaxeItem(ToolMaterialList.amethyst, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXETOPAZ = ITEMS.register("pickaxetopaz", () -> new GemPickaxeItem(ToolMaterialList.topaz, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEPHOENIXITE = ITEMS.register("pickaxephoenixite", () -> new GemPickaxeItem(ToolMaterialList.phoenixite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEJADE = ITEMS.register("pickaxejade", () -> new GemPickaxeItem(ToolMaterialList.jade, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXECITRINE = ITEMS.register("pickaxecitrine", () -> new GemPickaxeItem(ToolMaterialList.citrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEGARNET = ITEMS.register("pickaxegarnet", () -> new GemPickaxeItem(ToolMaterialList.garnet, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXESPINEL = ITEMS.register("pickaxespinel", () -> new GemPickaxeItem(ToolMaterialList.spinel, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEONYX = ITEMS.register("pickaxeonyx", () -> new GemPickaxeItem(ToolMaterialList.onyx, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEAGATE = ITEMS.register("pickaxeagate", () -> new GemPickaxeItem(ToolMaterialList.agate, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEMALACHITE = ITEMS.register("pickaxemalachite", () -> new GemPickaxeItem(ToolMaterialList.malachite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXETOURMALINE = ITEMS.register("pickaxetourmaline", () -> new GemPickaxeItem(ToolMaterialList.tourmaline, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXECHRYSOCOLLA = ITEMS.register("pickaxechrysocolla", () -> new GemPickaxeItem(ToolMaterialList.chrysocolla, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEJASPER = ITEMS.register("pickaxejasper", () -> new GemPickaxeItem(ToolMaterialList.jasper, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> PICKAXEAMETRINE = ITEMS.register("pickaxeametrine", () -> new GemPickaxeItem(ToolMaterialList.ametrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	
	public static final RegistryObject<Item> AXERUBY = ITEMS.register("axeruby", () -> new GemAxeItem(ToolMaterialList.ruby, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXESAPPHIRE = ITEMS.register("axesapphire", () -> new GemAxeItem(ToolMaterialList.sapphire, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEAMETHYST = ITEMS.register("axeamethyst", () -> new GemAxeItem(ToolMaterialList.amethyst, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXETOPAZ = ITEMS.register("axetopaz", () -> new GemAxeItem(ToolMaterialList.topaz, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEPHOENIXITE = ITEMS.register("axephoenixite", () -> new GemAxeItem(ToolMaterialList.phoenixite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEJADE = ITEMS.register("axejade", () -> new GemAxeItem(ToolMaterialList.jade, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXECITRINE = ITEMS.register("axecitrine", () -> new GemAxeItem(ToolMaterialList.citrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEGARNET = ITEMS.register("axegarnet", () -> new GemAxeItem(ToolMaterialList.garnet, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXESPINEL = ITEMS.register("axespinel", () -> new GemAxeItem(ToolMaterialList.spinel, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEONYX = ITEMS.register("axeonyx", () -> new GemAxeItem(ToolMaterialList.onyx, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEAGATE = ITEMS.register("axeagate", () -> new GemAxeItem(ToolMaterialList.agate, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEMALACHITE = ITEMS.register("axemalachite", () -> new GemAxeItem(ToolMaterialList.malachite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXETOURMALINE = ITEMS.register("axetourmaline", () -> new GemAxeItem(ToolMaterialList.tourmaline, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXECHRYSOCOLLA = ITEMS.register("axechrysocolla", () -> new GemAxeItem(ToolMaterialList.chrysocolla, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEJASPER = ITEMS.register("axejasper", () -> new GemAxeItem(ToolMaterialList.jasper, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> AXEAMETRINE = ITEMS.register("axeametrine", () -> new GemAxeItem(ToolMaterialList.ametrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> SHOVELRUBY = ITEMS.register("shovelruby", () -> new GemShovelItem(ToolMaterialList.ruby, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELSAPPHIRE = ITEMS.register("shovelsapphire", () -> new GemShovelItem(ToolMaterialList.sapphire, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELAMETHYST = ITEMS.register("shovelamethyst", () -> new GemShovelItem(ToolMaterialList.amethyst, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELTOPAZ = ITEMS.register("shoveltopaz", () -> new GemShovelItem(ToolMaterialList.topaz, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELPHOENIXITE = ITEMS.register("shovelphoenixite", () -> new GemShovelItem(ToolMaterialList.phoenixite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELJADE = ITEMS.register("shoveljade", () -> new GemShovelItem(ToolMaterialList.jade, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELCITRINE = ITEMS.register("shovelcitrine", () -> new GemShovelItem(ToolMaterialList.citrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELGARNET = ITEMS.register("shovelgarnet", () -> new GemShovelItem(ToolMaterialList.garnet, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELSPINEL = ITEMS.register("shovelspinel", () -> new GemShovelItem(ToolMaterialList.spinel, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELONYX = ITEMS.register("shovelonyx", () -> new GemShovelItem(ToolMaterialList.onyx, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELAGATE = ITEMS.register("shovelagate", () -> new GemShovelItem(ToolMaterialList.agate, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELMALACHITE = ITEMS.register("shovelmalachite", () -> new GemShovelItem(ToolMaterialList.malachite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELTOURMALINE = ITEMS.register("shoveltourmaline", () -> new GemShovelItem(ToolMaterialList.tourmaline, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELCHRYSOCOLLA = ITEMS.register("shovelchrysocolla", () -> new GemShovelItem(ToolMaterialList.chrysocolla, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELJASPER = ITEMS.register("shoveljasper", () -> new GemShovelItem(ToolMaterialList.jasper, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SHOVELAMETRINE = ITEMS.register("shovelametrine", () -> new GemShovelItem(ToolMaterialList.ametrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> SWORDRUBY = ITEMS.register("swordruby", () -> new GemSwordItem(ToolMaterialList.ruby, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDSAPPHIRE = ITEMS.register("swordsapphire", () -> new GemSwordItem(ToolMaterialList.sapphire, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDAMETHYST = ITEMS.register("swordamethyst", () -> new GemSwordItem(ToolMaterialList.amethyst, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDTOPAZ = ITEMS.register("swordtopaz", () -> new GemSwordItem(ToolMaterialList.topaz, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDPHOENIXITE = ITEMS.register("swordphoenixite", () -> new GemSwordItem(ToolMaterialList.phoenixite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDJADE = ITEMS.register("swordjade", () -> new GemSwordItem(ToolMaterialList.jade, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDCITRINE = ITEMS.register("swordcitrine", () -> new GemSwordItem(ToolMaterialList.citrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDGARNET = ITEMS.register("swordgarnet", () -> new GemSwordItem(ToolMaterialList.garnet, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDSPINEL = ITEMS.register("swordspinel", () -> new GemSwordItem(ToolMaterialList.spinel, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDONYX = ITEMS.register("swordonyx", () -> new GemSwordItem(ToolMaterialList.onyx, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDAGATE = ITEMS.register("swordagate", () -> new GemSwordItem(ToolMaterialList.agate, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDMALACHITE = ITEMS.register("swordmalachite", () -> new GemSwordItem(ToolMaterialList.malachite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDTOURMALINE = ITEMS.register("swordtourmaline", () -> new GemSwordItem(ToolMaterialList.tourmaline, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDCHRYSOCOLLA = ITEMS.register("swordchrysocolla", () -> new GemSwordItem(ToolMaterialList.chrysocolla, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDJASPER = ITEMS.register("swordjasper", () -> new GemSwordItem(ToolMaterialList.jasper, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> SWORDAMETRINE = ITEMS.register("swordametrine", () -> new GemSwordItem(ToolMaterialList.ametrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HOERUBY = ITEMS.register("hoeruby", () -> new GemHoeItem(ToolMaterialList.ruby, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOESAPPHIRE = ITEMS.register("hoesapphire", () -> new GemHoeItem(ToolMaterialList.sapphire, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEAMETHYST = ITEMS.register("hoeamethyst", () -> new GemHoeItem(ToolMaterialList.amethyst, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOETOPAZ = ITEMS.register("hoetopaz", () -> new GemHoeItem(ToolMaterialList.topaz, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEPHOENIXITE = ITEMS.register("hoephoenixite", () -> new GemHoeItem(ToolMaterialList.phoenixite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEJADE = ITEMS.register("hoejade", () -> new GemHoeItem(ToolMaterialList.jade, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOECITRINE = ITEMS.register("hoecitrine", () -> new GemHoeItem(ToolMaterialList.citrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEGARNET = ITEMS.register("hoegarnet", () -> new GemHoeItem(ToolMaterialList.garnet, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOESPINEL = ITEMS.register("hoespinel", () -> new GemHoeItem(ToolMaterialList.spinel, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEONYX = ITEMS.register("hoeonyx", () -> new GemHoeItem(ToolMaterialList.onyx, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEAGATE = ITEMS.register("hoeagate", () -> new GemHoeItem(ToolMaterialList.agate, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEMALACHITE = ITEMS.register("hoemalachite", () -> new GemHoeItem(ToolMaterialList.malachite, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOETOURMALINE = ITEMS.register("hoetourmaline", () -> new GemHoeItem(ToolMaterialList.tourmaline, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOECHRYSOCOLLA = ITEMS.register("hoechrysocolla", () -> new GemHoeItem(ToolMaterialList.chrysocolla, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEJASPER = ITEMS.register("hoejasper", () -> new GemHoeItem(ToolMaterialList.jasper, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> HOEAMETRINE = ITEMS.register("hoeametrine", () -> new GemHoeItem(ToolMaterialList.ametrine, -1, 0.6F, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETRUBY = ITEMS.register("helmetruby", () -> new GemArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATERUBY = ITEMS.register("chestplateruby", () -> new GemArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSRUBY = ITEMS.register("leggingsruby", () -> new GemArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSRUBY = ITEMS.register("bootsruby", () -> new GemArmorItem(ArmorMaterialList.ruby, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETSAPPHIRE = ITEMS.register("helmetsapphire", () -> new GemArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATESAPPHIRE = ITEMS.register("chestplatesapphire", () -> new GemArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSSAPPHIRE = ITEMS.register("leggingssapphire", () -> new GemArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSSAPPHIRE = ITEMS.register("bootssapphire", () -> new GemArmorItem(ArmorMaterialList.sapphire, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETAMETHYST = ITEMS.register("helmetamethyst", () -> new GemArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEAMETHYST = ITEMS.register("chestplateamethyst", () -> new GemArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSAMETHYST = ITEMS.register("leggingsamethyst", () -> new GemArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSAMETHYST = ITEMS.register("bootsamethyst", () -> new GemArmorItem(ArmorMaterialList.amethyst, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETTOPAZ = ITEMS.register("helmettopaz", () -> new GemArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATETOPAZ = ITEMS.register("chestplatetopaz", () -> new GemArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSTOPAZ = ITEMS.register("leggingstopaz", () -> new GemArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSTOPAZ = ITEMS.register("bootstopaz", () -> new GemArmorItem(ArmorMaterialList.topaz, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETPHOENIXITE = ITEMS.register("helmetphoenixite", () -> new GemArmorItem(ArmorMaterialList.phoenixite, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEPHOENIXITE = ITEMS.register("chestplatephoenixite", () -> new GemArmorItem(ArmorMaterialList.phoenixite, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSPHOENIXITE = ITEMS.register("leggingsphoenixite", () -> new GemArmorItem(ArmorMaterialList.phoenixite, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSPHOENIXITE = ITEMS.register("bootsphoenixite", () -> new GemArmorItem(ArmorMaterialList.phoenixite, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETJADE = ITEMS.register("helmetjade", () -> new GemArmorItem(ArmorMaterialList.jade, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEJADE = ITEMS.register("chestplatejade", () -> new GemArmorItem(ArmorMaterialList.jade, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSJADE = ITEMS.register("leggingsjade", () -> new GemArmorItem(ArmorMaterialList.jade, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSJADE = ITEMS.register("bootsjade", () -> new GemArmorItem(ArmorMaterialList.jade, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETCITRINE = ITEMS.register("helmetcitrine", () -> new GemArmorItem(ArmorMaterialList.citrine, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATECITRINE = ITEMS.register("chestplatecitrine", () -> new GemArmorItem(ArmorMaterialList.citrine, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSCITRINE = ITEMS.register("leggingscitrine", () -> new GemArmorItem(ArmorMaterialList.citrine, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSCITRINE = ITEMS.register("bootscitrine", () -> new GemArmorItem(ArmorMaterialList.citrine, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETGARNET = ITEMS.register("helmetgarnet", () -> new GemArmorItem(ArmorMaterialList.garnet, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEGARNET = ITEMS.register("chestplategarnet", () -> new GemArmorItem(ArmorMaterialList.garnet, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSGARNET = ITEMS.register("leggingsgarnet", () -> new GemArmorItem(ArmorMaterialList.garnet, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSGARNET = ITEMS.register("bootsgarnet", () -> new GemArmorItem(ArmorMaterialList.garnet, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETSPINEL = ITEMS.register("helmetspinel", () -> new GemArmorItem(ArmorMaterialList.spinel, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATESPINEL = ITEMS.register("chestplatespinel", () -> new GemArmorItem(ArmorMaterialList.spinel, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSSPINEL = ITEMS.register("leggingsspinel", () -> new GemArmorItem(ArmorMaterialList.spinel, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSSPINEL = ITEMS.register("bootsspinel", () -> new GemArmorItem(ArmorMaterialList.spinel, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETONYX = ITEMS.register("helmetonyx", () -> new GemArmorItem(ArmorMaterialList.onyx, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEONYX = ITEMS.register("chestplateonyx", () -> new GemArmorItem(ArmorMaterialList.onyx, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSONYX = ITEMS.register("leggingsonyx", () -> new GemArmorItem(ArmorMaterialList.onyx, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSONYX = ITEMS.register("bootsonyx", () -> new GemArmorItem(ArmorMaterialList.onyx, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETAGATE = ITEMS.register("helmetagate", () -> new GemArmorItem(ArmorMaterialList.agate, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEAGATE = ITEMS.register("chestplateagate", () -> new GemArmorItem(ArmorMaterialList.agate, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSAGATE = ITEMS.register("leggingsagate", () -> new GemArmorItem(ArmorMaterialList.agate, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSAGATE = ITEMS.register("bootsagate", () -> new GemArmorItem(ArmorMaterialList.agate, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETMALACHITE = ITEMS.register("helmetmalachite", () -> new GemArmorItem(ArmorMaterialList.malachite, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEMALACHITE = ITEMS.register("chestplatemalachite", () -> new GemArmorItem(ArmorMaterialList.malachite, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSMALACHITE = ITEMS.register("leggingsmalachite", () -> new GemArmorItem(ArmorMaterialList.malachite, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSMALACHITE = ITEMS.register("bootsmalachite", () -> new GemArmorItem(ArmorMaterialList.malachite, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETTOURMALINE = ITEMS.register("helmettourmaline", () -> new GemArmorItem(ArmorMaterialList.tourmaline, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATETOURMALINE = ITEMS.register("chestplatetourmaline", () -> new GemArmorItem(ArmorMaterialList.tourmaline, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSTOURMALINE = ITEMS.register("leggingstourmaline", () -> new GemArmorItem(ArmorMaterialList.tourmaline, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSTOURMALINE = ITEMS.register("bootstourmaline", () -> new GemArmorItem(ArmorMaterialList.tourmaline, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETCHRYSOCOLLA = ITEMS.register("helmetchrysocolla", () -> new GemArmorItem(ArmorMaterialList.chrysocolla, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATECHRYSOCOLLA = ITEMS.register("chestplatechrysocolla", () -> new GemArmorItem(ArmorMaterialList.chrysocolla, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSCHRYSOCOLLA = ITEMS.register("leggingschrysocolla", () -> new GemArmorItem(ArmorMaterialList.chrysocolla, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSCHRYSOCOLLA = ITEMS.register("bootschrysocolla", () -> new GemArmorItem(ArmorMaterialList.chrysocolla, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETJASPER = ITEMS.register("helmetjasper", () -> new GemArmorItem(ArmorMaterialList.jasper, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEJASPER = ITEMS.register("chestplatejasper", () -> new GemArmorItem(ArmorMaterialList.jasper, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSJASPER = ITEMS.register("leggingsjasper", () -> new GemArmorItem(ArmorMaterialList.jasper, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSJASPER = ITEMS.register("bootsjasper", () -> new GemArmorItem(ArmorMaterialList.jasper, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));

	public static final RegistryObject<Item> HELMETAMETRINE = ITEMS.register("helmetametrine", () -> new GemArmorItem(ArmorMaterialList.ametrine, EquipmentSlotType.HEAD, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> CHESTPLATEAMETRINE = ITEMS.register("chestplateametrine", () -> new GemArmorItem(ArmorMaterialList.ametrine, EquipmentSlotType.CHEST, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> LEGGINGSAMETRINE = ITEMS.register("leggingsametrine", () -> new GemArmorItem(ArmorMaterialList.ametrine, EquipmentSlotType.LEGS, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
	public static final RegistryObject<Item> BOOTSAMETRINE = ITEMS.register("bootsametrine", () -> new GemArmorItem(ArmorMaterialList.ametrine, EquipmentSlotType.FEET, new Item.Properties().group(GemsPlusPlus.gemsplusplusitem)));
}
