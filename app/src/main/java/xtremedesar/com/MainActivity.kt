package xtremedesar.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import xtremedesar.com.Data.Model.MonedaModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CargarFireStore()
    }

    private fun CargarFireStore() {

        val _DB = Firebase.firestore

        var _Moneda = MonedaModel("", "Balboa", "Panama", "BA")
        //var _Moneda = MonedaModel("Cordoba", "Nicaragua", "C$")
        //var _Moneda = MonedaModel("Dolar", "USA", "$")
        //var _Moneda = MonedaModel("Euro", "España", "E")

        /*
        //OBTENER REGISTRO EN TABLA
        _DB.collection("Moneda")
            .get()
            .addOnSuccessListener {
                for (_Documento in it) {
                    _Moneda = MonedaModel(
                        _Documento.id,
                        _Documento.data.get("nombre").toString(),
                        _Documento.data.get("pais").toString(),
                        _Documento.data.get("simbolo").toString()
                    )
                    Log.i(
                        "RESULTADO",
                        "Se pudo Obtener Lista de Datos => ${_Moneda}"
                    )
                }
            }
            .addOnFailureListener {
                Log.i("RESULTADO", "No se pudo Obtener Lista de Datos")
            }
        */

        /*
        //AGREGAR REGISTRO EN TABLA
        _DB.collection("Moneda")
            .add(_Moneda)
            .addOnSuccessListener {
                _Moneda.Id = it.id
                Log.i("RESULTADO", "Se pudo Agregar Dato ID => ${_Moneda}")
            }
            .addOnFailureListener {
                Log.i("RESULTADO", "No se pudo Agregar Dato")
            }
        */

        /*
        //MODIFICAR REGISTRO EN TABLA
        _DB.collection("Moneda").document("LdNs2QTPW8as0KQRAOMW")
            .set(_Moneda)
            .addOnSuccessListener {
                Log.i("RESULTADO", "Se pudo Modificar Dato")
            }
            .addOnFailureListener {
                Log.i("RESULTADO", "No se pudo Modificar Dato")
            }
        */

        /*
        //ELIMINAR REGISTRO EN TABLA
        _DB.collection("Moneda").document("Hp7iFpUy2r9BXi6L92MI")
            .delete()
            .addOnSuccessListener {
                Log.i("RESULTADO", "Se pudo Eliminar Dato")
            }
            .addOnFailureListener {
                Log.i("RESULTADO", "No se pudo Eliminar Dato")
            }
        */

    }
}