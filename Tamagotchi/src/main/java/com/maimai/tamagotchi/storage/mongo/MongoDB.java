package com.maimai.tamagotchi.storage.mongo;

import com.maimai.tamagotchi.manager.IndicatorManager;
import com.maimai.tamagotchi.mascot.entity.EntityType;
import com.maimai.tamagotchi.mascot.entity.MascotEntity;
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import me.yushust.inject.InjectAll;
import org.bson.Document;

@InjectAll
public class MongoDB {
    private MascotEntity mascotEntity;
    private IndicatorManager indicatorManager;

    public void startMongoDB() {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://tamagotchi:tamagotchimongodb@cluster0.2ffd8.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("Tamagotchi");
        MongoCollection<Document> databaseCollection = database.getCollection("consumables");

        mascotEntity.setName("Tiara");
        mascotEntity.setType(EntityType.DOG);
        mascotEntity.setIndicatorManager(indicatorManager);

        Document query = new Document("Mascot", "Tiara");
        FindIterable<Document> result = databaseCollection.find(query);

        System.out.println(result);
    }

    private DBObject convert(MascotEntity mascotEntity) {
        return new BasicDBObject("Mascot", mascotEntity.getName())
                .append("Type", mascotEntity.getType())
                .append("Indicators", mascotEntity.getIndicatorManager());
    }
}
