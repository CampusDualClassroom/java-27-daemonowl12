package com.campusdual.classroom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise27 {
    public static void main(String[] args) {

        crearCarpetaResources("src/main/resources");

        try (FileWriter fileWriter = new FileWriter("src/main/resources/shoppingList.xml")) {
            fileWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
            fileWriter.write("<shoppinglist>\n");
            fileWriter.write("    <items>\n");
            fileWriter.write("        <item quantity=\"2\">Manzana</item>\n");
            fileWriter.write("        <item quantity=\"1\">Leche</item>\n");
            fileWriter.write("        <item quantity=\"3\">Pan</item>\n");
            fileWriter.write("        <item quantity=\"2\">Huevo</item>\n");
            fileWriter.write("        <item quantity=\"1\">Queso</item>\n");
            fileWriter.write("        <item quantity=\"1\">Cereal</item>\n");
            fileWriter.write("        <item quantity=\"4\">Agua</item>\n");
            fileWriter.write("        <item quantity=\"6\">Yogur</item>\n");
            fileWriter.write("        <item quantity=\"2\">Arroz</item>\n");
            fileWriter.write("    </items>\n");
            fileWriter.write("</shoppinglist>");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crear archivo JSON
        try (FileWriter fileWriter = new FileWriter("src/main/resources/shoppingList.json")) {
            fileWriter.write("{\n");
            fileWriter.write("    \"items\": [\n");
            fileWriter.write("        { \"text\": \"Manzana\", \"quantity\": 2 },\n");
            fileWriter.write("        { \"text\": \"Leche\", \"quantity\": 1 },\n");
            fileWriter.write("        { \"text\": \"Pan\", \"quantity\": 3 },\n");
            fileWriter.write("        { \"text\": \"Huevo\", \"quantity\": 2 },\n");
            fileWriter.write("        { \"text\": \"Queso\", \"quantity\": 1 },\n");
            fileWriter.write("        { \"text\": \"Cereal\", \"quantity\": 1 },\n");
            fileWriter.write("        { \"text\": \"Agua\", \"quantity\": 4 },\n");
            fileWriter.write("        { \"text\": \"Yogur\", \"quantity\": 6 },\n");
            fileWriter.write("        { \"text\": \"Arroz\", \"quantity\": 2 }\n");
            fileWriter.write("    ]\n");
            fileWriter.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void crearCarpetaResources(String dirPath) {
        File resourcesDir = new File(dirPath);
        if (!resourcesDir.exists()) {
            if (resourcesDir.mkdirs()) {
                System.out.println("Carpeta 'resources' creada en: " + dirPath);
            } else {
                System.err.println("No se pudo crear la carpeta 'resources'.");
            }
        } else {
            System.out.println("La carpeta 'resources' ya existe en: " + dirPath);
        }
    }

}
