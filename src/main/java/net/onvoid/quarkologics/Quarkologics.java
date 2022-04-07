package net.onvoid.quarkologics;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.quarkologics.proxy.ClientProxy;
import net.onvoid.quarkologics.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Quarkologics.MODID)
public class Quarkologics
{
    public static final String MODID = "quarkologics";
    public static Quarkologics instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public Quarkologics() {
        instance = this;
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }
}
