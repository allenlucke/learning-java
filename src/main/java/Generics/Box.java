package Generics;

class Box {
    private Object contents;

    void add(Object thing) {
        if (contents == null) {
            contents = thing;
        } else {
            System.out.println("The box is full.");
        }
    }

    Object remove() {
        if (contents == null) {
            System.out.println("The box is empty.");
            return null;
        } else {
            Object thing = contents;
            contents = null;
            return thing;
        }
    }
}
