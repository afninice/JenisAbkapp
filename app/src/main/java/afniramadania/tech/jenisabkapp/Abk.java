package afniramadania.tech.jenisabkapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Abk implements Parcelable {
    public String name, remarks, photo, deskripsi;

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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.deskripsi);

    }

    public Abk() {

    }

    protected Abk(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Parcelable.Creator<Abk> CREATOR = new Parcelable.Creator<Abk>() {
        @Override
        public Abk createFromParcel(Parcel source) {
            return new Abk(source);
        }
        @Override
        public Abk[] newArray(int size) {
            return new Abk[size];
        }
    };
}
