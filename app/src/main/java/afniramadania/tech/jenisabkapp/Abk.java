package afniramadania.tech.jenisabkapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Abk implements Parcelable {
    private String name, remarks, photo, deskripsi;

    protected Abk (Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
    }

    public static final Creator<Abk> CREATOR = new Creator<Abk>() {
        @Override
        public Abk createFromParcel(Parcel in) {
            return new Abk(in);
        }

        @Override
        public Abk[] newArray(int size) {
            return new Abk[size];
        }
    };


    public Abk() {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }


    public void setPhoto(String photo) {this.photo = photo; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {this.deskripsi = deskripsi; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.deskripsi);

    }


}
