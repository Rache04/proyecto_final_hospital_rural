import java.util.ArrayList;

import controllers.HospitalRural;
import interfaces.IHospitalRural;
import models.Medico;
import models.Sala;

public class main {
    public static void main(String[] args) {
        IHospitalRural hospital = new HospitalRural(new ArrayList<Medico>(), new ArrayList<Sala>());

    }
}
