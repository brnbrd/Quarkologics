package net.onvoid.quarkologics.common;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;

public class QuarkologicsCraftingMenu extends CraftingMenu {

    private final ContainerLevelAccess access;
    private final Block containerBlock;

    public QuarkologicsCraftingMenu(int p_39356_, Inventory p_39357_, ContainerLevelAccess p_39358_, Block containerBlock) {
        super(p_39356_, p_39357_, p_39358_);
        this.access = p_39358_;
        this.containerBlock = containerBlock;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(this.access, pPlayer, this.containerBlock);
    }
}
