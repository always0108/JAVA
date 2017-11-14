package com.company;

public class Main {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("test.txt");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is a directory ? " + file.isDirectory());
        System.out.println("Is a file ? " + file.isFile());
        System.out.println("Is a absolute ? " + file.isAbsolute());
        System.out.println("Is a hidden ? " + file.isHidden());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
    }
}
