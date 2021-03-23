package com.maimai.tamagotchi.mascot.entity;

import com.google.gson.annotations.SerializedName;
import com.maimai.tamagotchi.manager.IndicatorManager;

import java.util.List;

public class TamagotchiEntity {
    @SerializedName("mascot")
    List<TamagotchiUser.Mascot> mascot;

    public static class TamagotchiUser {
        public static class UserInventory {
            @SerializedName("inventory")
            List<String> inventoryItems;
            int quantity;

            public UserInventory(List<String> inventoryItems) {
                this.inventoryItems = inventoryItems;
            }
        }

        public static class Mascot {
            @SerializedName("mascot-name")
            String mascotName;
            @SerializedName("type")
            EntityType mascotType;
            @SerializedName("inventory")
            List<TamagotchiUser.Mascot.MascotInventory> mascotInventory;

            public static class MascotInventory {
                @SerializedName("item")
                String mascotInventoryItems;
                @SerializedName("quantity")
                int itemQuantity;

                public MascotInventory(String mascotInventoryItems, int itemQuantity) {
                    this.mascotInventoryItems = mascotInventoryItems;
                    this.itemQuantity = itemQuantity;
                }
            }

            public static class MascotIndicator {
                @SerializedName("indicators")
                IndicatorManager indicatorManager;

                public MascotIndicator(IndicatorManager indicatorManager) {
                    this.indicatorManager = indicatorManager;
                }
            }
            public Mascot(String mascotName, EntityType mascotType, List<MascotInventory> mascotInventory) {
                this.mascotName = mascotName;
                this.mascotType = mascotType;
                this.mascotInventory = mascotInventory;
            }
        }
    }

    public TamagotchiEntity(List<TamagotchiUser.Mascot> mascot) {
        this.mascot = mascot;
    }
}
