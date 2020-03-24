package org.felnull.mineguns.proxy;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.client.handler.ClientHandler;
import org.felnull.mineguns.client.handler.KeyHandler;
import org.felnull.mineguns.client.handler.RenderHandler;

import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
	}

	public static void clientInit() {
		MineGuns.LOGGER.info("Client Initing...");
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

		MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, false, ClientTickEvent.class,
				new ClientHandler()::onTick);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, false, RenderPlayerEvent.Pre.class,
				new RenderHandler()::onRenderPlayer);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, false, RenderHandEvent.class,
				new RenderHandler()::onRenderHand);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, false, InputEvent.KeyInputEvent.class,
				new KeyHandler()::onKeyInput);
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
