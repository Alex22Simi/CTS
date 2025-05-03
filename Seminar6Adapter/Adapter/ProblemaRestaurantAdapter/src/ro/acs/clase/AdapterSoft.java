package ro.acs.clase;

public class AdapterSoft implements ISoft {
    private SoftBar softBar;

    public AdapterSoft(SoftBar softBar) {
        this.softBar = softBar;
    }


    @Override
    public void print() {
        System.out.println("Adaptare soft bucatarie la soft bar: ");
        softBar.print();
    }
}
