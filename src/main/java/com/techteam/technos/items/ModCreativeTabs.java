package com.techteam.technos.items;

import com.techteam.technos.Technos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Technos.MODID);

    public static final Supplier<CreativeModeTab> INSTRUMENTS_TAB = CREATIVE_MODE_TABS.register("instruments", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Technos.MODID + ".example"))
            .icon(() -> new ItemStack(ModItems.SCREWDRIVER.get()))
            .displayItems((params, output) -> {

                output.accept(ModItems.SCREWDRIVER.get());

            })
            .build()
    );
}
