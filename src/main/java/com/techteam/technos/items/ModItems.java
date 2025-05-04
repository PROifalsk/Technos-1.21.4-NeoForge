package com.techteam.technos.items;

import com.techteam.technos.Technos;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Technos.MODID);

    public static final DeferredItem<Item> SCREWDRIVER = ITEMS.registerItem("screwdriver", Item::new, new Item.Properties());
}
