package com.techteam.technos.blocks;


import com.techteam.technos.Technos;
import com.techteam.technos.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Technos.MODID);

    public static final DeferredBlock<Block> LI_BLOCK = BLOCKS.register("li_block", registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel(state -> 7)
            ));
    public static final DeferredItem<BlockItem> LI_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("li_block", LI_BLOCK);
}
