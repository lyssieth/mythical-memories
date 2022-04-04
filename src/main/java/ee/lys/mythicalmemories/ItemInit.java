package ee.lys.mythicalmemories;

import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class ItemInit implements ItemRegistryContainer {

    public static final Item MEMORY = new Item(new Item.Settings().fireproof().maxCount(64).rarity(Rarity.EPIC).group(MythicalMemories.MOD_GROUP));
}
