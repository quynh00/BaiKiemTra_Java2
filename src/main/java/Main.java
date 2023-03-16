import dao.StudentDAO;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static StudentDAO studentDAO = new StudentDAO();

    private static void mainMenu() {
        System.out.println("--- QUẢN LÝ THÔNG TIN SINH VIÊN ---");
        System.out.println("1. Danh sách sinh viên theo bảng");
        System.out.println("2. Nhập một sinh viên mới");
        System.out.println("3. Xóa một sinh viên theo mã");
        System.out.println("4. Câp nhật thông tin sinh viên");
        System.out.println("5. Tìm một sinh viên theo họ tên hoặc mã");
        System.out.println("6. Sắp xếp sinh viên theo điểm số GPA tăng dần");
        System.out.println("7. In ra tất cả các sinh viên nữ ở Hà Nội có GPA trên 2.5");
        System.out.println("8. Sắp xếp sinh viên theo họ tên, sắp xếp theo bẳng chữ cái abc");
    }
    private static void option1(){
        List<Student> studentList = studentDAO.getAll();
        System.out.printf("%-20s %-20s %-20s %-20s", "Mã sinh viên", "Họ tên", "Giới tính", "Địa chỉ");
        System.out.println();
        for (int i = 0; i < studentList.size(); i++){
            Student s = studentList.get(i);
            System.out.printf("%-20s %-20s %-20s %-20s\n", (i+1), s.getId(), s.getFull_name(), s.getGender(), s.getAddress());
        };
    }
    private static void option2(Scanner in){
//        Student s = new Student();
//        System.out.print("\tNhập mã sinh viên: ");
//        s.setId(in.nextLine());
//        System.out.print("\tNhập tên sinh viên: ");
//        s.setFull_name(in.nextLine());
//        System.out.print("\tNhập giới tính: ");
//        s.setGender(in.nextInt());
//        System.out.print("\tNhập ngày sinh: ");
//        s.setDateOfBirth(in.nextLine());
//        System.out.print("\tNhập địa chỉ: ");
//        s.setAddress(in.nextLine());
//        System.out.print("\tNhập số điện thoại: ");
//        s.setPhone(in.nextLine());
//        System.out.print("\tNhập email: ");
//        s.setEmail(in.nextLine());
//        System.out.print("\tNhập điểm GPA: ");
//        s.setGpa(Double.parseDouble(in.nextLine()));
//
//        studentDAO.insert(s);\

        Student students = new Student();
        System.out.print("\t nhập id sinh viên: ");
        students.setId(in.nextLine());
        System.out.print("\t nhập tên: ");
        students.setFull_name(in.nextLine());
        System.out.print("\t nhập giới tính: ");
        students.setGender(Integer.parseInt(in.nextLine()));
        System.out.print("\t nhập ngày sinh: ");
        students.setDateOfBirth(in.nextLine());
        System.out.print("\t nhập địa chỉ: ");
        students.setAddress(in.nextLine());
        System.out.print("\t nhập số điện thoại: ");
        students.setPhone(in.nextLine());
        System.out.print("\t nhập email: ");
        students.setEmail(in.nextLine());
        System.out.print("\t nhập điểm GPA: ");
        students.setGpa(Double.parseDouble(in.nextLine()));
        studentDAO.insert(students);
        System.out.println("thêm thành công");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = -1;

        do {
            mainMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(in.nextLine());

            if (option < 1 || option > 8){
                System.out.println("Vui lòng nhập lại!");
                continue;
            }
            switch (option){
                case 1:
                    option1();
                    break;

                case 2:
                    option2(in);
                    break;

                case 3:
                    break;

                case 4:
                    break;
                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

            }
        }
        while (option != 0);
        in.close();
    }
}
