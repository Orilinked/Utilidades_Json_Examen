package org.example;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class JSONULTTest {
    JSONULT jsonult = new JSONULT();
   static Path p = Paths.get("Prova.json");

    @Test
    void crea_escriu_Fitxer_JSON() {
        jsonult.Crea_escriu_Fitxer_JSON(p);
    }

    @Test
    void retornaFitxerJson() {
        JSONULT jsonult1 = new JSONULT();
        JSONArray jsonArray = jsonult1.retornaFitxerJson(p.toString());
        System.out.println(jsonArray.toJSONString());
    }

    @Test
    void escriuStringJsonAFitxerJson() {
        jsonult.escriuStringJsonAFitxerJson(p.toString(),",{\"nom\":\"Ale\",\"cognom\":\"juarez\",\"edad\":19}");
    }

    @Test
    void jsonAPrettyFormat(){
        String contingut = jsonult.retornaFitxerJson(p.toString()).toJSONString();
        String jsonpretty = jsonult.jsonAPrettyFormat(contingut);
        System.out.println(jsonpretty);
    }
}