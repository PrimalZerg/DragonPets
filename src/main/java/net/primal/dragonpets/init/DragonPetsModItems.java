
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.primal.dragonpets.DragonPetsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class DragonPetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonPetsMod.MODID);
	public static final RegistryObject<Item> ICE_DRAGON = REGISTRY.register("ice_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.ICE_DRAGON, -1447425, -5715220,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> FIRE_DRAGON = REGISTRY.register("fire_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.FIRE_DRAGON, -65536, -31232, new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> DIAMOND_DRAGON = REGISTRY.register("diamond_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.DIAMOND_DRAGON, -11711155, -6818566,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> GOLD_DRAGON = REGISTRY.register("gold_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.GOLD_DRAGON, -11776687, -337909,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> REDSTONE_DRAGON = REGISTRY.register("redstone_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.REDSTONE_DRAGON, -9540243, -1372116,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> IRON_DRAGON = REGISTRY.register("iron_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.IRON_DRAGON, -10526622, -2380152,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> COPPER_DRAGON = REGISTRY.register("copper_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.COPPER_DRAGON, -1018588, -13639007,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> AMETHYST_DRAGON = REGISTRY.register("amethyst_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.AMETHYST_DRAGON, -12237493, -7844110,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> SPACE_DRAGON = REGISTRY.register("space_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.SPACE_DRAGON, -16777216, -664321,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
	public static final RegistryObject<Item> END_DRAGON = REGISTRY.register("end_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonPetsModEntities.END_DRAGON, -15790321, -7914562,
					new Item.Properties().tab(DragonPetsModTabs.TAB_DRAGONS)));
}
