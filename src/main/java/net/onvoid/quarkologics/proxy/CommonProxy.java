package net.onvoid.quarkologics.proxy;

import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.quarkologics.Quarkologics;
import net.onvoid.quarkologics.common.QuarkologicsBlocks;

public class CommonProxy {

    public void start() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        Quarkologics.REGISTRY_HELPER.register(modBus);
        modBus.addListener(this::setup);
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent e) {
        e.enqueueWork(() -> {
            // Azalea
            DataUtil.registerFlammable(QuarkologicsBlocks.AZALEA_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.STRIPPED_AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.AZALEA_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.AZALEA_BOOKSHELF.get(), 30, 20);
            //DataUtil.registerFlammable(QuarkologicsBlocks.AZALEA_CRAFTING_TABLE.get(), 5, 20);
            // Flowering Azalea
            DataUtil.registerFlammable(QuarkologicsBlocks.FLOWERING_AZALEA_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.FLOWERING_AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.FLOWERING_AZALEA_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.FLOWERING_AZALEA_BOOKSHELF.get(), 30, 20);
            //DataUtil.registerFlammable(QuarkologicsBlocks.FLOWERING_AZALEA_CRAFTING_TABLE.get(), 5, 20);
            // Coconut
            DataUtil.registerFlammable(QuarkologicsBlocks.COCONUT_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.COCONUT_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.STRIPPED_COCONUT_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.COCONUT_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.COCONUT_BOOKSHELF.get(), 30, 20);
            // Walnut
            DataUtil.registerFlammable(QuarkologicsBlocks.WALNUT_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.WALNUT_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.STRIPPED_WALNUT_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.WALNUT_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkologicsBlocks.WALNUT_BOOKSHELF.get(), 30, 20);
            // Blossom
            //DataUtil.registerFlammable(QuarkologicsBlocks.BLOSSOM_CRAFTING_TABLE.get(), 5, 20);
        });
    }
}
