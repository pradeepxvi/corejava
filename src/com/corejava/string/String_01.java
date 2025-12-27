package com.corejava.string;

class String_01 {
    public static void main(String[] args) {

        String name = new String("Pradeeep Kunwar");

        int index = name.indexOf("K");// 9
        System.out.println("index of K is " + index);

        char ch = name.charAt(index);
        System.out.println(" at " + index + " is " + ch);

        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        int nameLength = name.length();

        System.out.println("name in upper " + nameUpper);
        System.out.println("name in lower " + nameLower);
        System.out.println("name length " + nameLength);

        String newName = "      pradeep kunwar      ";
        System.out.println("new name = " + newName);

        String newNameTrimmed = newName.trim(); // remove space of start and end
        System.out.println("new name trim = " + newNameTrimmed);

        String one = "one";
        String two = "two";

        System.out.println("one equals  two ? = " + one.equals(two));
        System.out.println("one equals  one ? = " + one.equals(one));
    }

}