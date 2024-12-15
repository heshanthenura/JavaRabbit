package com.heshanthenura.javarabbit;

import java.io.IOException;

public class Interpreter {

    Functions functions = new Functions();

    public void interpret(int id,String line) throws IOException {
        System.out.println(line);
        if (line.startsWith("canvas")){
            String[] splitLine = line.split(" ");
            functions.setSize(Double.parseDouble(splitLine[1]),Double.parseDouble(splitLine[2]));
        } else if (line.startsWith("bg")) {
            functions.setColor(line.split(" ")[1]);
        } else if (line.startsWith("line")) {
            String[] splitLine = line.split(" ");
            functions.drawLine(splitLine[1],Double.parseDouble(splitLine[2]),Double.parseDouble(splitLine[3]),Double.parseDouble(splitLine[4]),Double.parseDouble(splitLine[5]),Double.parseDouble(splitLine[6]));
        }
    }


}
