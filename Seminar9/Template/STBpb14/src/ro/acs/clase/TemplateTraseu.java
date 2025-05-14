package ro.acs.clase;

import java.util.ListIterator;

public abstract class TemplateTraseu {
    abstract void statia1();
    abstract void statia2();
    abstract void statia3();
    abstract void statia4();
    abstract void statia5();
    abstract void statia6();
    public final void parcurgeTraseu(boolean sensNormal) {
        if (sensNormal) {
            statia1();
            statia2();
            statia3();
            statia4();
            statia5();
            statia6();
        } else {
            statia6();
            statia5();
            statia4();
            statia3();
            statia2();
            statia1();
        }
    }

}
