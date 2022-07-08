import java.util.*;

public class appmain {

    public static void main(String[] args) {
        Map<Integer,String> data = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do{
            show_menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.printf("Nhap ma tinh: ");
                    int ma = Integer.parseInt(sc.nextLine());
                    data.put(ma,"");
                    System.out.printf("Nhap ten tinh: ");
                    data.put(ma,sc.nextLine());
                    System.out.println("Thanh Cong");
                    break;
                case 2:
                    sort(data);
                    break;
                case 3:
                    removeOdd(data);
                    break;
            }
        }while (chon != 4);

    }
    static void show_menu(){
        System.out.println("1: Them ma tinh");
        System.out.println("2: Hien thi ds da duoc sap xep");
        System.out.println("3: Hien thi ds co ma so le");
        System.out.println("4: Thoat");
        System.out.print("Yeu cau cua ban: ");
    }
    static void sort(Map<Integer,String> ds){
        TreeMap<Integer,String> dsnew = new TreeMap<>(ds);
        Set<Map.Entry<Integer,String>> dssort = dsnew.entrySet();
        for (Map.Entry<Integer,String> data: dssort){
            System.out.printf(data.getKey() + " " + data.getValue() + ", ");
        }
        System.out.println(" ");

    }
    static void removeOdd(Map<Integer,String> ds){
        ArrayList<Integer> index = new ArrayList<>();
        ds.forEach((a,b)->{
            if(a % 2 != 0)
                index.add(a);
        });
        index.forEach(a -> ds.remove(a));
        ds.forEach((a,b)-> System.out.println( b + ", "));
        System.out.println(" ");
    }
}
