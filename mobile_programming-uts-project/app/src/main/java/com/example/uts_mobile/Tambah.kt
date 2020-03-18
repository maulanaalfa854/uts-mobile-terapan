package com.example.uts_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_tambah.*
import org.json.JSONArray

class Tambah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        btn_add.setOnClickListener {
            var data_idpenduduk = edt_id.text.toString()
            var data_namapenduduk = edt_name.text.toString()
            var data_ttlpenduduk = edt_ttl.text.toString()
            var data_hppenduduk = edt_hp.text.toString()
            var data_addresspenduduk = edt_address.text.toString()

            postkeserver(data_idpenduduk, data_namapenduduk, data_ttlpenduduk, data_hppenduduk, data_addresspenduduk)

            val intent = Intent(this@Tambah, Dashboard::class.java)
            startActivity(intent)
        }
    }

    fun postkeserver(data1:String, data2:String, data3:String, data4:String, data5:String){
        AndroidNetworking.post("http://192.168.0.15/uts-vokasi/proses_tambah_penduduk.php")
            .addBodyParameter("id_penduduk", data1)
            .addBodyParameter("nama_penduduk", data2)
            .addBodyParameter("ttl_penduduk", data3)
            .addBodyParameter("hp_penduduk", data4)
            .addBodyParameter("alamat_penduduk", data5)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray) {
                }

                override fun onError(anError: ANError) {
                }
            })
    }
}

