package com.support.android.designlibdemo;

import java.util.List;

/**
 * Created by Mohamed on 04/01/2016.
 */
public class EV {

    private String datasetid;
    private String recordid;
    private Fields fields;

    public Fields getFields() {
        return fields;
    }

    public class Fields {

        private int adresse_nu;
        private int anne_reno;
        private String adresse;
        private List<Double> geom_x_y;
        private int Surface_to;
        private int ardt;
        private int annee_chan;
        private String ouvert_fer;
        private String nom_ev;
        private String annee_ouve;

        public int getArdt() {
            return ardt;
        }

        public String getNom_ev() {
            return nom_ev;
        }

        @Override
        public String toString() {
            return "l'espace" + nom_ev + " a ouvert le : " + annee_ouve ;
        }

    }

}
