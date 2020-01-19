package orz.teamfelnull.mineguns.proxy;

import net.minecraftforge.common.MinecraftForge;
import orz.teamfelnull.mineguns.handler.ServerHandler;
import orz.teamfelnull.mineguns.packet.PacketHandler;

public class CommonProxy {

	public void setup() {
		PacketHandler.init();
		MinecraftForge.EVENT_BUS.register(ServerHandler.class);

	}
}
