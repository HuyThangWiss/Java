package GuiDiCHuan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface List_Interior{
    public void addInterior(Interior inter);
    public void OutputList();
    public boolean kiemTraTonTai(Interior sv);
    public boolean CheckListEmpty();
    public boolean DeleteInterior(Interior inter);
    public void Search(String interior_name);
    public void Sort();
    public int CheckList();

}

public class DanhSach  implements List_Interior{
    private ArrayList<Interior> danhsach;
    public DanhSach(){

        this.danhsach=new ArrayList<>();
    }

    public DanhSach(ArrayList<Interior> danhsach) {

        this.danhsach = danhsach;
    }

    public ArrayList<Interior> getDanhsach() {

        return danhsach;
    }

    public void setDanhsach(ArrayList<Interior> danhsach) {

        this.danhsach = danhsach;
    }
    public void addInterior(Interior inter){

        this.danhsach.add(inter);
    }
    public void OutputList(){
        for (Interior inter : danhsach){
            System.out.println(inter);
        }
    }
    public boolean kiemTraTonTai(Interior sv) {
        return this.danhsach.contains(sv);
    }
    public boolean CheckListEmpty(){

        return this.danhsach.isEmpty();
    }
    public int CheckList(){

        return this.danhsach.size();
    }
    public boolean DeleteInterior(Interior inter){
        return this.danhsach.remove(inter);
    }
    public void Search(String interior_name){
        for (Interior inter : danhsach){
            if(inter.getInterior_Name().indexOf(interior_name) >= 0){
                System.out.println(inter);
            }
        }
    }
    public void Sort(){
        Collections.sort(this.danhsach, new Comparator<Interior>() {
            @Override
            public int compare(Interior o1, Interior o2) {
                if(o1.getInterior_Total()<o2.getInterior_Total()){
                    return 1;
                }else if(o1.getInterior_Total()>o2.getInterior_Total()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }
}
