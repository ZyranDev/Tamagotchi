package com.maimai.tamagotchi.util;

import java.io.*;

public class JsonFile {

    private final File jsonFile;

    public JsonFile(File folder, String filename) {
        this.jsonFile = new File(folder, filename + ((filename.endsWith(".json")) ? "" : ".json"));
        createFile();
    }

    public JsonFile(File jsonFile) {
        this.jsonFile = jsonFile;
        createFile();
    }

    private void createFile() {
        try {
            jsonFile.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void writeJson(String json) {
        if (!jsonFile.exists())
            createFile();
        try {
            FileWriter fileWriter = new FileWriter(jsonFile);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String getJson() throws IOException {
        if (!jsonFile.exists()) return "{}";

        FileReader fileReader = new FileReader(jsonFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        fileReader.close();
        bufferedReader.close();

        return stringBuilder.toString();
    }
}