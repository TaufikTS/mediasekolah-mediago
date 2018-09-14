package uzi.media.smk.ui.listmateri;

/**
 * Created by uzi on 29/09/17.
 * Email : fauzisholichin@gmail.com
 */

public class Materi {
    private String name;
    private int id;
    private int id_kelas;
    private int id_gambar;

    public Materi(String name) {
        this.name = name;
    }

    public Materi(String name, int id, int id_gambar) {
        this.name = name;
        this.id = id;
        this.id_gambar = id_gambar;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public int getId_kelas() {
        return id_kelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
