package com.freshappbooks.criminalintent;

import android.content.Context;

public class CrimeLab {  //Singleton class

    private static CrimeLab crimeLab;

    private CrimeLab(Context context){
    }

    public static CrimeLab get(Context context) {
        if (crimeLab == null) {
            crimeLab = new CrimeLab(context);
        }
        return crimeLab;
    }

}
