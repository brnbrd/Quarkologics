package net.onvoid.quarkologics.proxy;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.quarkologics.Quarkologics;
import net.onvoid.quarkologics.common.QuarkologicsBlocks;
import samebutdifferent.ecologics.registry.ModBlocks;

public class ClientProxy extends CommonProxy {

    @Override
    public void start() {
        super.start();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        modBus.addListener(this::setupClient);
        modBus.addListener(this::registerBlockColors);
        modBus.addListener(this::registerItemColors);
    }

    @SubscribeEvent
    public void setupClient(FMLClientSetupEvent e){
        // Azalea
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.AZALEA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.STRIPPED_AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.AZALEA_HEDGE.get(), RenderType.cutout());
        // Flowering Azalea
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.FLOWERING_AZALEA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.FLOWERING_AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.FLOWERING_AZALEA_HEDGE.get(), RenderType.cutout());
        // Coconut
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.COCONUT_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.COCONUT_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.STRIPPED_COCONUT_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.COCONUT_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.COCONUT_LEAF_CARPET.get(), RenderType.cutout());
        // Walnut
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.WALNUT_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.WALNUT_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.STRIPPED_WALNUT_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.WALNUT_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkologicsBlocks.WALNUT_LEAF_CARPET.get(), RenderType.cutout());
    }

    @SubscribeEvent
    public void registerBlockColors(ColorHandlerEvent.Block e) {
        e.getBlockColors().register((pState, pLevel, pPos, pTintIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), QuarkologicsBlocks.COCONUT_HEDGE.get());
        e.getBlockColors().register((pState, pLevel, pPos, pTintIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), QuarkologicsBlocks.COCONUT_LEAF_CARPET.get());
    }

    @SubscribeEvent
    public void registerItemColors(ColorHandlerEvent.Item e) {
        e.getItemColors().register((pStack, pTintIndex) -> {
            BlockState blockstate = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return e.getBlockColors().getColor(blockstate, null, null, pTintIndex);
        }, QuarkologicsBlocks.COCONUT_HEDGE.get());
        e.getItemColors().register((pStack, pTintIndex) -> {
            BlockState blockstate = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return e.getBlockColors().getColor(blockstate, null, null, pTintIndex);
        }, QuarkologicsBlocks.COCONUT_LEAF_CARPET.get());
    }
}
