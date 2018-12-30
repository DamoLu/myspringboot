package com.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.IOException;

public class JsonUtils {

    private static final String ENCODING = "utf-8";
    private static String path = "classpath:";
    private JsonUtils() {
        //do nothing
    }

    public static JSONArray readFilesAsJsonArray(String filePath){
        String jsonString = null;
        try {
            jsonString = FileUtils.readFileToString(ResourceUtils.getFile(path + filePath), ENCODING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSONArray.fromObject(jsonString);
    }

    public static JSONObject readFilesAsJsonObject(String filePath){
        String jsonString = null;
        try {
            jsonString = FileUtils.readFileToString(ResourceUtils.getFile(path + filePath), ENCODING);
        } catch (IOException e) {
            e.printStackTrace();
        }
       return JSONObject.fromObject(jsonString);
    }
}