package com.vulpesx.btn.common.item;

import com.vulpesx.btn.BtnMod;
import net.minecraft.core.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.intellij.lang.annotations.Identifier;

public class BtnItems {
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BtnMod.MODID);

    public static RegistryObject<Item> PRETZEL = ITEMS.register("pretzel_item", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0).build()))
            );

    public static void init () {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
