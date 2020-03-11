package org.felnull.mineguns.proxy;

import org.felnull.mineguns.client.handler.ClientHandler;
import org.felnull.mineguns.client.handler.KeyHandler;
import org.felnull.mineguns.client.handler.RenderHandler;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	@Override
	public void setup() {
		super.setup();
		MinecraftForge.EVENT_BUS.register(RenderHandler.class);
		MinecraftForge.EVENT_BUS.register(ClientHandler.class);
		MinecraftForge.EVENT_BUS.register(KeyHandler.class);

	}
}
