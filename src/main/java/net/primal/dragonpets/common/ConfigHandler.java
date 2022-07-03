package net.primal.dragonpets.common;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.IRegistryDelegate;
import net.primal.dragonpets.DragonPetsMod;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

public class ConfigHandler {

    public static ClientConfig CLIENT;
    public static ServerConfig SERVER;
    private static ForgeConfigSpec CONFIG_SERVER_SPEC;
    private static ForgeConfigSpec CONFIG_CLIENT_SPEC;

    public static void init(IEventBus modEventBus) {
        Pair<ServerConfig, ForgeConfigSpec> commonPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
        CONFIG_SERVER_SPEC = commonPair.getRight();
        SERVER = commonPair.getLeft();
        Pair<ClientConfig, ForgeConfigSpec> clientPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
        CONFIG_CLIENT_SPEC = clientPair.getRight();
        CLIENT = clientPair.getLeft();
        DragonPetsMod.LOGGER.debug("Register configs");

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CONFIG_SERVER_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CONFIG_CLIENT_SPEC);
    }

    public static class ClientConfig {

//        public ForgeConfigSpec.BooleanValue DIRE_PARTICLES;

        public ClientConfig(ForgeConfigSpec.Builder builder) {
            {
                builder.push("General");

                builder.pop();
            }
        }
    }

    public static class ServerConfig {

        public ForgeConfigSpec.IntValue ACACIA_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue AMETHYST_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue BIRCH_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue COAL_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue COPPER_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue DARKOAK_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue DIAMOND_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue END_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue FIRE_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue GOLD_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue ICE_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue IRON_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue JUNGLE_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue LAPIS_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue OAK_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue REDSTONE_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue SPACE_DRAGON_SPAWN_WEIGHT;
        public ForgeConfigSpec.IntValue SPRUCE_DRAGON_SPAWN_WEIGHT;

        public Map<String, ForgeConfigSpec.BooleanValue> DISABLED_TALENTS;

        public ServerConfig(ForgeConfigSpec.Builder builder) {
            {
                builder.push("General");

                builder.pop();
            }

            {
                builder.push("Spawning");

                //DEBUG_MODE = builder
                //        .comment("Enables debugging mode, which would output values for the sake of finding issues in the mod.")
                //        .define("debugMode", false);
                ACACIA_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for acacia dragons").translation("Spawn weight for acacia dragons").defineInRange("acacia_dragon_spawn_weight", 60, 1, 200);
                AMETHYST_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for amethyst dragons").translation("Spawn weight for amethyst dragons").defineInRange("amethyst_dragon_spawn_weight", 30, 1, 200);
                BIRCH_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for birch dragons").translation("Spawn weight for birch dragons").defineInRange("birch_dragon_spawn_weight", 60, 1, 200);
                COAL_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for coal dragons").translation("Spawn weight for coal dragons").defineInRange("coal_dragon_spawn_weight", 40, 1, 200);
                COPPER_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for copper dragons").translation("Spawn weight for copper dragons").defineInRange("copper_dragon_spawn_weight", 50, 1, 200);
                DARKOAK_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for dark oak dragons").translation("Spawn weight for dark oak dragons").defineInRange("dark_oak_dragon_spawn_weight", 60, 1, 200);
                DIAMOND_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for diamond dragons").translation("Spawn weight for diamond dragons").defineInRange("diamond_dragon_spawn_weight", 20, 1, 200);
                END_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for end dragons").translation("Spawn weight for end dragons").defineInRange("end_dragon_spawn_weight", 20, 1, 200);
                FIRE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for fire dragons").translation("Spawn weight for fire dragons").defineInRange("fire_dragon_spawn_weight", 50, 1, 200);
                GOLD_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for gold dragons").translation("Spawn weight for gold dragons").defineInRange("gold_dragon_spawn_weight", 50, 1, 200);
                ICE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for ice dragons").translation("Spawn weight for ice dragons").defineInRange("ice_dragon_spawn_weight", 50, 1, 200);
                IRON_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for iron dragons").translation("Spawn weight for iron dragons").defineInRange("iron_dragon_spawn_weight", 80, 1, 200);
                JUNGLE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for jungle dragons").translation("Spawn weight for jungle dragons").defineInRange("jungle_dragon_spawn_weight", 60, 1, 200);
                LAPIS_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for lapis dragons").translation("Spawn weight for lapis dragons").defineInRange("lapis_dragon_spawn_weight", 40, 1, 200);
                OAK_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for oak dragons").translation("Spawn weight for oak dragons").defineInRange("oak_dragon_spawn_weight", 60, 1, 200);
                REDSTONE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for redstone dragons").translation("Spawn weight for redstone dragons").defineInRange("redstone_dragon_spawn_weight", 40, 1, 200);
                SPACE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for space dragons").translation("Spawn weight for space dragons").defineInRange("space_dragon_spawn_weight", 20, 1, 200);
                SPRUCE_DRAGON_SPAWN_WEIGHT = builder.comment("Spawn weight for spruce dragons").translation("Spawn weight for spruce dragons").defineInRange("spruce_dragon_spawn_weight", 60, 1, 200);

                builder.pop();
            }

        }
    }

}