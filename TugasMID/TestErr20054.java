/*Nim			:13020210054
Nama			:Rifdah Salsabila
Hari/Tanggal	:Rabu, 29 Maret 2023*/

public class TestErr20054 {
    public static void main(String[] args) {
        int tot = 1;
        int j = 2;
        for (int i = 0; i < 10; i++)
            tot += i;
        int i = 10;
        if (i < j)
            System.out.println(i);
        else
            System.out.println(j);
        do {
            j++;
        } while (j < 10);
        while (j < 10)
        {
            j++;
        };
    }
}