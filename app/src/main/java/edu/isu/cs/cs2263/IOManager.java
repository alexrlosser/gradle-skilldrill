/* Alex Losser - GradleSkillDrill
 * Due Wed, Jan 27
 * IOManager.java
 */

package edu.isu.cs.cs2263;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOManager {

    public IOManager() {}

    public List<Student> readData(String file) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String jsonString = "";
        try { jsonString = Files.readString(Paths.get(file)); }
        catch (IOException ex){ ex.printStackTrace(); }

        Type listType = new TypeToken<ArrayList<Student>>() {}.getType();
        List<Student> studentList = gson.fromJson(jsonString, listType);

        return studentList;
    }

    public static void writeData(List<Student> data, String file) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String jsonString = gson.toJson(data);

        //Print the students in JSON format
        System.out.println();
        System.out.println(jsonString);

        try { Files.writeString(Paths.get(file), jsonString); }
        catch (IOException ex) { ex.printStackTrace(); }
    }
}
