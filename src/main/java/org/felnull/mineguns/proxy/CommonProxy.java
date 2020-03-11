package org.felnull.mineguns.proxy;

import org.felnull.mineguns.handler.ServerHandler;
import org.felnull.mineguns.packet.PacketHandler;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	public void setup() {
		PacketHandler.init();
		MinecraftForge.EVENT_BUS.register(ServerHandler.class);

	}
}
