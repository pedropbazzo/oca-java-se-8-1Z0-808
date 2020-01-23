package br.com.oca.classes.a.b.c;

import java.io.File;
import java.util.*;

class D {

    public static void main(String[] args) {
        ArrayList<String> existing = new ArrayList<>();

        for (String arg : args) {
            if (new E().exists(arg))
                existing.add(arg);
        }
    }
}

class E {
    public boolean exists(String name) {
        File f = new File(name);
        return f.exists();
    }
}


