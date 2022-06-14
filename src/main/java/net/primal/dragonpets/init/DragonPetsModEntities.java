
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.primal.dragonpets.entity.SpaceDragonEntity;
import net.primal.dragonpets.entity.RedstoneDragonEntity;
import net.primal.dragonpets.entity.LapisDragonEntity;
import net.primal.dragonpets.entity.IronDragonEntity;
import net.primal.dragonpets.entity.IceDragonEntity;
import net.primal.dragonpets.entity.GoldDragonEntity;
import net.primal.dragonpets.entity.FireDragonEntity;
import net.primal.dragonpets.entity.EndDragonEntity;
import net.primal.dragonpets.entity.DiamondDragonEntity;
import net.primal.dragonpets.entity.CopperDragonEntity;
import net.primal.dragonpets.entity.CoalDragonEntity;
import net.primal.dragonpets.entity.AmethystDragonEntity;
import net.primal.dragonpets.DragonPetsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonPetsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DragonPetsMod.MODID);
	public static final RegistryObject<EntityType<IceDragonEntity>> ICE_DRAGON = register("ice_dragon",
			EntityType.Builder.<IceDragonEntity>of(IceDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IceDragonEntity::new)

					.sized(0.7000000000000001f, 0.8f));
	public static final RegistryObject<EntityType<FireDragonEntity>> FIRE_DRAGON = register("fire_dragon",
			EntityType.Builder.<FireDragonEntity>of(FireDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireDragonEntity::new).fireImmune().sized(0.7f, 0.8f));
	public static final RegistryObject<EntityType<DiamondDragonEntity>> DIAMOND_DRAGON = register("diamond_dragon",
			EntityType.Builder.<DiamondDragonEntity>of(DiamondDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiamondDragonEntity::new).fireImmune()
					.sized(0.7f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<GoldDragonEntity>> GOLD_DRAGON = register("gold_dragon",
			EntityType.Builder.<GoldDragonEntity>of(GoldDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldDragonEntity::new).fireImmune()
					.sized(0.7000000000000001f, 0.8f));
	public static final RegistryObject<EntityType<RedstoneDragonEntity>> REDSTONE_DRAGON = register("redstone_dragon",
			EntityType.Builder.<RedstoneDragonEntity>of(RedstoneDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedstoneDragonEntity::new)

					.sized(0.7f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<LapisDragonEntity>> LAPIS_DRAGON = register("lapis_dragon",
			EntityType.Builder.<LapisDragonEntity>of(LapisDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LapisDragonEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<IronDragonEntity>> IRON_DRAGON = register("iron_dragon",
			EntityType.Builder.<IronDragonEntity>of(IronDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IronDragonEntity::new).fireImmune().sized(0.7f, 0.8f));
	public static final RegistryObject<EntityType<CopperDragonEntity>> COPPER_DRAGON = register("copper_dragon",
			EntityType.Builder.<CopperDragonEntity>of(CopperDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CopperDragonEntity::new)

					.sized(0.7000000000000001f, 0.8f));
	public static final RegistryObject<EntityType<CoalDragonEntity>> COAL_DRAGON = register("coal_dragon",
			EntityType.Builder.<CoalDragonEntity>of(CoalDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoalDragonEntity::new).fireImmune()
					.sized(0.7999999999999999f, 0.9f));
	public static final RegistryObject<EntityType<AmethystDragonEntity>> AMETHYST_DRAGON = register("amethyst_dragon",
			EntityType.Builder.<AmethystDragonEntity>of(AmethystDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmethystDragonEntity::new)

					.sized(0.7f, 0.8f));
	public static final RegistryObject<EntityType<SpaceDragonEntity>> SPACE_DRAGON = register("space_dragon",
			EntityType.Builder.<SpaceDragonEntity>of(SpaceDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpaceDragonEntity::new).fireImmune()
					.sized(0.7000000000000001f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<EndDragonEntity>> END_DRAGON = register("end_dragon",
			EntityType.Builder.<EndDragonEntity>of(EndDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndDragonEntity::new)

					.sized(0.9f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IceDragonEntity.init();
			FireDragonEntity.init();
			DiamondDragonEntity.init();
			GoldDragonEntity.init();
			RedstoneDragonEntity.init();
			LapisDragonEntity.init();
			IronDragonEntity.init();
			CopperDragonEntity.init();
			CoalDragonEntity.init();
			AmethystDragonEntity.init();
			SpaceDragonEntity.init();
			EndDragonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ICE_DRAGON.get(), IceDragonEntity.createAttributes().build());
		event.put(FIRE_DRAGON.get(), FireDragonEntity.createAttributes().build());
		event.put(DIAMOND_DRAGON.get(), DiamondDragonEntity.createAttributes().build());
		event.put(GOLD_DRAGON.get(), GoldDragonEntity.createAttributes().build());
		event.put(REDSTONE_DRAGON.get(), RedstoneDragonEntity.createAttributes().build());
		event.put(LAPIS_DRAGON.get(), LapisDragonEntity.createAttributes().build());
		event.put(IRON_DRAGON.get(), IronDragonEntity.createAttributes().build());
		event.put(COPPER_DRAGON.get(), CopperDragonEntity.createAttributes().build());
		event.put(COAL_DRAGON.get(), CoalDragonEntity.createAttributes().build());
		event.put(AMETHYST_DRAGON.get(), AmethystDragonEntity.createAttributes().build());
		event.put(SPACE_DRAGON.get(), SpaceDragonEntity.createAttributes().build());
		event.put(END_DRAGON.get(), EndDragonEntity.createAttributes().build());
	}
}
