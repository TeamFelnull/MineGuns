package orz.teamfelnull.mineguns.proxy;

import net.minecraftforge.common.MinecraftForge;
import orz.teamfelnull.mineguns.client.handler.ClientHandler;
import orz.teamfelnull.mineguns.client.handler.KeyHandler;
import orz.teamfelnull.mineguns.client.handler.RenderHandler;

public class ClientProxy extends CommonProxy {

	@Override
	public void setup() {
		super.setup();
		MinecraftForge.EVENT_BUS.register(RenderHandler.class);
		MinecraftForge.EVENT_BUS.register(ClientHandler.class);
		MinecraftForge.EVENT_BUS.register(KeyHandler.class);

	}
}
