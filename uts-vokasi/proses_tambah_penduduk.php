<?php
include("config.php");

$id_penduduk = $_POST['id_penduduk'];
$nama_penduduk = $_POST['nama_penduduk'];
$ttl_penduduk = $_POST['ttl_penduduk'];
$hp_penduduk = $_POST['hp_penduduk'];
$alamat_penduduk = $_POST['alamat_penduduk'];

$sql = "INSERT INTO penduduk SET id_penduduk='$id_penduduk', nama_penduduk='$nama_penduduk', ttl_penduduk='$ttl_penduduk', hp_penduduk='$hp_penduduk', alamat_penduduk='$alamat_penduduk' ";
$query = mysqli_query($db, $sql);

//apakah query update berhasil?
if ($query) {
	
} else {
	//kalau gagal tampilkan pesan
	die("Gagal menambah data...");
}

?>