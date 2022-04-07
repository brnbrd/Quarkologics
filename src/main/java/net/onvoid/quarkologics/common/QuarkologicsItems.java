package net.onvoid.quarkologics.common;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.quarkologics.Quarkologics;

@Mod.EventBusSubscriber(modid = Quarkologics.MODID)
public class QuarkologicsItems {
    public static final ItemSubRegistryHelper HELPER = Quarkologics.REGISTRY_HELPER.getItemSubHelper();
}
