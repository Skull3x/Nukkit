package cn.nukkit.entity.item;

import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * Created by Snake1999 on 2016/1/30.
 * Package cn.nukkit.entity.item in project Nukkit.
 */
public class EntityMinecartChest extends EntityMinecartEmpty {

    // TODO: 2016/1/30 NETWORK_ID

    public EntityMinecartChest(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    // TODO: 2016/1/30 inventory

}
