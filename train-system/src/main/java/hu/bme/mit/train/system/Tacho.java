package hu.bme.mit.train.system;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Date;

public class Tacho {

     static Table<Long, Integer, Integer> guavaTable = null;

    public Tacho() {
    }

    public static void put(long currentTimeMillis, int i, int i1) {
        if (guavaTable == null)
            guavaTable = HashBasedTable.create();
        guavaTable.put(currentTimeMillis,i,i1);
    }


    public void put(Integer joy, Integer ref) {
        guavaTable.put(System.currentTimeMillis(),joy,ref);
    }

    public static Table<Long, Integer, Integer> getGuavaTable() {
        if (guavaTable == null)
            guavaTable = HashBasedTable.create();
        return guavaTable;
    }
}
