package ee.lys.mythicalmemories;

import ee.lys.mythicalmemories.blocks.MemoryCore;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

/**
 * The block initialization class for Mythical Memories.
 *
 * @author Lyssieth
 */
public final class BlockInit implements BlockRegistryContainer {

    public static final MemoryCore MEMORY_CORE = new MemoryCore(
            FabricBlockSettings
                    .of(Material.GLASS)
                    .strength(5.0f)
                    .requiresTool()
                    .luminance(3)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.GLASS));

    @Override
    public BlockItem createBlockItem(final Block block, final String identifier) {
        return new BlockItem(block, new Item.Settings().group(MythicalMemories.MOD_GROUP));
    }
}
