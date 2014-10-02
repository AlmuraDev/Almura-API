package com.almuramc.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;

import java.util.Random;

public class BlockTickEvent extends BlockEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Random random;

    public BlockTickEvent(Block theBlock, Random random) {
        super(theBlock);
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
