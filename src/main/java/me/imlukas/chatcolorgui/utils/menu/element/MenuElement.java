package me.imlukas.chatcolorgui.utils.menu.element;

import me.imlukas.chatcolorgui.utils.text.Placeholder;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Collections;

public interface MenuElement {

    ItemStack getDisplayItem();

    void handle(InventoryClickEvent event);

    MenuElement copy();

    default Collection<Placeholder<Player>> getItemPlaceholders() {
        return Collections.emptyList();
    }

    default MenuElement setItemPlaceholders(Collection<Placeholder<Player>> placeholders) {
        return this;
    }

}
