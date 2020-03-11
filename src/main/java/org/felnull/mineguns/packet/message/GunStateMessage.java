package org.felnull.mineguns.packet.message;

import net.minecraft.network.PacketBuffer;

public class GunStateMessage {
	public int State;

	public GunStateMessage() {

	}

	public GunStateMessage(int state) {
		this.State = state;
	}

	public int read(PacketBuffer buffer) {
		return State;
	}

	public static void write(GunStateMessage message, PacketBuffer buffer) {
		buffer.writeInt(message.State);
	}

	public static void encodeMessege(GunStateMessage messegeIn, PacketBuffer buffer) {
		buffer.writeInt(messegeIn.read(buffer));
		write(messegeIn, buffer);
	}

	public static GunStateMessage decodeMessege(PacketBuffer buffer) {

		return new GunStateMessage(buffer.readInt());
	}
}
