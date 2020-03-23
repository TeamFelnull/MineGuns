package org.felnull.mineguns.packet.message;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Hand;

public class GunStateMessage {
	public int State;
	public Hand Handa;
	public boolean Active;

	public GunStateMessage() {

	}

	public GunStateMessage(int state, Hand hand, boolean active) {
		this.State = state;
		this.Handa = hand;
		this.Active = active;
	}

	public int readInt(PacketBuffer buffer) {
		return State;
	}

	public boolean[] readBoolean(PacketBuffer buffer) {

		boolean[] bos = { Handa == Hand.MAIN_HAND, Active };

		return bos;
	}

	public static void write(GunStateMessage message, PacketBuffer buffer) {
		buffer.writeInt(message.State);
		buffer.writeBoolean(message.Handa == Hand.MAIN_HAND ? false : true);
		buffer.writeBoolean(message.Active);

	}

	public static void encodeMessege(GunStateMessage messegeIn, PacketBuffer buffer) {
		buffer.writeInt(messegeIn.readInt(buffer));
		buffer.writeBoolean(messegeIn.readBoolean(buffer)[0]);
		buffer.writeBoolean(messegeIn.readBoolean(buffer)[1]);

		write(messegeIn, buffer);
	}

	public static GunStateMessage decodeMessege(PacketBuffer buffer) {

		return new GunStateMessage(buffer.readInt(), buffer.readBoolean() ? Hand.OFF_HAND : Hand.MAIN_HAND,
				buffer.readBoolean());
	}
}
