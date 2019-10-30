package com.freshappbooks.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {  //Singleton class

    private static CrimeLab crimeLab;
    private List <Crime> crimes;

    private CrimeLab(Context context){
        crimes = new ArrayList<>();
    }

    public List <Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime: crimes){
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    public static CrimeLab get(Context context) {
        if (crimeLab == null) {
            crimeLab = new CrimeLab(context);
        }
        return crimeLab;
    }
    public void addCrime(Crime crime){
        crimes.add(crime);
    }

}
