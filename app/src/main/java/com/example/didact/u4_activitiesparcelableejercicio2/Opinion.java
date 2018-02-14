package com.example.didact.u4_activitiesparcelableejercicio2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 14/02/2018.
 */

public class Opinion implements Parcelable{

    String nombre;
    String valoracion;
    String opinion;

    public static final Parcelable.Creator<Opinion> CREATOR = new Parcelable.Creator<Opinion>(){
        public Opinion createFromParcel(Parcel in) {
            return new Opinion(in);
        }

        public Opinion[] newArray(int size){return new Opinion[size];
        }

    };

    public Opinion(String nombre, String valoracion, String opinion) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.opinion = opinion;
    }

    public Opinion(Parcel p){

        readFromParcel(p);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.nombre);
        dest.writeString(this.valoracion);
        dest.writeString(this.opinion);

    }

    private void readFromParcel (Parcel p){
        this.nombre = p.readString();
        this.valoracion = p.readString();
        this.opinion = p.readString();
    }

}
