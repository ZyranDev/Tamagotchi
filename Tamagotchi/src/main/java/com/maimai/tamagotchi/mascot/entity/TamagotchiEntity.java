package com.maimai.tamagotchi.mascot.entity;

import com.google.gson.annotations.SerializedName;
import com.maimai.tamagotchi.mascot.indicator.IndicatorType;

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
            @SerializedName("indicator")
            List<TamagotchiUser.Mascot.MascotIndicator> mascotIndicators;

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
                @SerializedName("type")
                IndicatorType indicatorType;
                @SerializedName("level")
                int indicatorQuantity;

                public MascotIndicator(IndicatorType indicatorType, int indicatorQuantity) {
                    this.indicatorType = indicatorType;
                    this.indicatorQuantity = indicatorQuantity;
                }
            }

            public Mascot(String mascotName, EntityType mascotType, List<MascotInventory> mascotInventory, List<MascotIndicator> mascotIndicators) {
                this.mascotName = mascotName;
                this.mascotType = mascotType;
                this.mascotInventory = mascotInventory;
                this.mascotIndicators = mascotIndicators;
            }
        }
    }

    public TamagotchiEntity(List<TamagotchiUser.Mascot> mascot) {
        this.mascot = mascot;
    }
}
