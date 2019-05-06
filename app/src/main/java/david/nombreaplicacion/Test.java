package david.nombreaplicacion;

import android.content.Context;
import android.widget.Toast;

public class Test {

    public static void myToast(Context contexto)
    {
        Toast.makeText(contexto, "Probando un toast desde otra clase", Toast.LENGTH_LONG).show();
    }

}
