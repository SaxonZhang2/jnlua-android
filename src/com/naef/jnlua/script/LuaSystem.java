package com.naef.jnlua.script;

import java.io.IOException;
import java.io.Writer;

public class LuaSystem {
    private Writer writer;

    public LuaSystem() {
    }

    public void print(Object obj) {
        try {
            if (writer != null) {
                writer.write(obj.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}