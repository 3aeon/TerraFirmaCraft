package net.dries007.tfc.objects.entity;

import net.dries007.tfc.TerraFirmaCraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import static net.dries007.tfc.Constants.MOD_ID;

public class EntitiesTFC
{
    private static int id = 1; // don't use id 0, it's easier to debug if something goes wrong

    private static void register(String name, Class<? extends Entity> cls)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(MOD_ID, name), cls, name, id++, TerraFirmaCraft.getInstance(), 160, 20, true);
    }

    public static void preInit()
    {
        register("falling_block", EntityFallingBlockTFC.class);
    }
}
