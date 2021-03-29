package com.stefano.ooplab.sesi5nomor2;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        final String[] month = {
                "Januari", "Februari", "Maret",
                "April", "Mei", "Juni",
                "Juli", "Agustus", "September",
                "Oktober", "November", "Desember"
        };
        long timeInMilisecond = calendar.getTimeInMillis();


        System.out.println(
                "Saat ini adalah tanggal " + calendar.get(GregorianCalendar.DAY_OF_MONTH) +
                        " bulan " + month[calendar.get(GregorianCalendar.MONTH)] +
                        " tahun " + calendar.get(GregorianCalendar.YEAR)
        );
        //angka konversi diambil dari konversi pada search box google.com
        if(timeInMilisecond >= 3.154e+10) {
            System.out.print((int) (timeInMilisecond / 3.154e+10) + " tahun ");
            timeInMilisecond %= 3.154e+10;
        }
        if(timeInMilisecond >= 2.628e+9) {
            System.out.print((int) (timeInMilisecond / 2.628e+9) + " bulan ");
            timeInMilisecond %= 2.628e+9;
        }
        if(timeInMilisecond >= 8.64e+7) {
            System.out.print((int) (timeInMilisecond / 8.64e+7) + " hari ");
        }
        System.out.print("setelah 1 Januari 1970");
    }
}
