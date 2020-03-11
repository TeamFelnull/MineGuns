package org.felnull.mineguns.proxy;

import org.felnull.mineguns.handler.ServerHandler;
import org.felnull.mineguns.packet.PacketHandler;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	public void preInit() {
		PacketHandler.init();
		MinecraftForge.EVENT_BUS.register(ServerHandler.class);

	}

	public void init() {

	}

	public void posInit() {

	}

}
