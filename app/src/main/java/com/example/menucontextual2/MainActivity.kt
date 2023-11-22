package com.example.menucontextual2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menucontextual2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  Imagen = binding.imagen

        // REGISTRAMOS LA VISTA SOBRE LA QUE VA A APARECER EL MENU CONTEXTUAL:
        registerForContextMenu(Imagen)


    }
    // CREA EL MENÚ CONTEXTUAL Y LE ASIGNA SU XML
    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.menu_contextual, menu)
        menu.setHeaderTitle("Menu contextual")


    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId)
        {
            R.id.descargar ->{
                Toast.makeText(this, "Se va a descargar la imagen", Toast.LENGTH_LONG).show()
                true
            }
            R.id.compartir ->{
                Toast.makeText(this, "Se va a compartir la imagen", Toast.LENGTH_LONG).show()
                true
            }
            R.id.copiar ->{
                Toast.makeText(this, "Se va a copiar la imagen", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}