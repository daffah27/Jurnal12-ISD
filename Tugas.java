import java.util.Comparator;

class Tugas {
    public String kegiatan;
    public int prioritas;

    public Tugas(String kegiatan, int prioritas) {
        this.kegiatan = kegiatan;
        this.prioritas = prioritas;
    }

    public String getkegiatan() {
        return kegiatan;
    }

    public int getPrioritas() {
        return prioritas;
    }
}

class TugasComparator implements Comparator<Tugas> {
    @Override
    public int compare(Tugas tugas1, Tugas tugas2) {
        if (tugas1.prioritas < tugas2.prioritas) {
            return -1;
        } else if (tugas1.prioritas > tugas2.prioritas) {
            return 1;
        } else {
            return 0;
        }
    }
}

