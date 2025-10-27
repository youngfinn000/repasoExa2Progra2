import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public final class OperacionesLectoEscritura {
        public OperacionesLectoEscritura() {}

    public static void grabar(String nombreArchivo, JSONObject jsonObject) {
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            fileWriter.write(jsonObject.toString(4));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ///try with resources este esta mejor
    public static void grabar(String nombreArchivo, JSONArray jsonArray) {
        try (FileWriter fileWriter = new FileWriter(nombreArchivo)) {
            fileWriter.write(jsonArray.toString(4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONTokener leer(String nombreArchivo) {
        JSONTokener tokener = null;
        try {
            tokener = new JSONTokener(new FileReader(nombreArchivo));
        } catch (FileNotFoundException | JSONException e) {
            e.printStackTrace();
        }
        return tokener;
    }


}
