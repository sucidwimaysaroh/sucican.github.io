//Nama : Iga Novinda Rantaya
//NIM:182410101020
//Kelas : PBO C

package pbo.c;

public class  PBOC{
int sisi, alas, tinggi, miring, luas, keliling;

static void persegi(){
    System.out.println("---Bangun Persegi---");
}

static void segitiga(){
    System.out.println("---Bangun Segitiga---");
}
        
static void sisiPersegi(int sisi){
    System.out.println("Panjang sisi= "+sisi);
}        

static void sisiSegitiga(int alas, int tinggi, int miring){
    System.out.println("Alas= "+ alas);
    System.out.println("Tinggi= "+tinggi);
    System.out.println("Sisi miring= "+miring);
}
    
static int luasPersegi(int sisi){
    return sisi*sisi;
}

static int luasSegitiga(int alas, int tinggi){
    return alas*tinggi/2;
}

static int kelilingPersegi(int sisi){
    return sisi*4;
}

static int kelilingSegitiga(int alas, int tinggi, int miring){
    return alas+tinggi+miring;
}
    public static void main(String[] args) {
       PBOC data=new PBOC();
       data.persegi();
       data.sisiPersegi(3);
       System.out.println("Luas persegi= "+luasPersegi(3));
       System.out.println("Keliling persegi= "+kelilingPersegi(3));
       System.out.println();
       data.segitiga();
       data.sisiSegitiga(3,4,5);
       System.out.println("Luas segitiga= "+luasSegitiga(3,4));
       System.out.println("Keliling segitiga= "+kelilingSegitiga(3,4,5));
    }
}
