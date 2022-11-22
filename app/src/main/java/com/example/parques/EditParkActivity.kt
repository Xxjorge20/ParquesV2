package com.example.parques

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parques.databinding.ActivityEditParkBinding

class EditParkActivity : ActivityWhitMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEditParkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        val Tag = "NombreParque ";
        val TagCasillas = "Casillas ";
        val TagSpinner = "Spinner ";
        */

        val miDialogo = CuadroDialogo();

        binding.Boton.setOnClickListener {

            /*
            Log.d(Tag, "el parque es: " +binding.Nombre.text + "\n")
            if (binding.DeportesCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.DeportesCheckBox.text + "\n")
            }
            if (binding.ParqueInfantilCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.ParqueInfantilCheckBox.text + "\n")
            }
            if (binding.RestauranteCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.RestauranteCheckBox.text + "\n")
            }
            if (binding.ZonaDeMascotasCheckBox.isChecked) {
                Log.d(TagCasillas, "el parque tiene casillas: " +binding.ZonaDeMascotasCheckBox.text + "\n")
            }

            Log.d(TagSpinner, "el parque Abre: " +binding.HorarioAperturaSpinner.selectedItem + "\n")
            Log.d(TagSpinner, "el parque Cierra: " +binding.HorarioCierreSpinner.selectedItem + "\n")

            */

            miDialogo.show(supportFragmentManager, "miDialogo")
        }
    }

}