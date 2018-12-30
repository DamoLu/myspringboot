package com;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.utils.JsonUtils;
import net.sf.json.JSONArray;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;
import java.io.File;
public class Application {

    public static void main(String[] args) {
        JSONArray jsonArray = JsonUtils.readFilesAsJsonArray("currencies.txt");
        System.out.println(jsonArray.toString());

    }
}
