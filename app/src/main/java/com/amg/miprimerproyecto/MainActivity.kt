package com.amg.miprimerproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreEditText = findViewById<EditText>(R.id.nombreEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val aceptar = findViewById<Button>(R.id.aceptarButton)
        val cancelar = findViewById<Button>(R.id.cancelarButton)

        val contrasenha = "qwerty123"
        val nombreUsuario = "ahmed"

        //De esta forma se toma la accion de dar click en el
        //boton Aceptar
        aceptar.setOnClickListener(View.OnClickListener {
            //Aqui se toman los valores que tienen los EditText
            // en el momento que se da click al boton Aceptar
            val nombreText =  nombreEditText.text.toString()
            val passwordText = passwordEditText.text.toString()

            //Se llama a esta funcion que comprueba si los
            //datos son correctos
            comprobarDatos(nombreUsuario,contrasenha,nombreText,passwordText)

        })


    }


    fun comprobarDatos(nombreUsuario : String, contrasenha : String,
                       nombreText : String, passwordText : String){
        if (nombreText != nombreUsuario)
            Toast.makeText(this,"Nombre usuario incorrecto",
                Toast.LENGTH_LONG).show()
        else if(passwordText != contrasenha)
            Toast.makeText(this,"Contrasenha incorrecta",
                Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,"Datos introducidos correctamente!!",
                Toast.LENGTH_LONG).show()
    }

    //Funcion que recibe 2 argumentos de tipo entero
    fun sumar(numero1:Int, numero2: Int) : Int{

        //Devuelve la suma de ambos
        return numero1+numero2

    }

    //Aqui se llama a la funcion sumar
    var s = sumar(3,4)

    //La clase persona tendra dos argumentos
    //el nombre y la edad que identifican a la persona
    class Persona(var nombre : String, var edad: Int){
        //Ejemplo del uso de una funcion en una clase
        fun cumplirAnhos(){
            edad += 1
        }
    }

    //Ejemplo de uso de la clase persona
    fun prueba(){

        var ahmed = Persona("Ahmed",34)
        ahmed.cumplirAnhos()
        var edadAhmed = ahmed.edad

    }




}