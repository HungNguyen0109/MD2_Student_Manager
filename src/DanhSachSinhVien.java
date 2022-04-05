import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Student> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<Student>();
    }

    public DanhSachSinhVien(ArrayList<Student> danhSach) {
        this.danhSach = danhSach;
    }

    //1. Thêm sinh viên vào danh sách.
    public void themSinhVien(Student sv) {
        this.danhSach.add(sv);
    }

    //2. In danh sách sv ra màn hình.
    public void inDanhSachSinhVien() {
        for (Student student : danhSach
        ) {
            System.out.println(student);
        }
    }

    //3. Kiểm tra danh sách SV có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    //4. Lấy ra số lượng SV trong danh sách.
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //5. Làm rỗng danh sách SV.
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //6. Ktra SV có tồn tại hay không dựa trên mã SV.
    public boolean kiemTraTonTai(Student student) {
        return this.danhSach.contains(student);
    }

    //7. Xóa 1 SV ra khỏi danh sách dựa trên mã SV.
    public boolean xoaSinhVien(Student student) {
        return this.danhSach.remove(student);
    }

    //8.Tìm tên SV dựa trên tên nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (Student sinhVien : danhSach
        ) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    //9. Xuất danh sách có điểm từ cao đến thấp
    public void sapXepSVGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

}
