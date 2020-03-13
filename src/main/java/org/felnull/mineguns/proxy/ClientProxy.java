package org.felnull.mineguns.proxy;

import org.felnull.mineguns.client.handler.ClientHandler;
import org.felnull.mineguns.client.handler.KeyHandler;
import org.felnull.mineguns.client.handler.RenderHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(ClientHandler.class);
		MinecraftForge.EVENT_BUS.register(KeyHandler.class);

		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_LEFT);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_RIGHT);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_UP);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_DOWN);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_PUSH);
		ClientRegistry.registerKeyBinding(KeyHandler.DEUBG_PULL);

		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_LEFT2);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_RIGHT2);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_UP2);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_DOWN2);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_PUSH2);
		ClientRegistry.registerKeyBinding(KeyHandler.DEUBG_PULL2);

		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_OUT);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_RESET);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_BAIRITU_UP);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_BAIRITU_DOWN);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_BANGOU_UP);
		ClientRegistry.registerKeyBinding(KeyHandler.DEBUG_BANGOU_DOWN);
		KeyHandler.init();
	}

	public static void clientInit() {

		MinecraftForge.EVENT_BUS.register(RenderHandler.class);
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void posInit() {
		super.posInit();
	}

}
