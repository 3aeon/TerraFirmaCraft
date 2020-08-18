/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects;

import java.util.function.Supplier;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.Lazy;

import net.dries007.tfc.TerraFirmaCraft;
import net.dries007.tfc.api.Metal;
import net.dries007.tfc.api.Rock;
import net.dries007.tfc.objects.blocks.Gem;
import net.dries007.tfc.objects.blocks.TFCBlocks;
import net.dries007.tfc.objects.items.TFCItems;

public final class TFCItemGroup extends ItemGroup
{
    public static final ItemGroup ROCK_BLOCKS = new TFCItemGroup(TerraFirmaCraft.MOD_ID + ".rock.blocks", () -> new ItemStack(TFCBlocks.ROCKS.get(Rock.Default.QUARTZITE).get(Rock.BlockType.RAW).get()));
    //public static final ItemGroup ROCK_ITEMS = new TFCItemGroup("rock.items", "tfc:ore/tetrahedrite");
    //public static final ItemGroup WOOD = new TFCItemGroup("wood", "tfc:wood/log/pine");
    public static final ItemGroup DECORATIONS = new TFCItemGroup(TerraFirmaCraft.MOD_ID + ".decorations", () -> new ItemStack(TFCBlocks.ROCK_STAIRS.get(Rock.Default.CONGLOMERATE).get(Rock.BlockType.MOSSY_COBBLE).get()));
    //public static final ItemGroup METAL = new TFCItemGroup("metal", "tfc:metal/ingot/bronze");
    public static final ItemGroup GEMS = new TFCItemGroup(TerraFirmaCraft.MOD_ID + ".gems", () -> new ItemStack(TFCItems.GEMS.get(Gem.OPAL).get(Gem.Grade.CUT).get()));
    public static final ItemGroup METAL = new TFCItemGroup(TerraFirmaCraft.MOD_ID + ".metals", () -> new ItemStack(TFCItems.METAL_ITEMS.get(Metal.Default.BRONZE).get(Metal.ItemType.INGOT).get()));
    //public static final ItemGroup GEMS = new TFCItemGroup("gems", "tfc:gem/diamond");
    //public static final ItemGroup POTTERY = new TFCItemGroup("pottery", "tfc:ceramics/fired/mold/ingot");
    //public static final ItemGroup FOOD = new TFCItemGroup("food", "tfc:food/green_apple");
    public static final ItemGroup MISC = new TFCItemGroup(TerraFirmaCraft.MOD_ID + ".misc", () -> new ItemStack(TFCItems.ROCK_ITEMS.get(Rock.Default.CHERT).get(Rock.ItemType.BRICK).get()));
    //public static final ItemGroup FLORA = new TFCItemGroup("flora", "tfc:plants/goldenrod");

    private final Lazy<ItemStack> iconStack;

    private TFCItemGroup(String label, Supplier<ItemStack> iconSupplier)
    {
        super(label);
        this.iconStack = Lazy.of(iconSupplier);
    }

    @Override
    public ItemStack createIcon()
    {
        return iconStack.get();
    }
}