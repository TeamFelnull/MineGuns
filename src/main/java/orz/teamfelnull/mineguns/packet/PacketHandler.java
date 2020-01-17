package orz.teamfelnull.mineguns.packet;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import orz.teamfelnull.mineguns.MineGuns;

public class PacketHandler {
	public static final String PROTOCOL_VERSION = "1";
	private static int id;
	public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
			.named(new ResourceLocation(MineGuns.MODID, "rideon_channel"))
			.clientAcceptedVersions(a -> true).serverAcceptedVersions(a -> true)
			.networkProtocolVersion(() -> PROTOCOL_VERSION)
			.simpleChannel();

	public static int nextIDget() {
		id++;
		return id - 1;
	}

	public static void init() {
		//		INSTANCE.registerMessage(nextIDget(), MessageRideOn.class, MessageRideOn::encodeMessege, MessageRideOn::decodeMessege, MessageRideOnHandler::reversiveMessage);
	}

}
