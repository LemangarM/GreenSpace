package com.support.android.designlibdemo;

import java.util.List;

/**
 * Created by Mohamed on 04/01/2016.
 */
public class DataSet {
    private int nhits;
    private List<EV> records;


    public int getNhits() {
        return nhits;
    }

    public List<EV> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "nhits=" + nhits +
                ", records=" + records +
                '}';
    }
}
