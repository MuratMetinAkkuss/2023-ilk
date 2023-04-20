package Day16_arrayList;

import java.util.List;

public class Q2 {

    //kullanicidan alinan isimlerden olusan 3 harften fazla olan isimleri yazdirin
    public static void main(String[] args) {
        List<String> yeniliste = Q1.deneme();
        ucHarftenBuyuk(yeniliste);
    }

  public static void ucHarftenBuyuk(List<String> yeniliste){

      for (int i = 0; i <yeniliste.size() ; i++) {
          if (yeniliste.get(i).length() > 3 ){
              System.out.print(yeniliste.get(i) + " ");
          }
      }

  }
}
