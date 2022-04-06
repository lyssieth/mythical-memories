package ee.lys.mythicalmemories;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MythicalMemories implements ModInitializer {
    public static final String MOD_ID = "mythicalmemories";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "group"))
            .icon(() -> new ItemStack(ItemInit.MEMORY))
            .build();

    @Override
    public void onInitialize() {
        FieldRegistrationHandler.register(ItemInit.class, MOD_ID, false);
        FieldRegistrationHandler.register(BlockInit.class, MOD_ID, false);

        LOGGER.info("Hello, mythical memories!");
    }
}
