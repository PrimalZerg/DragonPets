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
		boolean found = false;
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		double generator_distance = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sy = new Random().nextGaussian();
		found = false;
		if ((world.getBlockState(new BlockPos(Math.min(Math.random(), -65), Math.min(Math.random(), -65), Math.min(Math.random(), -65))))
				.getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE && (world.getBlockState(new BlockPos(sx + 0, sy + 1, sz + 0))).getBlock() == Blocks.AIR) {
			found = true;
		}
		sz = sz + 1;
		if (found == true) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DiamondDragonEntity(DragonPetsModEntities.DIAMOND_DRAGON.get(), _level);
				entityToSpawn.moveTo(0, 1, 0, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
