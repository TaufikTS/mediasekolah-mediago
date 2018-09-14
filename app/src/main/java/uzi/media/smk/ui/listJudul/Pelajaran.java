package uzi.media.smk.ui.listJudul;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class Pelajaran {
    private String nama;
    private int color;

    public Pelajaran(String nama) {
        this.nama = nama;
    }

    public Pelajaran(String nama, int color) {
        this.nama = nama;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
