package org.felnull.mineguns.proxy;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.handler.ServerHandler;
import org.felnull.mineguns.packet.PacketHandler;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	public void preInit() {
		MineGuns.LOGGER.info("Pre Initing...");
		PacketHandler.init();
		MinecraftForge.EVENT_BUS.register(ServerHandler.class);

	}

	public void init() {
		MineGuns.LOGGER.info("Initing...");
	}

	public void posInit() {
		MineGuns.LOGGER.info("Post Initing...");
	}

}
