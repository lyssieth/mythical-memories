package ee.lys.mythicalmemories.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MemoryCore extends Block {
    public MemoryCore(final Settings settings) {
        super(settings);
    }

    @Override
    public final ActionResult onUse(final BlockState state, final World world, final BlockPos pos, final PlayerEntity player, final Hand hand, final BlockHitResult hit) {
        if (!world.isClient && player.getMainHandStack().isEmpty()) {
            player.sendMessage(Text.of("Hello, world!"), true);
        }

        return ActionResult.SUCCESS;
    }
}
