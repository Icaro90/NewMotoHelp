package com.example.icaro.newmotohelp;

/**
 * Created by icaro on 12/05/2017.
 */
import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBaseConnection {
    private FirebaseApp firebaseApp;
    private FirebaseDatabase database;
    private DatabaseReference myRef;
    String value;

    public FireBaseConnection(Context context) {
       /* firebaseApp = FirebaseApp.getInstance();
        if (firebaseApp == null)
            FirebaseApp.initializeApp(context);*/

        this.database = FirebaseDatabase.getInstance();
    }
    public DatabaseReference get(String referencia) {
        return database.getReference(referencia);
    }

    public void post(String referencia) {
        myRef = database.getReference(referencia);
        myRef.setValue("Hello, ieie");
    }
}

