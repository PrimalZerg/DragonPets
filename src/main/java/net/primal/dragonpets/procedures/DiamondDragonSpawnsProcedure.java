package net.primal.dragonpets.procedures;

import net.primal.dragonpets.init.DragonPetsModEntities;
import net.primal.dragonpets.entity.DiamondDragonEntity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.WorldEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class DiamondDragonSpawnsProcedure {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		execute(event, event.getWorld());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		double generator_distance = 0;
		if ((world.getBlockState(
				new BlockPos(Mth.nextInt(new Random(), -65, 1), Mth.nextInt(new Random(), -65, 1) - 1, Mth.nextInt(new Random(), -65, 1))))
				.getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE && world.isEmptyBlock(new BlockPos(raytrace_z, raytrace_y + 1, raytrace_z))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DiamondDragonEntity(DragonPetsModEntities.DIAMOND_DRAGON.get(), _level);
				entityToSpawn.moveTo(generator_distance, generator_distance, generator_distance, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
