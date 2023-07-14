package com.undira.tiundira;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    // creating a constant variables for our database.
    // below variable is for our database name.
    private static final String DB_NAME = "coursedb";

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "mycourses";

    // below variable is for our id column.
    private static final String ID_COL = "id";

    // below variable is for our course name column
    private static final String HEADER_COL = "header";

    // below variable id for our course duration column.
    private static final String CONTENT_COL = "content";

    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HEADER_COL + " TEXT,"
                + CONTENT_COL + " TEXT)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
        // Create a ContentValues object to store the values.
        try {
            ContentValues values = new ContentValues();

            // Insert the first mock
            values.put(HEADER_COL, "Beranda");
            values.put(CONTENT_COL, "Program Studi Teknik Informatika merupakan program studi yang menekankan pada kemampuan dalam merancang, mengembangkan ragam algoritma komputasi (teori komputasi dan algoritma) yang mencakup spektrum yang sangat beragam dari hal hal yang teoritis dan algoritmis hingga yang bersifat terapan.\n" +
                    "\n"+
                    "Program Studi Teknik Informatika memiliki 3 fokus utama yaitu :\n" +
                    "\n"+
                    "1. Mempelajari teori maupun algoritma yang digunakan dalam proses perancangan dan implementasi perangkat lunak.\n" +
                    "\n"+
                    "2. Mempelajari teori maupun algoritma yang digunakan dalam proses perancangan dan implementasi sistem perangkat keras serta komponennya.\n" +
                    "\n"+
                    "3. Mempelajari teori maupun algoritma yang digunakan sebagai model matematis dalam menyelesaikan permasalahan tertentu\n" +
                    "\n"+
                    "4. Kurikulum Program Studi Teknik Informatika terdiri dari ilmu pengetahuan terkait dengan logika matematika, komputasi, dan algoritma yang dalam model terapannya dinyatakan dalam pengembangan program komputer.");
            long result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }

            // Insert the second mock
            values.clear();
            values.put(HEADER_COL, "Visi Misi");
            values.put(CONTENT_COL, "Visi" +
                    "\n\n"+
                    "“Menjadi program studi terpercaya dan profesional yang berwawasan global untuk memenuhi kebutuhan dunia industri dan kewirausahaan berbasis ilmu pengetahuan dan teknologi dalam bidang keahlian network enterprise engineer dan software engineer pada tahun 2030.”\n" +
                    "\n\n"+
                    "Misi\n" +
                    "\n"+
                    "1. Menyelenggarakan pengajaran, penelitian, dan pengabdian kepada kewirausahaan masyarakat bidang network enterprise engineer dan software engineer yang bermutu, terpercaya dan profesional.\n" +
                    "\n"+
                    "2. Mengembangkan kemampuan dan keterampilan mahasiswa melalui berbagai kegiatan untuk memenuhi kebutuhan dunia industri dan secara berkesinambungan dalam bidang network enterprise engineer dan software engineer.\n" +
                    "\n"+
                    "3. Menyediakan sarana dan prasarana pendukung proses belajar mengajar bidang network enterprise engineer dan software engineer terkini yang tepat guna melampaui standar mutu Pendidikan Tinggi Nasional.\n" +
                    "\n"+
                    "4. Menerapkan tata kelola program studi yang efektif dan efisien melalui lingkungan kerja yang harmonis dan produktif\n" +
                    "\n"+
                    "5. Membangun kerjasama dan hubungan yang sinergis dengan seluruh pemangku kepentingan dalam bidang teknik informatika");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }

            // Insert the third mock
            values.clear();
            values.put(HEADER_COL, "Tujuan");
            values.put(CONTENT_COL, "1. Menghasilkan lulusan yang cerdas, berakhlak mulia, beretika, kompeten, dan berdaya saing tinggi serta mampu mengembangkan sains dan teknologi bidang network enterprise engineer dan software engineer, baik di tingkat nasional maupun global\n" +
                    "\n"+
                    "2. Menghasilkan penelitian unggulan dan inovasi yang mendorong pengembangan sains dan teknologi bidang network enterprise engineer dan software engineer dalam skala nasional maupun global\n" +
                    "\n"+
                    "3. Menghasilkan pengabdian kepada masyarakat sebagai hasil kegiatan pendidikan dan penelitian bidang network enterprise engineer dan software engineer dalam rangka membantu memberdayakan masyarakat agar mampu menyelesaikan masalah secara cerdas, mandiri, dan berkelanjutan\n" +
                    "\n"+
                    "4. Mewujudkan kemandirian program studi yang adaptif, kreatif, proaktif, dan berkualitas terhadap tuntutan perkembangan teknologi yang berdampak terhadap terwujudnya good university governance");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }


            values.clear();
            values.put(HEADER_COL, "Profil Lulusan");
            values.put(CONTENT_COL, "1. Software Engineer\n" +
                    "\n"+
                    "Software engineer merupakan salah satu profesi di bidang teknologi informasi. Seorang software engineer bertugas melakukan analisa, membuat rekayasa, menyusun spesifikasi, mengimplementasikan, dan memvalidasi suatu rancangan sistem perangkat lunak untuk menjawab suatu permasalahan. Dalam bahasa sederhana memiliki peran dalam pengembangan perangkat lunak untuk berbagai keperluan. Misalnya, perangkat lunak untuk pendidikan, telekomunikasi, bisnis, hiburan, dan lain-lain, termasuk perangkat lunak untuk model dan simulasi.\n" +
                    "\n"+
                    "Mengutip ekrut.com, software engineer merupakan pekerjaan yang paling dibutuhkan alias banyak dicari sepanjang 2018 sampai dengan saat ini. Bukan hanya software engineer, terjadi peningkatan jumlah perusahaan yang membuka lowongan di bidang IT, dengan rata-rata kebutuhan meningkat hingga 500%. Dilansir dari Kompas, salah satu profesi yang dihargai mahal di perusahaan e-commerce di Indonesia adalah software engineer dengan gaji Rp23.000.000,00 per bulan\n" +
                    "\n"+
                    "Seorang software engineer dapat memperoleh gaji rata-rata dengan rentang Rp5.000.000 sampai Rp8.000.000 per bulan. Bahkan, semakin lama pengalaman kerja seorang software engineer gaji yang akan diperoleh bisa semakin tinggi, yaitu sekitar Rp30.000.000 per bulan bahkan lebih.\n" +
                    "\n"+
                    "\n"+
                    "2. Network Enterprise Engineer\n" +
                    "\n"+
                    "Network enterprise engineer merupakan profesi yang memiliki kontribusi pada desain, implementasi, dan manajemen berkelanjutan dari jaringan komputer pada sebuah perusahaan. Network enterprise engineer juga melakukan analisa dan mendesain model jaringan terkait dengan kapasitas dan performa untuk meningkatkan keandalan dan ketahanan jaringan serta layanannya. Seorang network enterprise engineer memastikan kinerja jaringan pada perusahan berjalan dengan optimal.\n" +
                    "\n"+
                    "Seorang network enterprise engineer dapat memperoleh gaji rata-rata dengan rentang Rp5.000.000 sampai Rp12.000.000 per bulan. Bahkan, semakin lama pengalaman kerja seorang network enterprise engineer angka gaji bisa semakin tinggi, yaitu sekitar Rp30.000.000 per bulan.\n" +
                    "\n"+
                    "\n"+
                    "3. Technopreneur\n" +
                    "\n"+
                    "Technopreneurship adalah entrepreneurship dalam bidang teknologi di mana keahlian yang dibutuhkan tak lagi hanya wirausaha, tetapi juga pengetahuan akan teknologi mutakhir. Istilah ini bisa dibilang baru dan kian populer bersama dengan berkembangnya teknologi. Seorang technopreneurship harus memiliki kecerdasan, inovatif, suka teknologi, dan berani mengambil resiko. Istilah technopreneur dikenal bagi seorang pengusaha startup atau bisnis rintisan yang memanfaatkan teknologi sebagai basis bisnisnya.\n" +
                    "\n"+
                    "Menurut Entrepreneur, teknologi yang sedang sangat diminati dan terus diteliti adalah kecerdasan buatan, augmented reality, blockchain, the internet of things, 3D printing, big data, cloud computing, dan masih banyak lagi.\n" +
                    "\n"+
                    "Menekuni profesi technopreneur, kamu sebagai founder bisa menempati posisi Chief Executive Officer (CEO) atau executive director atau posisi lain yang relevan dengan bidang keahlianmu karena biasanya, pengembangan bisnis dengan basis teknologi ini dilakukan secara berkelompok. Keren deh pokoknya! Dengan menjadi technopreneur kamu juga bisa berkontribusi dalam mengentaskan pengangguran lho. Apalagi kalau usahamu sudah berkembang pesat, wah bisa jadi akan semakin banyak orang yang kamu rekrut.\n" +
                    "\n"+
                    "\n"+
                    "4. Studi Lanjut\n" +
                    "\n"+
                    "Memiliki kesempatan untuk melanjutkan studi ke jenjang S2 dan S3. Selain bidang-bidang profesional di atas, sarjana Teknik Informatika juga dapat bekerja di bidang lainnya. Misalnya di bidang pendidikan atau dalam bidang keilmuan dengan menjadi peneliti di lembaga-lembaga penelitian seperti di LIPI, BPPT, serta Badan Penelitian dan Pengembangan di perusahaan.\n" +
                    "\n"+
                    "Terwujudnya kerjasama yang sinergis dengan berbagai pemangku kepentingan dalam meningkatkan kualitas kegiatan Tridharma Perguruan Tinggi\n");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }


            values.clear();
            values.put(HEADER_COL, "Mengapa Harus Pilih TI UNDIRA");
            values.put(CONTENT_COL, "Teknik Informatika merupakan bidang ilmu yang mempelajari bagaimana menggunakan teknologi komputer secara optimal guna menangani masalah transformasi atau pengolahan data dengan proses logika. Di Jurusan Teknik Informatika kamu akan mempelajari berbagai prinsip terkait ilmu komputer mulai dari proses perancangan, pengembangan, pengujian, hingga evaluasi sistem operasi perangkat lunak. Selama kuliah kamu akan banyak mengkaji pemrograman dan komputasi, dan dibekali pula dengan keterampilan merancang perangkat lunak.\n" +
                    "\n"+
                    "Dengan semakin pesatnya perkembangan teknologi membuat Jurusan Teknik Informatika menjadi salah satu jurusan yang memiliki banyak peminat. Pada SBMPTN 2021, Jurusan Teknik Informatika menjadi 5 besar jurusan paling diminati di rumpun saintek. Tidaklah mengherankan, karena jenis pekerjaan menjanjikan di masa depan berhubungan erat dengan lulusan dari jurusan ini. Belum lagi, besaran penghasilan yang berpotensi didapatkan pun sangatlah besar.\n" +
                    "\n"+
                    "Indonesia saat ini kekurangan tenaga ahli di bidang sains, teknologi, engineering, dan matematika (STEM). Jumlah lulusan di bidang STEM masih belum mencukupi kebutuhan yang ada di era revolusi industri 4.0. Prodi Teknik Informatika Universitas Dian Nusantara hadir dan berkomitmen untuk memenuhi kebutuhan Industri. Pengetahuan dan keahlian yang akan diperoleh dengan kuliah di Program Studi Teknik Informatika adalah kemampuan melakukan analisis, berpikir logis, berpikir sistematis, problem solving, bekerja secara mandiri maupun tim, memahami bahasa pemrograman, rekayasa informatika dan jaringan komputer serta kreatif, tekun, teliti, dan detail.\n" +
                    "\n"+
                    "Program Studi Teknik Informatika Universitas Dian Nusantara berdiri pada tahun 2019 dan dalam 2 tahun telah mendapatkan kepercayaan dengan jumlah mahasiswa saat ini adalah 900 mahasiswa. Hal ini menjadi salah satu alasan untuk bergabung dengan kami. Program Studi Teknik Informatika memiliki sumber daya manusia (dosen) dengan kualifikasi S2 dan S3 serta memiliki sertifikasi kompetensi profesional sesuai bidang keilmuannya.\n" +
                    "\n"+
                    "Dalam proses belajar dan mengajar, Program Studi Teknik Informatika Universitas Dian Nusantara dilengkapi dengan Learning Management System (LMS) https://kuliahonline.undira.ac.id/ yang bisa diakses kapan saja dan di mana saja, serta terintegrasi ke SPADA DIKTI. Untuk beberapa mata kuliah terintegrasi dengan academy international seperti Oracle Academy, Red Hat Academy dan Huawei Academy, sehingga mahasiswa nanti akan mendapatkan sertifikat attendance course dan kesempatan untuk mendapatkan sertifikasi internasional.\n" +
                    "\n"+
                    "Program Studi Teknik Informatika Universitas Dian Nusantara memiliki kurikulum yang selalu update dan juga sudah mengimplementasikan Program MBKM https://kampusmerdeka.kemdikbud.go.id/ untuk 8 bentuk kegiatan pembelajaran yaitu pertukaran pelajar, magang atau praktek kerja, Asistensi mengajar di satuan pendidikan, penelitian atau riset, proyek kemanusiaan, kegiatan wirausaha, studi/proyek independen dan membangun desa atau kuliah kerja nyata tematik (KKNT). Untuk semester ganjil 2021/2022 telah diikuti oleh 6 mahasiswa bentuk kegiatan pembelajaran studi/proyek independen pada Dicoding - Pengembang Front-End Web dan Back-End, Dicoding - Pengembang Aplikasi Multi-Platform dan Back-End, Talent Scouting Academy - The Future of IT Infrastructure and Cyber Security Analyst : Cybersecurity Analyst.");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }

            values.clear();
            values.put(HEADER_COL, "Kurikulum");
            values.put(CONTENT_COL, "Semester 1\n" +
                    "\n"+
                    "• Kalkulus\n" +
                    "• Aplikasi Komputer\n" +
                    "• Algoritma & Pemrograman 1\n" +
                    "• Pengantar Sistem Digital\n" +
                    "• Sistem Basis Data\n" +
                    "• Bahasa Indonesia\n" +
                    "• Pancasila\n" +
                    "\n"+
                    "\n"+
                    "Semester 2\n" +
                    "\n"+
                    "• Struktur Data dan Algoritma\n" +
                    "• Algoritma & Pemrograman 2\n" +
                    "• Aljabar Linier\n" +
                    "• Pendidikan Karakter\n" +
                    "• Pengantar Organisasi Komputer\n" +
                    "• Kewirausahaan I\n" +
                    "• Perancangan Basis Data\n" +
                    "\n"+
                    "\n"+
                    "Semester 3\n" +
                    "\n"+
                    "• Kewirausahaan 2\n" +
                    "• Rekayasa Perangkat Lunak\n" +
                    "• Pemrograman Basis Data\n" +
                    "• Pendidikan Agama\n" +
                    "• Bahasa Inggris 1\n" +
                    "• Sistem Operasi\n" +
                    "• Matematika Diskrit\n" +
                    "\n"+
                    "\n"+
                    "Semester 4\n" +
                    "\n"+
                    "• Pemrograman Berorientasi Objek\n" +
                    "• Dasar Pemrograman Web\n" +
                    "• Bahasa Inggris 2\n" +
                    "• Sistem Multimedia\n" +
                    "• Interaksi Manusia-Komputer\n" +
                    "• Kewarganegaraan\n" +
                    "• Pengantar Jaringan Komputer\n" +
                    "\n"+
                    "\n"+
                    "Semester 5\n" +
                    "\n"+
                    "• Pengantar Kecerdasan Buatan\n" +
                    "• Statistika dan Probabilitas\n" +
                    "• Komputer dan Masyarakat\n" +
                    "\n"+
                    "Pilihan Software Engineer\n" +
                    "\n"+
                    "• Analisa Pengembangan Perangkat Lunak\n" +
                    "• Pemrograman Web Lanjut\n" +
                    "• Desain Web UI & UX\n" +
                    "• Basis Data Lanjut\n" +
                    "\n"+
                    "Pilihan Network Enterprise Engineer\n" +
                    "\n"+
                    "• Praktikum Pengantar Jaringan Komputer\n" +
                    "• Sistem Operasi Open Source\n" +
                    "• Cloud Computing\n" +
                    "• IT Essential\n" +
                    "\n"+
                    "\n"+
                    "Semester 6\n" +
                    "\n"+
                    "• Kerja Praktek\n" +
                    "• Penulisan Karya Ilmiah\n" +
                    "\n"+
                    "Pilihan Software Engineer\n" +
                    "\n"+
                    "• Manajemen Proyek\n" +
                    "• Pemrograman Web Full Stack\n" +
                    "• Pemrograman Android\n" +
                    "• Pengembangan Perangkat Lunak Agile\n" +
                    "\n"+
                    "Pilihan Network Enterprise Engineer\n" +
                    "\n"+
                    "• Switching dan Routing\n" +
                    "• Praktikum Switching dan Routing\n" +
                    "• Keamanan Jaringan Komputer\n" +
                    "• Jaringan Enterprise\n" +
                    "\n"+
                    "\n"+
                    "Semester 7\n" +
                    "\n"+
                    "• Metodologi Penelitian Teknologi Informasi\n" +
                    "• English Conversation\n" +
                    "\n"+
                    "Pilihan Software Engineer\n" +
                    "\n"+
                    "• Pemrograman Games\n" +
                    "• Pengenalan Big Data\n" +
                    "• Proyek Perangkat Lunak\n" +
                    "• Implementasi Proyek Perangkat Lunak\n" +
                    "• Keamanan Sistem Informasi\n" +
                    "\n"+
                    "Pilihan Network Enterprise Engineer\n" +
                    "\n"+
                    "• Internet of Things (IOT)\n" +
                    "• Jaringan VOIP\n" +
                    "• Proyek Jaringan Komputer\n" +
                    "• Implementasi Proyek Jaringan Komputer\n" +
                    "• Network Otomatisasi Scripting\n" +
                    "\n"+
                    "\n"+
                    "Semester 8\n" +
                    "\n"+
                    "• Tugas Akhir\n");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }

            values.clear();
            values.put(HEADER_COL, "Hubungi Kami");
            values.put(CONTENT_COL, "Contact us: \n" +
                    "• Email : teknikinformatika@undira.ac.id");
            result = db.insert(TABLE_NAME, null, values);
            if (result == -1) {
                Log.e("Database", "Failed to insert course into database.");
            } else {
                Log.i("Database", "Course inserted successfully.");
            }
        } catch (Exception e) {
            Log.e("Database", "Error inserting course into database: " + e.getMessage());
        }
    }

    // this method is use to add new course to our sqlite database.
    public void addMockContents() {
        // Create a variable for your SQLite database and open it for writing.
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a ContentValues object to store the values.
        ContentValues values = new ContentValues();


        // Close the database.
        if(db != null && db.isOpen()){
            db.close();
        }
    }

    public Undira getCourseById(int courseId) {
        // Create a variable for your SQLite database and open it for reading.
        SQLiteDatabase db = this.getReadableDatabase();

        // Define an array of column names to retrieve from the table.
        String[] columns = {HEADER_COL, CONTENT_COL};

        // Define the selection criteria (WHERE clause) with the course ID.
        String selection = ID_COL + " = ?";
        String[] selectionArgs = {String.valueOf(courseId)};

        // Query the table and get a cursor to iterate over the result.
        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null);

        // Create a Course object to store the retrieved values.
        Undira course = null;

        // Check if the cursor has a valid result.
        if (cursor != null && cursor.moveToFirst()) {
            // Retrieve the header and content values from the cursor.
            @SuppressLint("Range") String header = cursor.getString(cursor.getColumnIndex(HEADER_COL));
            @SuppressLint("Range") String content = cursor.getString(cursor.getColumnIndex(CONTENT_COL));

            // Create a new Course object with the retrieved values.
            course = new Undira(header, content);
        }

        // Close the cursor and the database.
        if (cursor != null) {
            cursor.close();
        }
        if(db.isOpen()){
            db.close();
        }

        // Return the retrieved Course object.
        return course;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}