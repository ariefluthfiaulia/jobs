# Panduan Penggunaan Git

## Mengunduh Repository

Unduh repository ke dalam komputer menggunakan perintah `git clone`. Url
repository dapat dilihat di dalam repository yang diinginkan.

```
git clone https://github.com/ariefluthfiaulia/jobs.git <folder tujuan>
```

#### Contoh

```
user@host:~$ git clone https://github.com/ariefluthfiaulia/jobs.git jobs
Cloning into 'jobs'...
remote: Counting objects: 4, done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 4 (delta 0), reused 4 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), done.
```

## Persiapan Database

Aplikasi ini menggunakan database mySql. Untuk dapat menjalankan aplikasi ini silahkan buat settingan databaseseperti dibawah ini:

```
Nama Database: "jobsdb"
Username: "root"
Password: [kosong]
```

Jika settingan database di local anda tidak seperti diatas silahkan edit bagian ***application.properties*** pada repo yang telan anda download, dan silahkan edit pada bagian ini:

```
spring.datasource.url= jdbc:mysql://localhost:3306/<nama database anda>
spring.datasource.username= <username database anda>
spring.datasource.password= <password database anda>
```
