package GuiDiCHuan;

import java.util.Scanner;

public class main {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int luachon=0;
        DanhSach list_inter = new DanhSach();
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "6.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "7.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "8.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.   Thoát khỏi chương trình");
            luachon = sc.nextInt();
            sc.nextLine();
            if(luachon == 1){
                System.out.println("Nhap product_id : "); String product_id=sc.nextLine();
                System.out.println("Nhap product_Name : ");String product_name=sc.nextLine();
                System.out.println("Nhap product_price : "); Float product_price =Float.parseFloat(sc.nextLine());
                System.out.println("Nhap Product_total : ");int product_total =Integer.parseInt(sc.nextLine());
                System.out.println("Nhap  Interior_Name :"); String interior_name = sc.nextLine();
                System.out.println("Nhap Interior_Total : "); Float inter_Toal = Float.parseFloat(sc.nextLine());

                Interior inter = new Interior(product_id,product_name,product_price,product_total,interior_name,inter_Toal);

                list_inter.addInterior(inter);
            }else if(luachon == 2){
                list_inter.OutputList();
            } else if (luachon == 3) {
                System.out.println("Check list emptly : "+list_inter.CheckListEmpty());
            } else if (luachon == 4) {
                System.out.println("So luong Interior : "+list_inter.CheckList());
            } else if (luachon == 5) {
                System.out.println("Nhap Interior_name  :"); String interName=sc.nextLine();
                Interior inter = new Interior(interName);
                System.out.println("Check interor : "+list_inter.kiemTraTonTai(inter));
            } else if (luachon == 6) {
                System.out.println("Nhap interior_name can xoa :"); String interName=sc.nextLine();
                Interior inter = new Interior(interName);
                System.out.println("Xoa sinh vien trong danh sach "+list_inter.DeleteInterior(inter));
            }else if(luachon == 7){
                System.out.println("Nhap interior_name can tim :"); String interName=sc.nextLine();
                System.out.println("Ket qua tim kiem ");
                list_inter.Search(interName);
            } else if (luachon == 8) {
                list_inter.Sort();
                list_inter.OutputList();
            }
        }while (luachon !=0);
    }
}


















