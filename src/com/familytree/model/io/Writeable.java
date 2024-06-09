package com.familytree.model.io;

import java.io.IOException;

    public interface Writeable {
        <T> void writeToFile(T obj, String filename) throws IOException;
        <T> T readFromFile(String filename) throws IOException, ClassNotFoundException;
    }


