package com.example.alpha_01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var usuario: EditText
    private lateinit var clave: EditText
    private lateinit var lblregistrar: TextView
    private lateinit var btnregistrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Vincular las vistas con findViewById
        usuario = findViewById(R.id.txtusuario)
        clave = findViewById(R.id.txtclave)
        lblregistrar = findViewById(R.id.lblregistrar)
        btnregistrar = findViewById(R.id.btningresar)

        // Ejemplo de acción al hacer clic en el botón
        btnregistrar.setOnClickListener {
            val user = usuario.text.toString()
            val password = clave.text.toString()
            // Aquí puedes manejar la lógica del botón
        }
    }
}