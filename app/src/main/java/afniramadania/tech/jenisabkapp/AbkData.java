package afniramadania.tech.jenisabkapp;

import java.util.ArrayList;

public class AbkData {
    public static String[][] data = new String[][]{
            {"Tuna Netra", "Anak Disabilitas Penglihatan",
                    "https://i.ibb.co/WkBRM16/tuna-netra.jpg",
            "Anak Disabilitas Pengelihatan, dulu disebut tunanetra. Anak dalam kategori ini adalah anak yang memiliki hambatan dalam pengelihatannya, baik itu secara keseluruhan (totaly blind) maupun sebagian (low vision)."},
            {"Tuna Rungu", "Anak Disabilitas Pendengaran",
                    "https://i.ibb.co/vLbt6nK/tuna-rungu.jpg",
            "Anak Disabilitas Pendengaran, dulu disebut tunarungu. Anak dalam kategori ini adalah anak yang memiliki hambatan pendengaran baik ringan maupun berat"},
            {"Down Syndrom", "Anak Kembar Sedunia",
                    "https://i.ibb.co/MgYjKft/tuna-grahita.jpg",
                    "Down syndrome pada umumnya bukanlah penyakit keturunan. Down syndrome (DS) adalah suatu kelainan genetik yang terjadi ketika bayi yang dikandung memiliki tambahan kromosom 21, baik salinan penuh atau hanya sebagian, yang terbentuk saat perkembangan sel telur, sperma, atau embrio..",
            },
            {"Tuna Grahita", "Anak Disabilitas Intelektual",
                    "https://i.ibb.co/vmQcBCn/tg2.jpg",
            "Anak Disabilitas Intelektual (Retardasi Mental), dulu disebut tunagrahita. Anak dalam kategori ini adalah anak yang memiliki intelejensi kurang dari rata-rata atau dengan IQ di bawah 70."},
            {"Tuna Daksa", "Anak Disabilitas Tubuh",
                    "https://i.ibb.co/SR9ccvz/tuna-daksa.jpg",
            "Anak Disabilitas Tubuh, dulu disebut tunadaksa. Anak dalam kategori ini adalah anak yang memiliki kondisi fisik yang menyimpang dari anak pada umumnya. Kondisi fisik ini dapat terjadi dalam berbagai macam dan menghambat aktivitas anak."},
            {"Tuna Laras", "Anak Disabilitas Emosi",
                    "https://i.ibb.co/Xy4PysJ/tuna-laras.jpg",
             "Anak Gangguan Emosi dan Tingkah Laku, dulu disebut tunalaras. Anak dalam kategori ini adalah anak yang memiliki gangguan emosi dan penyimpangan tingkah laku berdasarkan sosial, adat, dan hukum."},
            {"Autis", "Anak Disabilitas Autis",
                    "https://i.ibb.co/vBDCsWW/autis.jpg",
            "Anak Autis. Anak dalam kategori ini adalah anak yang memiliki gangguan pada sistem syaraf dan menyebabkan timbulnya beberapa tingkah laku yang berbeda, seperti memiliki dunianya sendiri. Anak autis memiliki ciri yang berbeda dari setiap individu, sehingga tidak ada ciri-ciri spesifik dalam anak autis"},
            {"ADHD", "Anak Gangguan Pemusatan dan Hiperaktif",
                    "https://i.ibb.co/fG0X5KQ/hiperaktif.jpg",
            "ADHD atau attention deficit hyperactivity disorder adalah gangguan jangka panjang yang menyerang jutaan anak dengan gejala-gejala yang dapat berlangsung hingga dewasa. Anak Gangguan Pemusatan Perhatian dan Hiperaktif. Anak dalam kategori ini adalah anak yang memiliki gangguan pemusatan perhatian dan memiliki tingkat keaktifan jauh melebihi anak pada umumnya."},
            {"Dislexia", "Anak Kesulitan Belajar",
                    "https://i.ibb.co/y4V3bxh/adhd.jpg",
            "Anak Kesulitan Belajar. Anak dalam kategori ini adalah anak yang memiliki hambatan dalam belajar karena gangguan dalam anak, seperti faktor medis pada bagian otak anak."},
            {"Giftedness", "Anak Berbakat",
                    "https://i.ibb.co/wzCPpYh/gifdness.jpg",
            "Anak Berbakat. Anak dalam kategori ini adalah anak yang memiliki kemampuan akademis atau nonakademis melebihi anak pada umumnya.",
            },
            {"Cerebral Palsy", "Anak Lumpuh Otak",
                    "https://i.ibb.co/mJkSXB3/cp.jpg",
                    "Gejala cerebral palsy berkisar dari ringan hingga berat dan biasanya tidak begitu jelas untuk diamati setelah bayi lahir. Gejala ini juga bervariasi tergantung dari bagian otak yang terkena. Beberapa kasus bisa hanya mempengaruhi satu sisi tubuh dan ada juga bahkan yang mempengaruhi seluruh tubuh." ,
            }
    };

    public static ArrayList<Abk> getListData(){
        Abk abk = null;
        ArrayList<Abk> list = new ArrayList<>();
        for (String[] aData : data) {
            abk = new Abk();
            abk.setName(aData[0]);
            abk.setRemarks(aData[1]);
            abk.setPhoto(aData[2]);
            abk.setDeskripsi(aData[3]);

            list.add(abk);
        }

        return list;
    }

}
