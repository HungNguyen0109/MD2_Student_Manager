import java.util.Objects;

public class Student implements Comparable<Student>{
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public Student(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }


    public Student(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Sinh Viên { " +
                "Mã sinh viên '" + maSinhVien + '\'' +
                ", Họ và Tên = '" + hoVaTen + '\'' +
                ", Năm sinh = " + namSinh +
                ", Điểm trung bình = " + diemTrungBinh +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(maSinhVien, student.maSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
    }
}
