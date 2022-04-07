package net.onvoid.quarkologics.common;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class QuarkologicsCraftingTableBlock extends CraftingTableBlock {
    private static final Component CONTAINER_TITLE = new TranslatableComponent("container.crafting");

    public QuarkologicsCraftingTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
        return new SimpleMenuProvider((p_52229_, p_52230_, p_52231_) -> new QuarkologicsCraftingMenu(p_52229_, p_52230_, ContainerLevelAccess.create(pLevel, pPos), this), CONTAINER_TITLE);
    }
}
