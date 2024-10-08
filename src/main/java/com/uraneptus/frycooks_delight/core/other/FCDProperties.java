package com.uraneptus.frycooks_delight.core.other;

import com.uraneptus.frycooks_delight.core.registry.FCDBlocks;
import com.uraneptus.frycooks_delight.core.registry.FCDFluids;
import com.uraneptus.frycooks_delight.core.registry.FCDItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FCDProperties {
    public static final BlockBehaviour.Properties CRATE = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties CANOLA_PLANT = BlockBehaviour.Properties.copy(Blocks.WHEAT);
    public static final BlockBehaviour.Properties WILD_CANOLA = BlockBehaviour.Properties.copy(Blocks.TALL_GRASS);
    public static final BlockBehaviour.Properties HOT_GREASE = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).speedFactor(0.5F).noCollission().strength(100).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY);
    public static final BlockBehaviour.Properties CANOLA_OIL_CAULDRON = BlockBehaviour.Properties.copy(Blocks.CAULDRON).randomTicks();
    public static final BlockBehaviour.Properties LARD_BLOCK = BlockBehaviour.Properties.of().mapColor(MapColor.SAND).friction(0.98F).sound(SoundType.HONEY_BLOCK);

    public static final Item.Properties HOT_GREASE_BUCKET = new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1);
    public static final Item.Properties FRIED_POTATO = new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.25F).build());
    public static final Item.Properties PLAIN_DONUT = new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.2F).build());
    public static final Item.Properties FRIED_ONION_RING = new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.15F).build());
    public static final Item.Properties FRIED_FISH_SLICE = new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.35F).build());
    public static final Item.Properties FRIED_CHICKEN_LEG = new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.2F).build());
    public static final Item.Properties BURNT_MORSEL = new Item.Properties().food(new FoodProperties.Builder().nutrition(1).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600), 0.5F).build());

    public static final ForgeFlowingFluid.Properties HOT_GREASE_FLUID = new ForgeFlowingFluid.Properties(FCDFluids.HOT_GREASE_FLUID_TYPE, FCDFluids.HOT_GREASE_SOURCE, FCDFluids.HOT_GREASE_FLOWING)
            .bucket(FCDItems.HOT_GREASE_BUCKET).block(FCDBlocks.HOT_GREASE);

}
