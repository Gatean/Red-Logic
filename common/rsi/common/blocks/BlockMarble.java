package rsi.common.blocks;

import java.util.*;
import net.minecraft.src.*;

public class BlockMarble extends Block
{
    public BlockMarble(int blockID)
    {
        super(blockID, 0, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
    }
    
    public String getTextureFile()
    {
		return "/rsi/gfx/blocks/blocks.png";
    }

    public void getSubBlocks(int blockID, CreativeTabs tab, List blockList)
    {
        blockList.add(new ItemStack(blockID, 1, 0);
        blockList.add(new ItemStack(blockID, 1, 1);
    }

    public int idDropped(int meta, Random random, int fortune)
    {
        return this.blockID;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
        switch (meta)
        {
            case 0: return 3;
            case 1: return 4;
            default: return 0;
        }
    }

    public int damageDropped(int meta)
    {
        return meta;
    }

    public int idPicked(World world, int x, int y, int z)
    {
        return this.blockID;
    }
}
