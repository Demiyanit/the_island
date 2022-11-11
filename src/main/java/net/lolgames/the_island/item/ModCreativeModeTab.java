package net.lolgames.the_island.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THE_ISLAND_TAB = new CreativeModeTab("the_island_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DREAMCLUSTER.get());
        }
    };
}
