package cn.nukkit.network.protocol;

import cn.nukkit.item.Item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class MobEquipmentPacket extends DataPacket {
    public static final byte NETWORK_ID = ProtocolInfo.MOB_EQUIPMENT_PACKET;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    public long eid;
    public Item item;
    public int slot;
    public int selectedSlot;

    @Override
    public void decode() {
        this.eid = this.getLong();
        this.item = this.getSlot();
        this.slot = this.getByte();
        this.selectedSlot = this.getByte();
    }

    @Override
    public void encode() {
        this.reset();
        this.putLong(this.eid);
        this.putSlot(this.item);
        this.putByte((byte) this.slot);
        this.putByte((byte) this.selectedSlot);
    }
}
