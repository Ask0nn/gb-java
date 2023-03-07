package com.ask0n.dz2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        getString(6, 'a', 'b');
        createFile();
    }

    private static void createFile() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++)
            builder.append("TEXT\n");
        try {
            final Path path = Path.of(".", "TEXT.txt");
            if (Files.notExists(path))
                Files.createFile(path);
            Files.write(path, builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    private static void getString(int n, char c1, char c2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++)
            builder.append(i % 2 == 0 ? c2 : c1);
        System.out.println(builder);
    }


}
