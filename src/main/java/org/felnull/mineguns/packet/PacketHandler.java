package org.felnull.mineguns.packet;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.handler.GunStateMessageHandler;
import org.felnull.mineguns.packet.message.GunStateMessage;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {
	public static final String PROTOCOL_VERSION = "1";
	private static int id;
	public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
			.named(new ResourceLocation(MineGuns.MODID, "mineguns_channel"))
			.clientAcceptedVersions(a -> true).serverAcceptedVersions(a -> true)
			.networkProtocolVersion(() -> PROTOCOL_VERSION)
			.simpleChannel();

	public static int nextIDget() {
		id++;
		return id - 1;
	}

	public static void init() {
		INSTANCE.registerMessage(nextIDget(), GunStateMessage.class, GunStateMessage::encodeMessege,
				GunStateMessage::decodeMessege, GunStateMessageHandler::reversiveMessage);
	}

}
